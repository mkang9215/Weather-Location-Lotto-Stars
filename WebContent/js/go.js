function goCoffeeInfo(n) {
	location.href = "CoffeeInfoController?name=" + n;
}

function deleteCoffee(n) {
	location.href = "CoffeeDeleteController?name=" + n;
}
