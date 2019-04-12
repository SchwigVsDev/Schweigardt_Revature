/**
 * 
 */

window.onload = function() {
	getUserInfo();
}

function getUserInfo() {
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			let user = JSON.parse(xhttp.responseText);
			setUserValues(user);
		}
	}

	xhttp.open('GET', 'http://localhost:8080/Project_01/UserJSON.do', true);
	xhttp.send();
}

function setUserValues(u) {
	console.log(u);
	let div = document.getElementById("User");
	while (div.firstChild) {
		div.removeChild(div.firstChild);
	}
	div.innerHTML += "<div class='col p-2'><h5>" + u.firstName + " "
			+ u.lastName + "</h5>"
			+ "<div class='row ml-1'><div class='col'> EID: "
			+ u.employeeId + "</div>" + "</div>" + "</div>";

}