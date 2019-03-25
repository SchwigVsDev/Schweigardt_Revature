package com.java.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DBUtil {
	static BasicDataSource connectionPool= new BasicDataSource();
	static{
		try {
		Properties p= new Properties();
		p.load(new FileReader("C:\\Users\\payal\\eclipse-workspace\\AirlineReservation\\src\\main\\resources\\database.properties"));
		connectionPool.setUrl(p.getProperty("url"));
		connectionPool.setUsername(p.getProperty("username"));
		connectionPool.setPassword(p.getProperty("password"));
		connectionPool.setMaxTotal(20);
		connectionPool.setDefaultAutoCommit(false);
	}catch(IOException e) {
	}
		
	}
	
	public static Connection getInstance() {
		return connectionPool.getConnection();
	}

}
