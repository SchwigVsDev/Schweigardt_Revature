package dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import dbutil.DBUtility;
import model.Ticket;

public class TicketDaoImpl implements TicketDao {

	@Override
	public int insertTicket(Ticket t) {
//		System.out.print(t);
		try (Connection conn = DBUtility.getInstance()) {
			CallableStatement cs = conn.prepareCall("{call submit_ticket(?,?,?,?)}");
			cs.setInt(1, t.getReimbAmount());
			cs.setString(2, t.getReimbDesc());
			cs.setInt(3, t.getReimbAuthId());
			cs.setInt(4, t.getReimbTypeId());
			cs.execute();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public Ticket selectTicketById(int id) {
		Ticket t = null;
		try (Connection conn = DBUtility.getInstance()) {

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ERS_REIMBURSEMENT WHERE REIMB_ID=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				t = new Ticket();
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return t;
	}

	@Override
	public ArrayList<Ticket> selectAllTicketsForUser(int userId) {
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		try (Connection conn = DBUtility.getInstance()) {

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ERS_REIMBURSMENT WHERE REIMB_AUTHOR=?");
			ps.setInt(1, userId);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Ticket t = new Ticket();
				t.setReimbAmount(rs.getInt("REIMB_AMOUNT"));
				t.setReimbAuthId(rs.getInt("REIMB_AUTHOR"));
				t.setReimbDesc(rs.getString("REIMB_DESCRIPTION"));
				t.setReimbId(rs.getInt("REIMB_ID"));
				t.setReimbResolvId(rs.getInt("REIMB_RESOLVER"));
				t.setReimbStatusId(rs.getInt("REIMB_STATUS_ID"));
				t.setReimbTypeId(rs.getInt("REIMB_TYPE_ID"));
				if (rs.getTimestamp("REIMB_SUBMITTED") != null)
					t.setReimbSubTime(
							new SimpleDateFormat("MM/dd/yyyy HH:mm:ss z").format(rs.getTimestamp("REIMB_SUBMITTED")));
				if (rs.getTimestamp("REIMB_RESOLVED") != null)
					t.setReimbResTime(
							new SimpleDateFormat("MM/dd/yyyy HH:mm:ss z").format(rs.getTimestamp("REIMB_RESOLVED")));
				tickets.add(t);
			}
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tickets;
	}

	@Override
	public ArrayList<Ticket> selectAllPendingTickets() {
		ArrayList<Ticket> tickets = new ArrayList<Ticket>();
		try (Connection conn = DBUtility.getInstance()) {

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM ERS_REIMBURSMENT WHERE REIMB_STATUS_ID=1");

			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Ticket t = new Ticket();
				t.setReimbAmount(rs.getInt("REIMB_AMOUNT"));
				t.setReimbAuthId(rs.getInt("REIMB_AUTHOR"));
				t.setReimbDesc(rs.getString("REIMB_DESCRIPTION"));
				t.setReimbId(rs.getInt("REIMB_ID"));
				t.setReimbResolvId(rs.getInt("REIMB_RESOLVER"));
				t.setReimbStatusId(rs.getInt("REIMB_STATUS_ID"));
				t.setReimbTypeId(rs.getInt("REIMB_TYPE_ID"));
				if (rs.getTimestamp("REIMB_SUBMITTED") != null)
					t.setReimbSubTime(
							new SimpleDateFormat("MM/dd/yyyy HH:mm:ss z").format(rs.getTimestamp("REIMB_SUBMITTED")));
				if (rs.getTimestamp("REIMB_RESOLVED") != null)
					t.setReimbResTime(
							new SimpleDateFormat("MM/dd/yyyy HH:mm:ss z").format(rs.getTimestamp("REIMB_RESOLVED")));
				tickets.add(t);
			}
			conn.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return tickets;
	}

	@Override
	public int updateTicket(Ticket t) {
		try (Connection conn = DBUtility.getInstance()) {
			CallableStatement cs = conn.prepareCall("{call resolve_ticket(?,?,?)}");
			cs.setInt(1, t.getReimbId());
			cs.setInt(2, t.getReimbResolvId());
			cs.setInt(3, t.getReimbStatusId());
			cs.execute();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

}
