<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Sunflower:wght@300;500;700;&display= swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;600;700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="/resources/css/opA.css">
<title>GreenDreamIoT</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="all">
 	<!--  여기까지 header -->
	<div id="room">
		<div id="roomName">
			<select title="" onchange="window.open(value,'_self');" id="sel">
			   	<option value="main" >전체보기</option>
			   	<option value="opA" selected>수술실A</option>
			   	<option value="opB">수술실B</option>
			   	<option value="opC">수술실C</option>
			   	<option value="inA">중환자실A</option>
			   	<option value="inB">중환자실B</option>
			   	<option value="inC">중환자실C</option>
			   	<option value="trA">진료실A</option>
			   	<option value="trB">진료실B</option>
			   	<option value="trC">진료실C</option>
			</select>
		</div>
		<div id="roomTem" style=" cursor: pointer" onclick="temAd()">
		기준 온도: ${adt.mintem}°C~${adt.maxtem}°C
		</div>
		<div id="roomHum" style=" cursor: pointer" onclick="humAd()">
		기준 습도: ${adh.minhum}%~${adh.maxhum}%
		</div>
	</div>
	
	<div id="realtime">
		<div id="realtimeTem">
		<div class="name" id="temName">실시간 온도</div>
		<div class="data" id="temData">${dth[0].tdb}°C</div>
		<div class="date" id="temDate">${dth[0].dtim} 기준</div>
		</div>
		<div id="realtimeHum">
		<div class="name">실시간 습도</div>
		<div class="data"id="humData">${dth[0].hdb}%</div>
		<div class="date"id="humDate">${dth[0].dtim} 기준</div>
		</div>
		<div id="weather">
		<div class="name" id="weatherName">현재날씨</div>
		</div>
	</div>
	
	<div id="graph">
		<div id="graphTem"></div>
		<div id="graphHum"></div>
	</div>
	
	<div id='detail'>
		<div id="temDetail">
			<div id="highTem"><span id="ht">최고: ${highTem[0].tdb}°C</span></div>
			<div id="lowTem"><span id="lt">최저: ${lowTem[0].tdb}°C</span></div>
			<div id="averageTem"><span id="at">평균: ${averageTem}°C</span></div>	
		</div>	
		<div id="humDetail">
			<div id="highHum"><span id="hh">최고: ${highHum[0].hdb}%</span></div>
			<div id="lowHum"><span id="lh">최저: ${lowHum[0].hdb}%</span></div>
			<div id="averageHum"><span id="ah">평균: ${averageHum}%</span></div>	
		</div>
	</div>

<!-- <script>
	setTimeout("history.go();", 10000)
</script> -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>

</div>
<script type="text/javascript" src="/resources/js/opA.js"></script>
</body>
</html>