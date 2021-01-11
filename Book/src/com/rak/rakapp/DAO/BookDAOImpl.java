package com.rak.rakapp.DAO;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rak.rakapp.HibernateUtil;
import com.rak.rakapp.DTO.BookDTO;

public class BookDAOImpl implements BookDAO {

	@Override
	public void save(BookDTO dto) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = null;
		try {
			System.out.println("opening session");
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(dto);
			transaction.commit();

		} catch (HibernateException e) {
			System.err.println("impl" + e.getMessage());
		} finally {
			if (session != null || factory != null) {
				session.close();
				factory.close();
			}
		}

	}

	@Override
	public BookDTO readById(int id) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = null;
		try {
			System.out.println("opening session");
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			BookDTO entity = session.get(BookDTO.class, id);
			transaction.commit();
			if (entity != null) {
				System.out.println("entity found" + id);
			} else {
				System.out.println("entity not found" + id);
				return null;
			}

		} catch (HibernateException e) {
			System.err.println("impl" + e.getMessage());
		}
		return null;
	}

	@Override
	public BookDTO updateByName(String authorName, int id) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = null;
		try {
			System.out.println("opening session");
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			BookDTO entity = session.get(BookDTO.class, 2);
			
			if (entity != null) {
				entity.setAuthorName(authorName);
				session.update(entity);
				System.out.println("entity found" + id+"can update");
			} else {
				System.out.println("entity not found" + id+"cannot update");
			}
			transaction.commit();

		} catch (HibernateException e) {
			System.err.println("exception in update" + e.getMessage());
		}
		return null;
	}

	@Override
	public BookDTO deleteById(int id) {
		SessionFactory factory = HibernateUtil.getFactory();
		Session session = null;
		try {
			System.out.println("opening session");
			session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			BookDTO entity = session.get(BookDTO.class, 2);
			
			if (entity != null) {
				entity.setId(1);
				session.delete(entity);
				System.out.println("entity found" + id+"can delete");
			} else {
				System.out.println("entity not found" + id+"cannot delete");
			}
			transaction.commit();

		} catch (HibernateException e) {
			System.err.println("exception in delete" + e.getMessage());
		}
		return null;
	}
}
