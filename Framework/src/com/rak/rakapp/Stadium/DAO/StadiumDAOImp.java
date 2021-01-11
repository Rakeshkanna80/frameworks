package com.rak.rakapp.Stadium.DAO;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rak.rakapp.Stadium.DTO.StadiumDTO;

public class StadiumDAOImp implements StadiumDAO{
	public StadiumDAOImp() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public void save(StadiumDTO dto) {
		System.out.println("implemented method"+dto);
		SessionFactory factory=null;
		Session session=null;
		
		
		try {
			System.out.println("creating hibernate configuration");
			Configuration cfg=new Configuration();
			cfg.configure();
			cfg.addAnnotatedClass(StadiumDTO.class);
			System.out.println("creating session factory");
			factory =cfg.buildSessionFactory();
			System.out.println("creating session");
			session=factory.openSession();
			System.out.println("creating transaction");
			Transaction transaction=session.beginTransaction();
			Serializable id=session.save(dto);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
			factory.close();
		}
		
	}
	
}
