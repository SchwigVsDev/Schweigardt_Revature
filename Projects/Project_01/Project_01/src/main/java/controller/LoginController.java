package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import dao.TicketDaoImpl;
import dao.UserDaoImpl;
import model.Ticket;
import model.User;

public class LoginController {

	public static String Login(HttpServletRequest req) {

		String username = req.getParameter("username");
		String password = req.getParameter("password");

		UserDaoImpl userDao = new UserDaoImpl();
		TicketDaoImpl ticketDao = new TicketDaoImpl();
		User user = new User();
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();

		user = userDao.selectUserByUsernameAndPassword(username, password);
		tickets = ticketDao.selectAllTicketsForUser(user.getEmployeeId());

		if (req.getSession().getAttribute("User") == null) {
			if (username.equals(user.getUsername()) && password.equals(user.getPassword())) {
				req.getSession().setAttribute("User", user);
				req.getSession().setAttribute("Tickets", tickets);
			}
		}

		if (user.getRoleId() == 1)
			return "/profile.html";
		else
			return "/managerProfile.html";
	}

	public static String Logout(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		if (session != null)
			session.invalidate();
		return "/index.html";
	}
}