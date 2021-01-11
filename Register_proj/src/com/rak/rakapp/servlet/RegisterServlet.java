package com.rak.rakapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	public RegisterServlet() {
		System.out.println("created /t"+this.getClass().getSimpleName());
	}
	@Override
	public void init() throws ServletException {
		System.out.println("initialization done");
		super.init();
	}
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}

}
