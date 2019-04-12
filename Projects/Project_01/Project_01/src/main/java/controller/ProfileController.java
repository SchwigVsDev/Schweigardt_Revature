package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ProfileController {
	public static String UserJSON(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.getWriter().write(new ObjectMapper().writeValueAsString(req.getSession().getAttribute("User")));
		} catch (JsonProcessingException e) {

		} catch (IOException e) {

		}
		return null;
	}

	public static String TicketJSON(HttpServletRequest req, HttpServletResponse res) {
		try {
			res.getWriter().write(new ObjectMapper().writeValueAsString(req.getSession().getAttribute("Tickets")));
		} catch (JsonProcessingException e) {

		} catch (IOException e) {

		}
		return null;
	}
}
