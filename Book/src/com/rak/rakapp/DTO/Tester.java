package com.rak.rakapp.DTO;

import org.hibernate.HibernateException;

import com.rak.rakapp.DAO.BookDAO;
import com.rak.rakapp.DAO.BookDAOImpl;

public class Tester {

	public static void main(String[] args) {
		try {
			BookDTO dto=new BookDTO();
			dto.setBookName("one indian girl");
			dto.setAuthorName("chetan bhagat");
			
			BookDAO dao=new BookDAOImpl();
			dao.save(dto);
			
		} catch (HibernateException e) {
			System.err.println("exception in main method"+e.getMessage());
		}
	}

}
