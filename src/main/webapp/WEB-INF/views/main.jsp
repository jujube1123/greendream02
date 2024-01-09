<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://fonts.googleapis.com/css2?family=Sunflower:wght@300;500;700;&display= swap" rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@300;400;500;600;700&display=swap" rel="stylesheet">
<style type="text/css">
	* {
		font-family: 'Sunflower';
	}
	#all{
		 background-color: #2a2c39;
		 width: 100%;
		 height: 869px;
		
	}
	#room{
		width: 100%;
		display: flex;
		position: relative;
		top: 30px;
		color:white;
		margin: 0;
		align-items: center;
		height: 50px;
		font-weight: 500;
	}
	#roomName{
		font-size: 20px;
		position: relative;
		left:30px;
		background-color:#393e52;
		border-radius: 8px;
	}
	#sel{
		background-color:#393e52;
		color:white;
		width: 250px;
		border-radius: 8px;
	}
	#row1{
		display: flex;
		position: relative;
		top: 80px;
		justify-content: space-around;
		font-weight: 400;
	}
	#row2{
		display: flex;
		position: relative;
		top: 140px;
		justify-content: space-around;
		font-weight: 400;
	}
	#row3{
		display: flex;
		position: relative;
		top: 200px;
		justify-content: space-around;
		font-weight: 400;
	}
	.A{
		position: relative;
		background-color: #393e52;
		box-shadow: 3px 3px 2px 2px rgba(0,0,0,0.3);
		width: 400px;
		height: 160px;
		border-radius: 10px;
		color: #FEFEFE; 
		
	}
	.B{
		background-color: #393e52;
		box-shadow: 3px 3px 2px 2px rgba(0,0,0,0.3);
		width: 400px;
		height: 160px;
		border-radius: 10px;
		color: #FEFEFE; 
		
	}
	.C{
		background-color: #393e52;
		box-shadow: 3px 3px 2px 2px rgba(0,0,0,0.3);
		width: 400px;
		position: relative;
		height: 160px;
		border-radius: 10px;
		color: #FEFEFE; 
	}
	.name{
		font-size: 20px;
		position: relative;
		width:170px;
		left:10px;
		top:8px;
	}
	.data{
		position: relative;
		left: 80px;
		top: 20px;
		width:270px;
		font-size: 40px;
	}
	.date{
		position: relative;
		left:245px;
		top: 46px;
		font-size: 14px;
		width: 150px;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
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
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>
		<div class="C" style=" cursor: pointer" onclick="location.href='opC'">
		<div class="name">수술실B</div>
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>	
	</div>
	<div id="row2">
		<div class="A" style=" cursor: pointer" onclick="location.href='inA'">
		<div class="name">중환자실A</div>
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>
		<div class="B" style=" cursor: pointer" onclick="location.href='inB'">
		<div class="name">중환자실B</div>
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>
		<div class="C" style=" cursor: pointer" onclick="location.href='inC'">
		<div class="name">중환자실C</div>
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>	
	</div>
	<div id="row3">
		<div class="A" style=" cursor: pointer" onclick="location.href='trA'">
		<div class="name">진료실A</div>
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>
		<div class="B" style=" cursor: pointer" onclick="location.href='trB'">
		<div class="name">진료실B</div>
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>
		<div class="C" style=" cursor: pointer" onclick="location.href='trC'">
		<div class="name">진료실C</div>
		<div class="data">${dth[0].tdb}°C | ${dth[0].hdb}%</div>
		<div class="date">${dth[0].dtim} 기준</div>
		</div>	
	</div>
</div>


<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>