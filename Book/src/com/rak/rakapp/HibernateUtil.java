package com.rak.rakapp;


import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		System.out.println("getfactory");
		return factory;
		
	}
	
	static {
		
		try {
			System.out.println("created configuration");
			Configuration configuration=new Configuration();
			System.out.println("configure success");
			configuration.configure();
			System.out.println("bs success");
			factory=configuration.buildSessionFactory();
			System.out.println("util factory"+factory);
		} catch (HibernateException e) {
			System.err.println("exception in hibernate util"+e.getMessage());
		}
	}
}
