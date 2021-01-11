package com.rak.rakapp.village;

import com.rak.rakapp.village.DAO.VillageDAO;
import com.rak.rakapp.village.DAO.VillageDAOIMPL;
import com.rak.rakapp.village.DTO.VillageDTO;

public class Tester {

	public static void main(String[] args) {
		try {
			VillageDTO dto=new VillageDTO();
			dto.setName("mirzapur");
			dto.setPincode(585444);
			dto.setPopulation(5000);
			dto.setFamousFor("idli");
			
			VillageDAO dao=new VillageDAOIMPL();
			dao.Save(dto);
			
			
		} catch (Exception e) {
			System.err.println("lagaye"+e.getMessage());
		}
	}

}
