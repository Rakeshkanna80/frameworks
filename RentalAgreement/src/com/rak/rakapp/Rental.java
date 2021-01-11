package com.rak.rakapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import com.rak.rakapp.DAO.RentalDAO;
import com.rak.rakapp.DAO.RentalDAOIMPL;

@WebServlet("/Rental")
public class Rental extends GenericServlet {

	public Rental() {
		// TODO Auto-generated constructor stub
		System.out.println(" servlet created");
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String OwnerName = req.getParameter("OwnerName");
		String TenantName = req.getParameter("TenantName");
		String Address = req.getParameter("Address");
		String Rent = req.getParameter("Rent");
		String Deposit = req.getParameter("Deposit");
		PrintWriter pw=res.getWriter();
		pw.write("saved successfully"+OwnerName);
		

		try {
			RentalDAO dao = new RentalDAOIMPL();
			dao.save(OwnerName, TenantName, Address, Rent, Deposit);
		} catch (Exception e) {
			System.err.println("exception in servlet class");
		}
	}

}
