package com.rak.rakapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rak.rakapp.entity.Address;

@Component
public class DetailsdaoImplAddress implements DetailsdaoAddress {

	private SessionFactory factory;

	
	@Autowired
	public DetailsdaoImplAddress(SessionFactory factory) {
		System.out.println("created \t" + this.getClass().getTypeName());
		this.factory = factory;
	}

	@Override
	public void save(Address address) {
		Session session = null;
		try {
			session=this.factory.openSession();
			session.beginTransaction();
			session.save(address);
			session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			if (session != null)
				session.close();
		}
	}

}
