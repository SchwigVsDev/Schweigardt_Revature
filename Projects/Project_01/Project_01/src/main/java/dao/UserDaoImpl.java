package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

import model.User;
import dbutil.DBUtility;

public class UserDaoImpl implements UserDao {
	@Override
	public int insertUser(User u) {
		try (Connection conn = DBUtility.getInstance()) {
			PreparedStatement ps = conn.prepareStatement("INSERT INTO ERS_USERS VALUES(?,?,?,?,?,?,?)");
			ps.setInt(1, u.getEmployeeId());
			ps.setString(2, u.getUsername());
			ps.setString(3, u.getPassword());
			ps.setString(4, u.getFirstName());
			ps.setString(5, u.getLastName());
			ps.setString(6, u.getEmail());
			ps.setInt(7, u.getRoleId());
			ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public User selectUserById(int id) {
		User u = null;
		try (Connection conn = DBUtility.getInstance()) {

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM EFRS_USERS WHERE ERS_USER_ID=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				u = new User();
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public User selectUserByUsernameAndPassword(String username, String password) {
		User u = null;
		try (Connection conn = DBUtility.getInstance()) {

			PreparedStatement ps = conn
					.prepareStatement("SELECT * FROM ERS_USERS WHERE ERS_USERNAME=? AND ERS_PASSWORD=?");
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				u = new User(rs.getInt(1), rs.getInt(7), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6));
			}
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}

	@Override
	public int updateUser(User u) {
		try (Connection conn = DBUtility.getInstance()) {
			PreparedStatement ps = conn.prepareStatement(
					"UPDATE ERS_USERS SET ERS_PASSWORD=?, USER_FIRST_NAME=?, USER_LAST_NAME=?, USER_ROLE_ID=? WHERE ERS_USER_ID=?");
			ps.setString(1, u.getPassword());
			ps.setString(2, u.getFirstName());
			ps.setString(3, u.getLastName());
			ps.setInt(4, u.getRoleId());
			ps.setInt(5, u.getEmployeeId());
			ps.executeUpdate();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}
}
