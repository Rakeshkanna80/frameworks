package com.rak.rakapp.DAO;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rak.rakapp.HibernateUtil;
import com.rak.rakapp.DTO.ProductDTO;

public class ProductDAOImpl implements ProductDAO {

	@Override
	public void save(List<ProductDTO> list) {
		Session session = HibernateUtil.getFactory().openSession();
		try {
			Transaction transaction = session.beginTransaction();
			/*for (ProductDTO productDTO : list) {
				session.save(productDTO);
			}*/
			for (int i = 0; i < list.size(); i++) {
				ProductDTO dto=list.get(i);
				System.out.println("saving dto with id "+i);
				session.save(dto);
				if (i%25==0) {
					System.out.println("flushing 66756757557586969996996969696969669696969696696969");
					session.flush();
					session.clear();
				}
			}

			transaction.commit();

		} catch (HibernateException e) {
			System.err.println("exception in saving" + e.getMessage());
		} finally {
			session.close();
		}

	}

	@Override
	public List<String> fetchNameList() {
		Session session = HibernateUtil.getFactory().openSession();
		try {

			Query query = session.getNamedQuery("fetchNameList");
			List l = query.list();
			return l;

		} catch (HibernateException e) {
			System.err.println("exception in saving" + e.getMessage());
		} finally {
			session.close();
		}
		return null;
	}

	@Override
	public List<Double> fetchPriceList() {
		Session session = HibernateUtil.getFactory().openSession();
		try {

			Query query = session.getNamedQuery("fetchPriceList");
			List l = query.list();
			return l;

		} catch (HibernateException e) {
			System.err.println("exception in saving" + e.getMessage());
		} finally {
			session.close();
		}
		return null;

	}

	@Override
	public List<Object[]> fetchNameandPriceByQuantity(int quantity) {
		Session session = HibernateUtil.getFactory().openSession();
		try {

			Query query = session.getNamedQuery("fetchNameandPriceByQuantity");

			query.setParameter("qty", quantity);
			List l = query.list();

			List<Object[]> o = (List<Object[]>) l;
			return o;

		} catch (HibernateException e) {
			System.err.println("exception in saving" + e.getMessage());
		} finally {
			session.close();
		}
		return null;

	}

	@Override
	public List<Object[]> fetchCountofEntityByQuantity(int quantity) {

		Session session = HibernateUtil.getFactory().openSession();
		try {

			Query query = session.getNamedQuery("fetchCountofEntityByQuantity");
			List l = query.list();
			return l;

		} catch (HibernateException e) {
			System.err.println("exception in saving" + e.getMessage());
		} finally {
			session.close();
		}
		return null;

	}

}
