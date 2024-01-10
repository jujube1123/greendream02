<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<head>

	<title>Home</title>
</head>
<body>
	<!-- 가장 최근의 셀렉트값 -->
	${dth[0]}


	<table>
		<tr>
			<td>현재 시간 ${dth[0].dtim}</td>
			<td>현재 습도 ${dth[0].hdb}</td>
			<td>현재 온도 ${dth[0].tdb}</td>
		</tr>
	</table>

	<table id="weather">
        <thead>
            <td>지역</td>
            <td>날씨</td>
            <td>온도</td>
            <td>습도</td>
            <td>풍향/풍속</td>
            <td>체감온도</td>
        </thead>
        <tbody>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
            <td></td>
        </tbody>
    </table>
    
   <div id="admin">로그인</div>
    
   <script src="/resources/js/K_test.js" type="module"></script>
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
</body>


</html>
