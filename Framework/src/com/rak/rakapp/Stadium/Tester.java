package com.rak.rakapp.Stadium;

import com.rak.rakapp.Stadium.DAO.StadiumDAO;
import com.rak.rakapp.Stadium.DAO.StadiumDAOImp;
import com.rak.rakapp.Stadium.DTO.StadiumDTO;

public class Tester {
	public static void main(String[] args) {
		try {
			
		
		StadiumDTO dto=new StadiumDTO();
		dto.setCapacity(10000);
		dto.setEntryFee(100);
		dto.setNoOfEntry(5);
		dto.setParking(true);
		dto.setSid(2);
		
		StadiumDAO dao=new StadiumDAOImp();
		dao.save(dto);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
	}
}
