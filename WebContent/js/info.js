function showAlert(txt) {
	// setInterval(함수, 시간); 시간마다 함수 호출(계속 반복)
	// setTimeout(함수, 시간); 시간 지나고 함수 호출(일회용)
	setTimeout(function() {
		alert(txt);
	}, 200); // 0.2초 후에 실행됨
}