package com.rak.rakapp.Movie.DAO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.rak.rakapp.Movie.*;
import com.rak.rakapp.Movie.DTO.MovieDTO;

public class MovieDAOImpl implements MovieDAO {

	/*
	 * @Override public void saveMovieList(List<MovieDTO> list) { // TODO
	 * Auto-generated method stub SessionFactory factory =
	 * HibernateUtil.getFactory(); Session session = null; try {
	 * 
	 * session = factory.openSession(); Transaction transaction =
	 * session.beginTransaction(); for (MovieDTO dto : list) { session.save(dto); }
	 * 
	 * transaction.commit(); } catch (HibernateException e) {
	 * System.err.println("exception in saving data" + e.getMessage()); } finally {
	 * if (session != null || factory != null) { session.close(); factory.close(); }
	 * } }
	 * 
	 * @Override public Map<Integer, MovieDTO> getList(List<Integer> idList) { //
	 * TODO Auto-generated method stub Map<Integer, MovieDTO> map = new HashMap<>();
	 * SessionFactory factory = HibernateUtil.getFactory(); Session session = null;
	 * try {
	 * 
	 * session = factory.openSession(); Transaction transaction =
	 * session.beginTransaction(); for (Integer integer : idList) { map.put(integer,
	 * session.get(MovieDTO.class, integer));
	 * 
	 * } transaction.commit(); return map; } catch (HibernateException e) {
	 * System.err.println("exception in saving data" + e.getMessage()); } finally {
	 * if (session != null || factory != null) { session.close(); factory.close(); }
	 * 
	 * } return null; }
	 */

	@Override
	public MovieDTO fetchByName(String name) {
		Session session = HibernateUtil.getFactory().openSession();
		try {
			// step1
			String hql = "select movie from MovieDTO as movie where movie.name='" + name + "'";
			Query query = session.createQuery(hql);
			// step2
			Object result = query.uniqueResult();
			MovieDTO entity = (MovieDTO) result;
			return entity;
		} catch (HibernateException e) {
			System.err.println("exception" + e.getMessage());
		} finally {
			session.close();
		}
		return null;

	}

	@Override
	public long fetchIdByName(String name) {
		System.out.println("invoked name" + name);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			// step1
			String hql = "select movie.id from MovieDTO as movie where movie.name='" + name + "'";
			System.out.println("hql query:" + hql);
			Query query = session.createQuery(hql);
			// step2
			Object result = query.uniqueResult();
			long id = (long) result;
			return id;
		} catch (HibernateException e) {
			System.err.println("exception" + e.getMessage());
		} finally {
			session.close();
		}
		return 0;

	}

	@Override
	public String toString() {
		return "MovieDAOImpl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	@Override
	public String fetchlanguageByIdAndBudget(long id, String budget) {
		// TODO Auto-generated method stub
		System.out.println("invoked name"+id+budget);
		Session session = HibernateUtil.getFactory().openSession();
		try {
			// step1
			String hql = "select movie.language from MovieDTO as movie where movie.id='" +id+ "' and movie.budget='"+budget+"'";
			System.out.println("hql query:" + hql);
			Query query = session.createQuery(hql);
			// step2 
			Object result = query.uniqueResult();
			String budget1 = (String) result;
			return budget1;
		} catch (HibernateException e) {
			System.err.println("exception" + e.getMessage());
		} finally {
			session.close();
		}
		
		return null;
	}

	@Override
	public double fetchRatingByNameAndId(String name, long id) {
		System.out.println("invoked name"+name+id);
		Session session=HibernateUtil.getFactory().openSession();
		try {
			//step1
			String hql="select movie.rating from MovieDTO as movie where movie.name='"+name+"' and movie.id='"+id+"' ";
			System.out.println("hql query:"+hql);
			Query query=session.createQuery(hql);
			//step2
			Object result=query.uniqueResult();
			double rating=(double)result;
			return rating;
		} catch (HibernateException e) {
			System.err.println("exception" + e.getMessage());
		}finally {
			session.close();
		}
		return 0;
		
	}

	@Override
	public Object[] fetchLangAndBudgetByName( String name) {
		System.out.println("invoked name");
		Session session=HibernateUtil.getFactory().openSession();
		try {
			//step1
			String hql="select movie.language,movie.budget from MovieDTO as movie where movie.name='"+name+"'";
			System.out.println("hql query:"+hql);
			Query query=session.createQuery(hql);
			//step2
			Object obj=query.uniqueResult();
			Object[] array =(Object[]) obj;
			return array;
		} catch (HibernateException e) {
			System.err.println("exception" + e.getMessage());
		}finally {
			session.close();
		}
		
		return null;
	}

}
