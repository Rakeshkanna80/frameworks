package com.swami.swamiapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.swami.swamiapp.dto.SwamijiDTO;

public class SwamijiDAOImpl implements SwamijiDAO {
	private SessionFactory factory;
	public SwamijiDAOImpl(SessionFactory factory) {
		this.factory=factory;
	}

	@Override
	public void savedto(SwamijiDTO dto) {
	//	SessionFactory factory = null;
		Session session = null;
		try {
			//Configuration configuration = new Configuration().configure("resources/hibernate.xml");
			//factory = configuration.buildSessionFactory();
			session = factory.openSession();
			session.beginTransaction();
			session.save(dto);
			session.getTransaction().commit();

		} catch (Exception e) {
			session.beginTransaction().rollback();
			e.printStackTrace();

		} finally {
			session.close();
			factory.close();
		}
	}

}
