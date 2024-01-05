<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	/* header 부분 */
	#bar{
		display: flex;
		width: 100%;
		height: 50px;
		background-color: #2f3243;
    	margin: 0;
   	 	align-items: center;
 		justify-content: space-between;
	}
	#gdi{
	  	position: relative;
		font-size: 20px;
		left:10px;
		color:white;
/* 		color:#1DDB16; */

	}
	#title{	
    	position: relative;

		font-size: 22px;
		
		color: white;
	
	}
	#admin{
		position: relative;
		right:20px;
    	flex:none;
		font-size: 20px;
		color: white;

	}
	/* 여기까지 header */
	/* 장소 정보 */
	#room{
		display: flex;
		position: relative;
		top: 30px;
		left: 20px;
		color:white;
		margin: 0;
		align-items: center;
		height: 50px;
	}
	#roomName{
		font-size: 20px;
		background-color:#3b3d54;
	}

	#roomTem{
		position: relative;
		left:10px;
		font-size: 20px;
		background-color:#3b3d54;
		border-radius: 0;
	}
	#roomHum{
		font-size: 20px;
		position: relative;
		left:20px;
		background-color:#3b3d54;
		
	}
	/* 실시간 정보 및 날씨 */
	#realtime{
		display: flex;
		position: relative;
		top: 80px;
		left: 20px;
		justify-content: space-around;
	}
	#realtimeTem{
		position: relative;
		background-color: pink;
		width: 300px;
		height: 160px;
		border-radius: 10px;
	}
	#realtimeHum{
		
		background-color: magenta;
		width: 300px;
		height: 160px;
		border-radius: 10px;
	}
	#weather{
		width: 300px;
		position: relative;
		background-color:blue;
		height: 160px;
		border-radius: 10px;
	}
	#temName{
		font-size: 20px;
		position: relative;
		left:4px;
		top:4px;
	}
	#temData{
		position: relative;
		left: 110px;
		top: 20px;
		font-size: 40px;
	}
	#temDate{
		position: relative;
		left: 150px;
		top: 46px;
		font-size: 14px;
		
	}
	#humName{
		font-size: 20px;
		position: relative;
		left:4px;
		top:4px;
	}
	#humData{
		position: relative;
		left: 110px;
		top: 20px;
		font-size: 40px;
	}
	#humDate{
		position: relative;
		left: 150px;
		top: 46px;
		font-size: 14px;
	}
	#weatherName{
		font-size: 20px;
		position: relative;
		left:4px;
		top:4px;
	}
	/* 실시간 그래프 */
	#graph{
		position: relative;
		display: flex;
		background-color: gray;
		height: 400px;
		top: 120px;
	}
	#graphTem{
	
	}
	#graphHum{
		
	}
	#detail{
		position: relative;
		display: flex;
		background-color: pink;
		height: 80px;
		top: 150px;
		justify-content: space-around;
		align-items: center;
	}
	#temDetail{
		display: flex;
		justify-content: space-around;
		
		width:900px;
	}
	#humDetail{
		display: flex;
		justify-content: space-around;
		
		width:900px;
	}
	#highTem{
		background-color: blue;
		position: relative;
		width: 160px;
		height: 50px;
		border-radius: 10px;
	}
	#lowTem{
		background-color: red;
		position: relative;
		width: 160px;
		height: 50px;
		border-radius: 10px;
	}
	#averageTem{
		background-color: ivory;
		position: relative;
		width: 160px;
		height: 50px;
		border-radius: 10px;
	}
	#highHum{
		background-color: blue;
		position: relative;
		width: 160px;
		height: 50px;
		border-radius: 10px;
	}
	#lowHum{
		background-color: red;
		position: relative;
		width: 160px;
		height: 50px;
		border-radius: 10px;
	}
	#averageHum{
		background-color: ivory;
		position: relative;
		width: 160px;
		height: 50px;
		border-radius: 10px;
	}
	#ht{
		position: relative;
		top: 12px;
		left: 40px;
		
	}
	#lt{
		position: relative;
		top: 12px;
		left: 40px;
	}
	#at{
		position: relative;
		top: 12px;
		left: 40px;
	}
	#hh{
		position: relative;
		top: 12px;
		left: 40px;
	}
	#lh{
		position: relative;
		top: 12px;
		left: 40px;
	}
	#ah{
		position: relative;
		top: 12px;
		left: 40px;
	}
	
</style>
<title>GreenDreamIoT</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
	<div id="bar">
	   <div id="gdi">GreenDream IoT</div>	 
	   <div id="title">병원 온도,습도 실시간 모니터링</div>		
	   <div id='admin'>관리자 이름,이메일 로그아웃</div>
	</div>
 	<!--  여기까지 header -->
	<div id="room">
		<div id="roomName">
		수술실A
		</div>
		<div id="roomTem">
		기준 온도: 25~30°C
		</div>
		<div id="roomHum">
		기준 습도: 40~50%
		</div>
	</div>
	
	<div id="realtime">
		<div id="realtimeTem">
		<div id="temName">실시간 온도</div>
		<div id="temData">${dth[0].tdb}°C</div>
		<div id="temDate">${dth[0].dtim} 기준</div>
		</div>
		<div id="realtimeHum">
		<div id="humName">실시간 습도</div>
		<div id="humData">${dth[0].hdb}%</div>
		<div id="humDate">${dth[0].dtim} 기준</div>
		</div>
		<div id="weather">
		<div id="weatherName">현재날씨</div>
		</div>
	</div>
	
	<div id="graph">
		<div id="graphTem"></div>
		<div id="graphHum"></div>
	</div>
	
	<div id='detail'>
		<div id="temDetail">
			<div id="highTem"><span id="ht">최고: 20°C</span></div>
			<div id="lowTem"><span id="lt">최저: 12°C</span></div>
			<div id="averageTem"><span id="at">평균: 17°C</span></div>	
		</div>	
		<div id="humDetail">
			<div id="highHum"><span id="hh">최고: 45%</span></div>
			<div id="lowHum"><span id="lh">최저: 39%</span></div>
			<div id="averageHum"><span id="ah">평균: 40%</span></div>	
		</div>
	</div>
<script>
	setTimeout("history.go();", 2000)
</script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>