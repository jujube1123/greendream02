// 기준 온도 조절 버튼
function temAd(){
    var url = "temAdjustTrA";
    var name = "popup test";
    var option = "width = 500, height = 500, top = 100, left = 200, location = no"
    window.open(url, name, option);
}
// 기준 습도 조절 버튼
function humAd(){
	var url = "humAdjustTrA";
	var name = "popup test2";
	var option = "width = 500, height = 500, top = 100, left = 200, location = no"
		window.open(url, name, option);
}

// openweather api의 키 값입니다.
const API_KEY = '70447c588d71afabe3d6675d78565c20'
// 도시 입니다.
const city = document.querySelector('#weather tbody td:first-child')
// 날씨 입니다.
const weather = document.querySelector('#wathe')
// 온도 
const temp = document.querySelector('#temp')
// 습도
const humidity = document.querySelector('#humidity')
// 풍향
const wind = document.querySelector('#wind')
// 체감온도
const temp_min = document.querySelector('#temp_min')

// 풍속에 계산식 입니다
const degToCompass = (num) => {
const val = Math.floor((num / 22.5) + 0.5);
const arr = ['북', '북북동', '동북동', '동동북', '동', '동동남', '남동', '남남동', '남', '남남서', '서남서', '서서남', '서', '서북서', '북서', '북북서'];
return arr[(val % 16)];
};

// 현재위치를 계산하는 식안에  openweather 값들이 들어가 있습니다.
const callbackOk = (position) =>{
const lat = position.coords.latitude // 위도
const lon = position.coords.longitude // 경도
const lang = 'kr' // 언어
const units = 'metric' // 섭씨
console.log(`현재 위도 및 경도 : ${lat}, ${lon}`)
const url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&lang=${lang}&humidity=${humidity}&temp_min=${temp_min}&appid=${API_KEY}&units=${units}`
	
	fetch(url)
    .then(response => response.json())
    .then(data=>{
        // 풍속계산식이 완료된 변수들 입니다.
        const temperature = Math.round(data.main.temp)
        const windDirection = degToCompass(data.wind.deg)
        // 아래부터 차례로 #weather에 들어갈 값들 입니다.
        /*city.innerText = data.name*/
        wathe.innerText = data.weather[0].description;
        const weatherIcon= data.weather[0].icon;
        const weatherIconAdrs = `http://openweathermap.org/img/wn/${weatherIcon}@2x.png`;
        
        temp.innerText = `${temperature}ºC`
        humidity.innerText = `${data.main.humidity}%`
        icon.setAttribute('src', weatherIconAdrs);
     /*   wind.innerText = `${windDirection} ${data.wind.speed} m/s` */           
/*        temp_min.innerText = `${data.main.temp_min}ºC`
        temp_max.innerText = `${data.main.temp_max}ºC`*/
/*        	city.innerText = data.name
        	weather.innerText = data.weather[0].description
        	temp.innerText = `${temperature}ºC`
        		humidity.innerText = `${data.main.humidity}%`
        			wind.innerText = `${windDirection} ${data.wind.speed} m/s`            
        				temp_min.innerText = `${data.main.temp_min}ºC`
        					temp_max.innerText = `${data.main.temp_max}ºC`
*/    })	
}

const callbackError= () =>{
    alert("위치정보를 찾을 수 없습니다.")
}
navigator.geolocation.getCurrentPosition(callbackOk, callbackError) 