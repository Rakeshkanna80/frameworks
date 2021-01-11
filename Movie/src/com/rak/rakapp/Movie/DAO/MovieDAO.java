package com.rak.rakapp.Movie.DAO;


import java.util.List;
import java.util.Map;

import com.rak.rakapp.Movie.DTO.MovieDTO;

public interface MovieDAO {
	//public void saveMovieList(List<MovieDTO> list);
	
	//public Map<Integer,MovieDTO> getList(List<Integer> idList);
	
	public MovieDTO fetchByName(String name);
	
	public long fetchIdByName(String name);
	
	public String fetchlanguageByIdAndBudget(long id,String budget);
	
	public double fetchRatingByNameAndId(String name,long id);
	
	public Object[] fetchLangAndBudgetByName(String name);
}
