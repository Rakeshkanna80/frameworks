package com.rak.rakapp;

import com.rak.rakapp.DAO.BookDAO;
import com.rak.rakapp.DAO.BookDAOImpl;

public class DeleteTester {

	public static void main(String[] args) {
		BookDAO dao=new BookDAOImpl();
		dao.deleteById(1);
	}

}
