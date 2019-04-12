package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import model.Ticket;
import model.User;
import dao.TicketDaoImpl;

public class TicketController {

	public static String SubmitNewTicket(HttpServletRequest req) {
		TicketDaoImpl ticketDao = new TicketDaoImpl();
		Ticket tick = new Ticket();
		User user = (User) req.getSession().getAttribute("User");

//		Enumeration<String> enm = req.getParameterNames();
//		while (enm.hasMoreElements()) {
//			System.out.println(enm.nextElement());
//		}

		if (req.getSession().getAttribute("User") != null) {
			tick.setReimbAmount(Integer.parseInt(req.getParameter("amount")));
			tick.setReimbAuthId(user.getEmployeeId());
			tick.setReimbDesc(req.getParameter("description"));
			tick.setReimbTypeId(Integer.parseInt(req.getParameter("typeId")));
			ticketDao.insertTicket(tick);

		} else {
			return "SignIn.do";
		}

		String str = "/profile.html";
		if (user.getRoleId() == 2) {
			str = "/managerProfile.html";
		}

		return str;
	}

	public static String ResolveTicket(HttpServletRequest req) {
		TicketDaoImpl ticketDao = new TicketDaoImpl();
		Ticket tick = new Ticket();
		User user = (User) req.getSession().getAttribute("User");

		System.out.println(user);
		System.out.println(req.getParameter("approve"));
		System.out.println(req.getParameter("deny"));

		if (user != null) {
			int id = 0;
			int resolve = 0;
			tick.setReimbResolvId(user.getEmployeeId());
			if (req.getParameter("approve") != null) {
				id = Integer.parseInt(req.getParameter("approve"));
				resolve = 2;
			}
			if (req.getParameter("deny") != null) {
				id = Integer.parseInt(req.getParameter("deny"));
				resolve = 3;
			}
			tick.setReimbId(id);
			tick.setReimbStatusId(resolve);

			ticketDao.updateTicket(tick);
		} else {
			return "SignIn.do";
		}

		return "/requests.html";
	}

	public static String ShowPendingTickets(HttpServletRequest req, HttpServletResponse res) {
		TicketDaoImpl ticketDao = new TicketDaoImpl();
		User user = (User) req.getSession().getAttribute("User");
		if (user == null) {
			return "/index.html";
		}
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		for (int i = 0; i < ticketDao.selectAllPendingTickets().size(); i++) {
			if (ticketDao.selectAllPendingTickets().get(i).getReimbAuthId() != user.getEmployeeId()) {
				tickets.add(ticketDao.selectAllPendingTickets().get(i));
			}
		}

		try {
			res.getWriter().write(new ObjectMapper().writeValueAsString(tickets));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
