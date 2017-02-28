package com.app.configuration;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.admin.model.Student;

public class HibernateConfiguration {
	private static SessionFactory sessionFactory;
	
	static{
		try{
			Configuration config = new Configuration();
			config.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/bank");
			config.setProperty("hibernate.connection.username", "root");
			config.setProperty("hibernate.connection.password", "Deepika#7");
			config.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
			config.setProperty("hibernate.show_sql", "false");
			config.setProperty("hibernate.connection.autocommit", "true");
			config.setProperty("hibernate.id.new_generator_mappings", "false");
			
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
			sessionFactory = config.addPackage("com.app.model.*").addAnnotatedClass(bank.class).buildSessionFactory(builder.build());
		
			
		}catch(Throwable ex){
			throw new ExceptionInInitializerError(ex);
		}
	}
	
}
