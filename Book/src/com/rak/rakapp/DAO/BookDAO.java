package com.rak.rakapp.DAO;

import com.rak.rakapp.DTO.BookDTO;

public interface BookDAO {
	public void save(BookDTO dto);
	
	
	public BookDTO readById(int id);
	
	public BookDTO updateByName(String authorName,int id);
	
	public BookDTO deleteById(int id);
	
}
