package com.rak.rakapp.hibernate.util;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory factory;
	
	public static SessionFactory getfactory() {
		return factory;
		
	}
	static {
		try {
			System.out.println("configuration created");
			Configuration configuration=new Configuration();
			configuration.configure();
			System.out.println("build session successful");
			factory=configuration.buildSessionFactory();
			
		} catch (HibernateException e) {
			System.err.println("hibernate exception in util"+e.getMessage());
		}
	}
}
