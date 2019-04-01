package com.java.service;

import com.java.dto.LoginDetails;
import com.java.exception.DatabaseException;

public interface LoginService {

	public void createUser(LoginDetails details) throws DatabaseException;
	public void updateDetails(LoginDetails details);
	public void deleteUser(String username);
	public LoginDetails getDetails(String username);
}
