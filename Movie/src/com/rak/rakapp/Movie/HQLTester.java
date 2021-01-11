package com.rak.rakapp.Movie;


import java.util.Arrays;

import org.hibernate.HibernateException;

import com.rak.rakapp.Movie.DAO.MovieDAO;
import com.rak.rakapp.Movie.DAO.MovieDAOImpl;
import com.rak.rakapp.Movie.DTO.MovieDTO;

public class HQLTester {

	public static void main(String[] args) {
		try{
		MovieDAO dao=new MovieDAOImpl();
		MovieDTO dto=dao.fetchByName("joker");
		System.out.println(dto.getLanguage());
		System.out.println("******************************************");
		long id=dao.fetchIdByName("war");
		System.out.println(id);
		System.out.println("******************************************");
		String s=dao.fetchlanguageByIdAndBudget(1, "50cr");
		System.out.println(s);
		System.out.println("******************************************");
		double d=dao.fetchRatingByNameAndId("war", 2);
		System.out.println(d);
		System.out.println("******************************************");
		Object[] array=dao.fetchLangAndBudgetByName("war");
		
		System.out.println(Arrays.toString(array));
		
		}catch(HibernateException e){
		System.err.println("exception in main"+e.getMessage());	
		}finally {
			HibernateUtil.getFactory().close();
		}
	}
	

	
	

}
