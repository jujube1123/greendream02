<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resources/css/homcss.css">
<link href="https://fonts.googleapis.com/css2?family=Sunflower:wght@300&display= swap" rel="stylesheet">
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@500&display=swap" rel="stylesheet">
		<title>관리자로그인페이지</title>
</head>
<body>
<form action ="/main" method="POST">
	<div id="containerlogin">
		<div id="containerbox01">
			<div id="containerboxid">
				<span>아이디</span>
				<input type="text"  name="username" id="username" placeholder="아이디를 입력해주세요.">
				<c:if test="${empty msg ? true : false}" var="result">
            	<h2><c:out value="${msg}" /></h2>
            </c:if>
			</div>	
			<div id="containerboxpw">	
				<span>비밀번호</span>
				<input type="password" name="password" id="password" placeholder="비밀번호를 입력해주세요.">
				<input type="submit" value="로그인" id="loginbtn" style=" font-family: 'Noto Sans KR'; color: #393e52; font-weight:700; background: #fff; border: 1px solid rgba(0,0,0,1);" >
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			</div>	
		</div>	
	</div>
</form>	
</body>
</html>
	<!-- 셀렉트값들 
	<c:forEach items="${dth}" var="on">
	<table border="1">
	<tr>
	<td><div>습도</div>${on.hdb}
	<td><div>온도</div>${on.tdb}
	<td><div>시간</div>${on.dtim}
	</td>
	</tr>
	</table>
	</c:forEach>
	<table>
	<tr><tr>
	<td>최저</td>
	<td>최고</td>
	<td>평균</td>
	</tr></tr>
	</table>-->


	<!--  
2초마다 새로고침 
	<script>
	setTimeout("history.go();", 2000)
	</script>
	-->