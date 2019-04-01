package com.java.repositroy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.java.dto.LoginDetails;
import com.java.exception.DatabaseException;
import com.java.util.DBUtil;

public class LoginRepositoryImpl implements LoginRepository {

	@Override
	public void createUser(LoginDetails details) throws DatabaseException {
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement st = connection.prepareStatement("insert into logindetials values (?,?)");) {
			st.setString(1, details.getUsername());
			st.setString(2, details.getPassword());
			st.executeUpdate();
			connection.commit();
		} catch (SQLException e) {
			throw new DatabaseException(e.getMessage());
		}
	}

	@Override
	public void updateDetails(LoginDetails details) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(String username) {
		// TODO Auto-generated method stub

	}

	@Override
	public LoginDetails getDetails(String username) {
		// TODO Auto-generated method stub
		return null;
	}

}
