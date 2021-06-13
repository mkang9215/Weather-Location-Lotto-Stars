<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
body {
	background-color: rgb(10, 10, 10); // 0 ~ 255
}
</style>
<script type="text/javascript">
function getRandColor () {
	// Math.random() * 255; 0.0 ~ 255.0
	var r = Math.round(Math.random() * 255);
	var g = Math.round(Math.random() * 255);
	var b = Math.round(Math.random() * 255);
	
	return "rgb(" + r + "," + g + "," + b + ")";
}


function init() {
	var a4 = document.getElementById("p");
	var brush = a4.getContext("2d");
	
	setInterval(function() {
		brush.save(); // 그림자 없는 상태 저장
		
		brush.fillStyle = "rgba(0, 0, 0, 0.1)";
		brush.fillRect(0, 0, 1000, 800);
		
		brush.shadowColor = "white";
		brush.shadowBlur = 10;
		
		var x = Math.random() * 1000; // Math.random(); 0.0 ~ 1.0
		var y = Math.random() * 800; // 0.0 ~ 500.0
		brush.fillStyle = getRandColor();
		brush.fillRect(x, y, 10, 10);
		brush.restore(); // 저장해놓은거 불러오기
	}, 100);
	
}

</script>
</head>
<body onload="init();">
	<canvas id="p" width="1000px" height="800px"></canvas>
</body>
</html>