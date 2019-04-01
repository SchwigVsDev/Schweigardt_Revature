package com.java.service;

import com.java.dto.LoginDetails;
import com.java.exception.DatabaseException;
import com.java.repositroy.LoginRepository;
import com.java.repositroy.LoginRepositoryImpl;

public class LoginServiceImpl implements LoginService{
	
	static LoginRepository rep= new LoginRepositoryImpl();

	@Override
	public void createUser(LoginDetails details) throws DatabaseException {
		rep.createUser(details);
		
	}

	@Override
	public void updateDetails(LoginDetails details) {
		rep.updateDetails(details);
		
	}

	@Override
	public void deleteUser(String username) {
		rep.deleteUser(username);
		
	}

	@Override
	public LoginDetails getDetails(String username) {
		return rep.getDetails(username);
	}

}
