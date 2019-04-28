package com.java.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.java.dto.Employee;

@ComponentScan("com.java")
@EnableWebMvc
public class SpringConfig {
	@Value("${url}")
	String url;
	@Value("${password}")
	String password;
	@Value("${username}")
	String username;
	@Value("${driverClassName}")
	String driverClassName;
	@Bean
	public SessionFactory sessionFactory() {
		Configuration cfg=new Configuration();
		//create the schema
			cfg.setProperty(Environment.HBM2DDL_AUTO, "create");
			cfg.addAnnotatedClass(Employee.class);
			//To which db, it should generate sql queries
			cfg.setProperty(Environment.DIALECT, "org.hibernate.dialect.OracleDialect");
			cfg.setProperty("hibernate.connection.username", username);
			cfg.setProperty("hibernate.connection.password",password);
			cfg.setProperty("hibernate.connection.driver_class", driverClassName);
			cfg.setProperty("hibernate.connection.url", url);
			cfg.setProperty(Environment.SHOW_SQL, "true");
			StandardServiceRegistryBuilder rb= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
			SessionFactory sf=cfg.buildSessionFactory(rb.build());
			 return sf;
	}

	
	@Bean
	public static PropertyPlaceholderConfigurer ppc() {
		PropertyPlaceholderConfigurer ppc= new PropertyPlaceholderConfigurer();
		ppc.setLocation(new ClassPathResource("database.properties"));
		return ppc;
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".html");
		return vr;
	}
	
}
