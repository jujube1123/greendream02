<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#bar{
		
		width: 100%;
		height: 50px;
		background-color: #2f3243;
    	margin: 0;
   	 	align-items: center;
 		/* display: table; */
 		color: #FEFEFE; 
 		font-weight: 600;
 		font-family: 'Sunflower';
	}
	#gdi{
	  	position: relative;
		font-size: 20px;
		left:10px;
		color:white;
		top: 8px;
		
	}
	#title{	
    	position: relative;
		margin: auto;
		font-size: 22px;
		top: 8px;
		color: white;
		text-align: center;
		/* display: table-cell;
		vertical-align: middle; */
		 left: 640px; 
	}
	#adminbtn{
		color: white;
		float: right;
	    padding-top: 10px;
	}
	
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

<div id="bar">
	   <span id="gdi" class="text" style=" cursor: pointer" onclick="location.href='main'">GreenDream IoT</span>	 
	   <span id="title" class="text">병원 온도,습도 실시간 모니터링</span>	
	 <div id="adminbtn">  	
	   <span id="admin" class="text">admin<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" /></span>
	   <span style="cursor: pointer" onclick="location.href='home'">로그아웃</span>
	 </div>  
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>