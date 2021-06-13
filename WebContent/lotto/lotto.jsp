<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<c:forEach var="l" items="${lotto }">
			<img src="img/ball/ball_${l }.png">
	</c:forEach>
	<form action="LottoController" method="get">
		<button id="lottoBtn">Click Again!</button>
	</form>
</body>
</html>