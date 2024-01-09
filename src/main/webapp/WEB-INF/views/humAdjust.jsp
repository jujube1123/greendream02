<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/humAdjust.css">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
</head>

<body>
<form action="adhum" id="adform">
   <div class="wrapper">
		<header>
			<h2>기준습도 조절</h2>
			 <p>0% ~ 100% 까지 측정 가능</p>
		</header>
		<div class="price-input">
			<div class="field">
				<span>Min</span>
				<input type="number" value="0" class="min-input" name="minhum">
			</div>
			<div class="seperator">~</div>
			<div class="field">
				<span>Max</span>
				<input type="number" value="100" class="max-input" name="maxhum">
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
  			<input type="range" min="0"
			max="100" value="0" class="min-range"> 			
  			<input type="range" min="0"
			max="100" value="100" class="max-range"> 			
			
  		</div>
   </div>
   <input type="submit" value="적용" style=" cursor: pointer" id="adsubmit" >
   <input type="button" value="취소" style=" cursor: pointer" onclick="javascript:self.close();">
 </form>  
<script type="text/javascript" src="/resources/js/humAdjust.js"></script>
</body>
</html>