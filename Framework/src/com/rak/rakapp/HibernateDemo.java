package com.rak.rakapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDemo {

	
	private static SessionFactory factory;

	public static SessionFactory getFactory() {
		System.out.println("invoke getfactory");
		return factory;
	}

	static {
		try {
			
			System.out.println("creating sf");
			Configuration configuration = new Configuration();
			configuration.configure();
			factory = configuration.buildSessionFactory();
			System.out.println("factory in util:"+factory);

		} catch (Exception e) {
			System.err.println("exception in creating session factory,static block" + e.getMessage());
		}
	}
}
