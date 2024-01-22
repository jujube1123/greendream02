import RPi.GPIO as GPIO

import decimal


import smtplib
from email.mime.text import MIMEText

#라즈베리에 dht22의 정보를 받아오는 별명이 dht인 값 입니다.
import Adafruit_DHT as dht
#시간을 사용해서 sleep에 사용자가 입력이 가능한 변수로 만들어줍니다.
from time import sleep
#현재시각을 가져오는 함수 입니다.
from datetime import datetime
#mysql을 연결 해주는 라이브러리 pymysql 입니다.
import pymysql as ps
#핀번호입니다.
DHT = 4

green_pin = 26
GPIO.setwarnings(False)
GPIO.setmode(GPIO.BCM)
GPIO.setup(green_pin, GPIO.OUT)
#GPIO.setup(18,GPIO.out)
p = GPIO.PWM(26,100)
Frq = [111, 232, 333, 454, 577, 601, 777]


# 메일 보내는 함수
def warnMail():
    # (*)보낼 메일의 내용과 제목
    content = 'warnning'
    title = 'warnning'

    msg = MIMEText(content)
    msg['Subject'] = title

    # (*)메일의 발신자 메일 주소, 수신자 메일 주소, 앱비밀번호(발신자) 
    sender = 'wndudnw30@gmail.com'
    receiver = 'hs_1123@naver.com'
    app_password = 'tvbcsndznkvidosf'


    # 세션 생성
    with smtplib.SMTP('smtp.gmail.com', 587) as server:
        # TLS 암호화
        server.starttls()

        # 로그인 인증과 메일 보내기
        server.login(sender, app_password)
        server.sendmail(sender, receiver, msg.as_string())


while True:
    #mysql 연결
    conn = ps.connect(
        user='root',
        passwd='1234',
        host='localhost',
        db='mydb',
        charset='utf8'
    )       
    #데이터 값
    humDB, temDB = dht.read_retry(dht.DHT22, DHT)
        
    #python 터미널에 나타내주는 값
    print ("{:%Y-%M-%m %p %h:%i}".format(datetime.now()) + "Humidity = {0:0.1f}% Temp = {1:0.1f} c".format(humDB, temDB))
            
    #mysql 연결
    cursor = conn.cursor()
        
    #mysql에 dht 테이블에 들어가는 입력값을 연결하는 명령 문입니다. 그것을 stl이라는 변수에 담았습니다.
    stl = "insert into dhtTrB(hdb,tdb,dtim) value(%s,%s,%s)"

    #21번줄에 있는 DHT22에서 받아오는 데이터 값을 나열 합니다. 그것을 val이라는 변수에 담았습니다.
    val= (humDB, temDB, "{:%Y-%m-%d %R}".format(datetime.now()))

    #위에 선언한 cursor에 execut(연결하는 다리라고 생각하시면 됩니다)에 들어갈 위의 변수들을 넣어주었습니다.
    cursor.execute(stl,val)

    #변수 val의 입력값을 나타나게 해줍니다.
    print (val)

    #기준온도 기준습도 설정 가져오기
    temAd = "select * from temAdjustTrB"
    humAd = "select * from humAdjustTrB"
   

    #위에 선언한 cursor에 execut(연결하는 다리라고 생각하시면 됩니다)에 들어갈 위의 변수들을 넣어주었습니다.
    temAdju = cursor.execute(temAd)
    temAdjust = cursor.fetchall()

    humAdju = cursor.execute(humAd)
    humAdjust = cursor.fetchall()
   
    print("기준온도")
    mintem = temAdjust[0][0]
    maxtem = temAdjust[0][1]
    print(mintem)
    print(maxtem)
    print("기준습도")
    minhum = humAdjust[0][0]
    maxhum = humAdjust[0][1]
    print(minhum)
    print(maxhum)
    

    #mysql에 연결되어 있는 conn에 commit을 해줍니다.
    conn.commit()

    #습도 제한
    if humDB < mintem or humDB > maxtem:
        p.start(10)
        GPIO.output(green_pin,1)
        warnMail()
    else:
        GPIO.output(green_pin,0)

    #온도 제한
    if temDB < minhum or temDB > maxhum:
        p.start(10)
        GPIO.output(green_pin,1)
        warnMail()
    else:
        GPIO.output(green_pin,0)
        
    #5초에 한번씩 받아옵니다.
    sleep(2)
    #mysql의 연결을 끊습니다.
    conn.close()
  