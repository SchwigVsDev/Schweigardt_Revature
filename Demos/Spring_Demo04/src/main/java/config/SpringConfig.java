package config;

import java.util.Properties;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import dto.Employee;

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
	public BasicDataSource datasource() {
		BasicDataSource ds = new BasicDataSource();
		ds.setUrl(url);
		ds.setPassword(password);
		ds.setUsername(username);
		ds.setDriverClassName(driverClassName);
		ds.setMaxTotal(100);
		ds.setMaxIdle(20);
		return ds;
	}

	@Bean
	public PropertyPlaceholderConfigurer placeholdercontainer() {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		ppc.setLocation(new ClassPathResource("database.properties"));
		return ppc;
	}

	 @Bean
	    public SessionFactory sessionFactory() {
	        LocalSessionFactoryBean factory= new LocalSessionFactoryBean();
	        factory.setDataSource(datasource());
	        Properties hibernateProperties= new Properties();
	        hibernateProperties.setProperty(Environment.SHOW_SQL, "true");
	        hibernateProperties.setProperty(Environment.DIALECT, "org.hibernate.dialect.Oracle12cDialect");
	        hibernateProperties.setProperty(Environment.HBM2DDL_AUTO,"create");
	        factory.setAnnotatedClasses(Employee.class);
	        factory.setHibernateProperties(hibernateProperties);
	        return factory.getObject();
	    }
}