package com.rak.rakapp.DAO;

import java.util.List;

import com.rak.rakapp.DTO.ProductDTO;

public interface ProductDAO {
	public void save(List<ProductDTO> list);
	
	public List<String> fetchNameList();
	
	public List<Double> fetchPriceList();
	
	public List<Object[]> fetchNameandPriceByQuantity(int quantity);
	
	public List<Object[]> fetchCountofEntityByQuantity(int quantity);
}
