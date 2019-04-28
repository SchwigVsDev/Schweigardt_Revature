/*package com.java.repository;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.springframework.stereotype.Component;

import com.java.dto.Employee;

@Component
public class DBUtil {

	
	private static SessionFactory sf;
	
	static {
		Configuration cfg=new Configuration();
	//create the schema
		cfg.setProperty(Environment.HBM2DDL_AUTO, "create");
		cfg.addAnnotatedClass(Employee.class);
		//To which db, it should generate sql queries
		cfg.setProperty(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
		cfg.setProperty("hibernate.connection.username", "mysql123");
		cfg.setProperty("hibernate.connection.password", "mysql123");
		cfg.setProperty("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
		cfg.setProperty("hibernate.connection.url", "jdbc:oracle:thin:@mydb.c2e2sfgq1rjp.ap-south-1.rds.amazonaws.com:1521:orcl");
		cfg.setProperty(Environment.SHOW_SQL, "true");
		StandardServiceRegistryBuilder rb= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		 sf=cfg.buildSessionFactory(rb.build());
		
}
	
}
*/