/**
 * 
 */

window.onload = function() {
	getTicketInfo();
}

var g_ticket;

function getTicketInfo() {
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function() {
		if (xhttp.readyState == 4 && xhttp.status == 200) {
			let ticket = g_ticket = JSON.parse(xhttp.responseText);
			setTicketValues(ticket);
		}
	}

	xhttp.open('GET', 'http://localhost:8080/Project_01/Pending.do', true);
	xhttp.send();
}

function setTicketValues(t) {
	// document.getElementById('Ticket').innerHTML = t;
	let div = document.getElementById("Tickets");
	while (div.firstChild) {
		div.removeChild(div.firstChild);
	}
	if (t.length >= 1) {
		t
				.forEach(function(tick) {
					console.log(tick);
					let type = '';
					switch (tick.reimbTypeId) {
					case 1:
						type = 'Food';
						break;
					case 2:
						type = 'Lodging';
						break;
					case 3:
						type = 'Travel';
						break;
					case 4:
						type = 'Other';
						break;
					}

					div.innerHTML += "<div class='col p-2'>" + "<h5>Ticket \#"
							+ tick.reimbId
							+ "</h5>"
							+ "<div class='row ml-1'><div class='col'> Amount: \$"
							+ tick.reimbAmount
							+ "</div>"
							+ "<div class='col'> Type: "
							+ type
							+ "</div>"
							+ "<div class='col'><form method='POST' action='Resolve.do'><button name='approve' type='submit' class='btn btn-success' value='"
							+ tick.reimbId
							+ "'>Approve</button></form></div>"
							+ "</div>"
							+ "<div class='row ml-1'><div class='col'> Submitted: "
							+ "</div>"
							+ "<div class='col'>"
							+ tick.reimbSubTime
							+ "</div>"
							+ "<div class='col'><form method='POST' action='Resolve.do'><button name='deny' type='submit' class='btn btn-danger' value='"
							+ tick.reimbId + "'>Deny</button></form></div>"
							+ "</div>" + "</div>";
				});
	} else {
		div.innerHTML += "<div class='col-9 p-2'><h5>No pending tickets.</h5></div>";
	}

}

document.getElementById('options').onchange = function(e) {
	let temp = [];
	for (let i = 0; i < g_ticket.length; i++) {
		if (g_ticket[i].reimbTypeId == e.target.options[e.target.selectedIndex].value) {
			temp.push(g_ticket[i]);
		}
	}
	if (e.target.options[e.target.selectedIndex].value == 0) {
		setTicketValues(g_ticket);
	} else {
		setTicketValues(temp);
	}
}