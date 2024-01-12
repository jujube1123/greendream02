<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/room.css">
<title>GreenDreamIoT</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/chart.js@3.0.0/dist/chart.min.js"></script>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="all">
 	<!--  여기까지 header -->
	<div id="room">
		<div id="roomName">
			<select title="" onchange="window.open(value,'_self');" id="sel">
			   	<option value="main" >전체보기</option>
			   	<option value="opA">수술실A</option>
			   	<option value="opB">수술실B</option>
			   	<option value="opC">수술실C</option>
			   	<option value="inA">중환자실A</option>
			   	<option value="inB" selected>중환자실B</option>
			   	<option value="inC">중환자실C</option>
			   	<option value="trA">진료실A</option>
			   	<option value="trB">진료실B</option>
			   	<option value="trC">진료실C</option>
			</select>
		</div>
		<div id="roomTem" style=" cursor: pointer" onclick="temAd()">
		기준 온도: ${adtInB.mintem}°C~${adtInB.maxtem}°C
		</div>
		<div id="roomHum" style=" cursor: pointer" onclick="humAd()">
		기준 습도: ${adhInB.minhum}%~${adhInB.maxhum}%
		</div>
	</div>
	
	<div id="realtime">
		<div id="realtimeTem">
		<div class="name" id="temName">실시간 온도</div>
		<div class="data" id="temData">${dthInB[0].tdb}°C</div>
		<div class="date" id="temDate">${dthInB[0].dtim} 기준</div>
		</div>
		<div id="realtimeHum">
		<div class="name">실시간 습도</div>
		<div class="data"id="humData">${dthInB[0].hdb}%</div>
		<div class="date"id="humDate">${dthInB[0].dtim} 기준</div>
		</div>
		<div id="weather">
		<div class="name" id="weatherName">현재날씨</div>
		<div id="weatherData">
			<span>날씨 :</span>
			<span id="icon"></span>
			<span id="wathe"></span>
			<span>일평균 기온 :</span>
			<span id="temp"></span>
			<span>일평균 습도 :</span>
			<span id="humidity"></span>
	<!-- 	<span id="wind"></span>
			<span id="temp_min"></span> -->
		</div>
		<%-- <div class="date" id="temDate">${dth[0].dtim} 기준</div> --%>
		</div>
	</div>
	
	<div id="graph">
		<div id="graphTem"><canvas id="line-chart" width="0" height="0"></canvas></div>
		<div id="graphHum"><canvas id="line-chart02" width="0" height="0"></canvas></div>
	</div>
	
	<div id='detail'>
		<div id="temDetail">
			<div id="highTem"><span id="ht">최고: ${highTemInB[0].tdb}°C</span></div>
			<div id="lowTem"><span id="lt">최저: ${lowTemInB[0].tdb}°C</span></div>
			<div id="averageTem"><span id="at">평균: ${averageTemInB}°C</span></div>	
		</div>	
		<div id="humDetail">
			<div id="highHum"><span id="hh">최고: ${highHumInB[0].hdb}%</span></div>
			<div id="lowHum"><span id="lh">최저: ${lowHumInB[0].hdb}%</span></div>
			<div id="averageHum"><span id="ah">평균: ${averageHumInB}%</span></div>	
		</div>
	</div>

<!-- <script>
	setTimeout("history.go();", 10000)
</script> -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</div>
<script type="text/javascript" src="/resources/js/inB.js"></script>
<script type="text/javascript" src="/resources/js/humChartsInB.js"></script>
<script type="text/javascript" src="resources/js/temChartsInB.js"></script>
</body>
</html>