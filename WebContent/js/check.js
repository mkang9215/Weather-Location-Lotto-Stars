function coffeeRegCheck() {
	var nInput = document.coffeeRegForm.name;
	var pInput = document.coffeeRegForm.price;

	if (isEmpty(nInput)) {
		alert("�޴����� �Է����ּ���");
		nInput.value = "";
		nInput.focus();
		return false;
	}
	if (isEmpty(pInput) || isNotNumber(pInput)) {
		alert("������ ���ڷ� �Է����ּ���");
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
		alert("������ ���ڷ� �Է����ּ���");
		pInput.value = "";
		pInput.focus();
		return false;
	}
	if (!notEquals(pInput, previous)) {
		alert("������ �ٸ��� �Է����ּ���");
		pInput.value = "";
		pInput.focus();
		return false;
	}
	return true;
}
