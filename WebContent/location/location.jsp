<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h3>Search for places in Seoul</h3>
	<h3>For example, look for "cafe" or "restaurant"</h3>
	
	<form action="LocController" method="post">
		<input name="what" id="locSearchInput" autocomplete="off" autofocus="autofocus">
		<button id="locSearchBtn">Search</button>
	</form>
	
	<c:forEach var="l" items="${locs }">
		<table class="l">
			<tr>
				<td class="lName">Name: ${l.name }</td>
			</tr>
			<tr>
				<td>Address: ${l.address }</td>
			</tr>
			<tr>
				<td align="right">Phone: ${l.phone }</td>
			</tr>
			<tr>
				<td align="right">Distance: ${l.distance }m</td>
			</tr>
		</table>
	</c:forEach>
	<h3>(Results are in Korean)</h3>
</body>
</html>