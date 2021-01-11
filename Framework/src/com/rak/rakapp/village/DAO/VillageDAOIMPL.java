package com.rak.rakapp.village.DAO;

import org.hibernate.HibernateException; 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rak.rakapp.HibernateDemo;
import com.rak.rakapp.village.DTO.VillageDTO;


public class VillageDAOIMPL implements VillageDAO {

	@Override
	public void Save(VillageDTO dto) {
		SessionFactory factory = HibernateDemo.getFactory();
		Session session = null;
		try {
			/*Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(VillageDTO.class);
			factory = configuration.buildSessionFactory();
			*/
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();
		} catch (HibernateException e) {
			System.err.println("katgaya" + e.getMessage());
		} finally {
			if (session != null || factory != null) {
				session.close();
				factory.close();
			}
		}
	}

	@Override
	public VillageDTO fetchById(int id) {
		SessionFactory factory = HibernateDemo.getFactory();
		System.out.println("fetch dao created"+factory);
		Session session = null;
		try {
			/*
			 * Configuration configuration = new Configuration(); 
			 * configuration.configure();
			 * configuration.addAnnotatedClass(VillageDTO.class); 
			 */
			System.out.println("qwertyuiop");
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			System.out.println("asdfghjkl");
			VillageDTO entity = session.get(VillageDTO.class, id);
			if (entity != null) {
				System.out.println("entity found" + id);
				return entity;
			} else {
				System.out.println("entity not found" + id);
				return null;
			}
		} catch (HibernateException e) {
			System.err.println(e.getMessage());
		}
		return null;

	}

	@Override
	public void updateByName(String name, int id) {
		SessionFactory factory = HibernateDemo.getFactory();
		Session session = null;
		try {
/*			Configuration configuration = new Configuration();
			configuration.configure();
			configuration.addAnnotatedClass(VillageDTO.class);
			factory = configuration.buildSessionFactory();
*/			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			VillageDTO entity = session.get(VillageDTO.class, id);
			if (entity != null) {
				System.out.println("entity found" + id + "can update");
				entity.setName(name);
				session.update(entity);
				transaction.commit();
			} else {
				System.out.println("entity not found" + id + "cannot update");
			}
		} catch (HibernateException e) {
			System.err.println("exception in update");
		}

	}

}
