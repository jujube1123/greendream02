<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Sunflower:wght@300;500;700;&display= swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;600;700&display=swap" rel="stylesheet">

<link rel="stylesheet" href="/resources/css/main.css">
<meta charset="UTF-8">
<title>GreenDreamIoTMain</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<div id="all">
	<div id="room">
		<div id="roomName">
			<select title="" onchange="window.open(value,'_self');" id="sel">
			   	<option value="main" selected>전체보기</option>
			   	<option value="opA" >수술실A</option>
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
	</div>
	
	<div id="row1" >
		<div class="A" style=" cursor: pointer" onclick="location.href='opA'">
		<div class="name">수술실A</div>
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>
		<div class="B" style=" cursor: pointer" onclick="location.href='opB'">
		<div class="name">수술실B</div>
		<div class="data">${dthOpB[0].tdb}°C | ${dthOpB[0].hdb}%</div>
		<div class="date">${dthOpB[0].dtim} 기준</div>
		</div>
		<div class="C" style=" cursor: pointer" onclick="location.href='opC'">
		<div class="name">수술실C</div>
		<div class="data">${dthOpC[0].tdb}°C | ${dthOpC[0].hdb}%</div>
		<div class="date">${dthOpC[0].dtim} 기준</div>
		</div>	
	</div>
	<div id="row2">
		<div class="A" style=" cursor: pointer" onclick="location.href='inA'">
		<div class="name">중환자실A</div>
		<div class="data">${dthInA[0].tdb}°C | ${dthInA[0].hdb}%</div>
		<div class="date">${dthInA[0].dtim} 기준</div>
		</div>
		<div class="B" style=" cursor: pointer" onclick="location.href='inB'">
		<div class="name">중환자실B</div>
		<div class="data">${dthInB[0].tdb}°C | ${dthInB[0].hdb}%</div>
		<div class="date">${dthInB[0].dtim} 기준</div>
		</div>
		<div class="C" style=" cursor: pointer" onclick="location.href='inC'">
		<div class="name">중환자실C</div>
		<div class="data">${dthInC[0].tdb}°C | ${dthInC[0].hdb}%</div>
		<div class="date">${dthInC[0].dtim} 기준</div>
		</div>	
	</div>
	<div id="row3">
		<div class="A" style=" cursor: pointer" onclick="location.href='trA'">
		<div class="name">진료실A</div>
		<div class="data">${dthTrA[0].tdb}°C | ${dthTrA[0].hdb}%</div>
		<div class="date">${dthTrA[0].dtim} 기준</div>
		</div>
		<div class="B" style=" cursor: pointer" onclick="location.href='trB'">
		<div class="name">진료실B</div>
		<div class="data">${dthTrB[0].tdb}°C | ${dthTrB[0].hdb}%</div>
		<div class="date">${dthTrB[0].dtim} 기준</div>
		</div>
		<div class="C" style=" cursor: pointer" onclick="location.href='trC'">
		<div class="name">진료실C</div>
		<div class="data">${dthTrC[0].tdb}°C | ${dthTrC[0].hdb}%</div>
		<div class="date">${dthTrC[0].dtim} 기준</div>
		</div>	
	</div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>