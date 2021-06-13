function coffeeRegCheck() {
	var nInput = document.coffeeRegForm.name;
	var pInput = document.coffeeRegForm.price;

	if (isEmpty(nInput)) {
		alert("메뉴명을 입력해주세요");
		nInput.value = "";
		nInput.focus();
		return false;
	}
	if (isEmpty(pInput) || isNotNumber(pInput)) {
		alert("가격을 숫자로 입력해주세요");
		pInput.value = "";
		pInput.focus();
		return false;
	}
	return true;
}

function coffeeUpdateCheck() {
	var pInput = document.coffeeUpdateForm.price;
	var previous = document.coffeeUpdateForm.previous;
	
	if (isEmpty(pInput) || isNotNumber(pInput)) {
		alert("가격을 숫자로 입력해주세요");
		pInput.value = "";
		pInput.focus();
		return false;
	}
	if (!notEquals(pInput, previous)) {
		alert("가격을 다르게 입력해주세요");
		pInput.value = "";
		pInput.focus();
		return false;
	}
	return true;
}
