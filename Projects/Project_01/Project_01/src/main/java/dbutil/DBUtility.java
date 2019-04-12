package dbutil;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.naming.Context;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class DBUtility {
	public static String ur, username, password;
	static BasicDataSource connectionPool = new BasicDataSource();

	static {
		try {
			Properties properties = new Properties();
			properties.load(new FileReader(
					"D:\\Code Repos\\Schweigardt_Revature\\Projects\\Project_01\\Project_01\\src\\main\\resources\\database.properties"));
			connectionPool.setUrl(properties.getProperty("url"));
			connectionPool.setUsername(properties.getProperty("username"));
			connectionPool.setPassword(properties.getProperty("passowrd"));
			connectionPool.setMaxTotal(20);
			connectionPool.setDefaultAutoCommit(false);
		} catch (IOException e) {
			System.out.println("Cannot find your property file.");
			System.out.println(e);
		}
	}

	public static Connection getInstance() throws SQLException {
		try {
			Context initContext = new InitialContext();
			Context envContext = (Context) initContext.lookup("java:/comp/env");
			DataSource ds = (DataSource) envContext.lookup("jdbc/myoracle");
			Connection conn = ds.getConnection();
			return conn;

		} catch (NamingException e) {
			System.out.println(e);
		}
		//return connectionPool.getConnection();
		return null;
		
	}
}
