package com.rak.rakapp.village;

import com.rak.rakapp.village.DAO.VillageDAO;
import com.rak.rakapp.village.DAO.VillageDAOIMPL;

public class UpdateTester {

	public static void main(String[] args) {
		VillageDAO dao = new VillageDAOIMPL();
		dao.updateByName("kotha", 2);

	}

}
