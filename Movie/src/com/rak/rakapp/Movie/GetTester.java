package com.rak.rakapp.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rak.rakapp.Movie.DAO.MovieDAO;
import com.rak.rakapp.Movie.DAO.MovieDAOImpl;
import com.rak.rakapp.Movie.DTO.MovieDTO;

public class GetTester {

	public static void main(String[] args) {
		try {
			List a=new ArrayList();
			a.add(1);
			a.add(2);
			MovieDAO dao=new MovieDAOImpl();
			Map<Integer,MovieDTO> map=dao.getList(a);
			
			System.out.println(map);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

	
	
}
