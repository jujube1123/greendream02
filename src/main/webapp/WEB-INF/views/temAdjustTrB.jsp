<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/temAdjust.css">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>

<body>
<form action="adtemTrB" id="adform">
   <div class="wrapper" >
		<header>
			<h2>기준온도 조절</h2>
			 <p>-40°C ~ 80°C 까지 측정 가능</p>
		</header>
		<div class="price-input">
			<div class="field">
				<span>Min</span>
				<input type="number" value="${adtTrB.mintem}" class="min-input" name="mintem">
			</div>
			<div class="seperator">~</div>
			<div class="field">
				<span>Max</span>
				<input type="number" value="${adtTrB.maxtem}" class="max-input" name="maxtem">
			</div>
		</div>
	<!-- <div class="mm">
  			<span class="min">-40°C</span>
  			<span class="max">80°C</span>
  		</div> -->
  		<div class="slider">
  			<div class="progress"></div>
  			
  		</div>
  	
  		<div class="range-input">
  			<input type="range" min="-40"
			max="80" value="${adtTrB.mintem}" class="min-range"> 			
  			<input type="range" min="-40"
			max="80" value="${adtTrB.maxtem}" class="max-range"> 			
			
  		</div>
   </div>
   <input type="submit" value="적용" style=" cursor: pointer" id="adsubmit" >
   <input type="button" value="취소" style=" cursor: pointer" onclick="javascript:self.close();">
 </form>  

<script type="text/javascript" src="/resources/js/temAdjust.js"></script>
</body>
</html>