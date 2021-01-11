package com.rak.rakapp;

import com.rak.rakapp.DAO.BookDAO;
import com.rak.rakapp.DAO.BookDAOImpl;

public class UpdateTester {

	public static void main(String[] args) {
		BookDAO dao=new BookDAOImpl();
		dao.updateByName("Deepak", 1);
	}

}
