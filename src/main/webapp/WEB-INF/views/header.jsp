<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
#bar{
		display: flex;
		width: 100%;
		height: 50px;
		background-color: #2f3243;
    	margin: 0;
   	 	align-items: center;
 		justify-content: space-between;
 		color: #FEFEFE; 
 		font-weight: 600;
 		font-family: 'Sunflower';
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
	
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>

<div id="bar">
	   <div id="gdi">GreenDream IoT</div>	 
	   <div id="title">병원 온도,습도 실시간 모니터링</div>		
	   <div id='admin'>관리자 이름,이메일 로그아웃</div>
	</div>






<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm" crossorigin="anonymous"></script>
</body>
</html>