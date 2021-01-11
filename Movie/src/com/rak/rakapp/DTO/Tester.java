package com.rak.rakapp.DTO;

import java.util.LinkedList;

import com.rak.rakapp.Movie.DAO.MovieDAO;
import com.rak.rakapp.Movie.DAO.MovieDAOImpl;
import com.rak.rakapp.Movie.DTO.MovieDTO;

public class Tester {

	public static void main(String[] args) {
		try {
			MovieDTO dto = new MovieDTO();
			dto.setName("super30");
			dto.setLanguage("hindi");
			dto.setRating(7.5);
			dto.setBudget("20cr");

			
			MovieDTO dto1 = new MovieDTO();
			dto1.setName("mission mangal");
			dto1.setLanguage("hindi");
			dto1.setRating(8);
			dto1.setBudget("50cr");

			MovieDTO dto2 = new MovieDTO();
			dto2.setName("war");
			dto2.setLanguage("hindi");
			dto2.setRating(7);
			dto2.setBudget("150cr");

			MovieDTO dto3 = new MovieDTO();
			dto3.setName("joker");
			dto3.setLanguage("english");
			dto3.setRating(8);
			dto3.setBudget("300cr");

			LinkedList<MovieDTO> list = new LinkedList<MovieDTO>();
			list.add(dto1);
			list.add(dto2);
			list.add(dto3);

			MovieDAO dao = new MovieDAOImpl();
			dao.saveMovieList(list);

		} catch (Exception e) {
			System.err.println("exception in main method" + e.getMessage());
		}
	}

}
