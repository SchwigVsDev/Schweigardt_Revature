package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RequestHelper {

	public static String process(HttpServletRequest request, HttpServletResponse response) {
		switch (request.getRequestURI()) {
		case "/Project_01/Requests.do":
			return "/requests.html";
		case "/Project_01/SignIn.do":
			return "/login.html";
		case "/Project_01/Submit.do":
			return "/submit.html";
		case "/Project_01/Ticket.do":
			return "/ticket.html";
		case "/Project_01/Login.do":
			return LoginController.Login(request);
		case "/Project_01/Logout.do":
			return LoginController.Logout(request);
		case "/Project_01/NewTicket.do":
			return TicketController.SubmitNewTicket(request);
		case "/Project_01/Pending.do":
			return TicketController.ShowPendingTickets(request, response);
		case "/Project_01/Resolve.do":
			return TicketController.ResolveTicket(request);
		case "/Project_01/TicketJSON.do":
			return ProfileController.TicketJSON(request, response);
		case "/Project_01/UserJSON.do":
			return ProfileController.UserJSON(request, response);
		default:
			return "/index.html";
		}
	};

}
