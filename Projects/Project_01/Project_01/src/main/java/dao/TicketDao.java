package dao;

import java.util.ArrayList;

import model.Ticket;

public interface TicketDao {
	// CREATE
	public int insertTicket(Ticket t);

	// READ
	public Ticket selectTicketById(int id);

	public ArrayList<Ticket> selectAllTicketsForUser(int userId);
	
	public ArrayList<Ticket> selectAllPendingTickets();

	// UPDATE
	public int updateTicket(Ticket t);
}
