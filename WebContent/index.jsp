<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="js/validCheck.js"></script>
<script type="text/javascript" src="js/check.js"></script>
<script type="text/javascript" src="js/info.js"></script>
<script type="text/javascript" src="js/go.js"></script>
<link rel="stylesheet" href="css/index.css">
<link rel="stylesheet" href="css/weather.css">
<link rel="stylesheet" href="css/location.css">
<link rel="stylesheet" href="css/coffee.css">
</head>

<c:choose>
	<c:when test='${r != null }'>
		<body onload="showAlert('${r }');">
	</c:when>
	<c:otherwise>
		<body>		
	</c:otherwise>
</c:choose>
	<table id="siteTitleArea">
		<tr>
			<td><a href="HomeController">&nbsp;&nbsp;Minjung Kang's Website</a></td>
		</tr>
	</table>
	<table id="siteContentArea">
		<tr>
			<td align="center"><jsp:include page="${contentPage }"></jsp:include>
			</td>
		</tr>
	</table>
	<table id="siteMenuArea">
		<tr>
			<td align="center"><a href="WeatherController">Weather</a></td>
		</tr>
		<tr>
			<td align="center"><a href="LocController">Search for Places</a></td>
		</tr>
		<tr>
			<td align="center"><a href="LottoController">Create Lotto</a></td>
		</tr>
		<tr>
			<td align="center"><a href="G2Controller">Stars</a></td>
		</tr>
		<tr>
			<td align="center"><a href="G3Controller">Ball</a></td>
		</tr>
	</table>
</body>
</html>