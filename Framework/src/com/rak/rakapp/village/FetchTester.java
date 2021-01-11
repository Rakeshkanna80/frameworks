package com.rak.rakapp.village;

import com.rak.rakapp.village.DAO.VillageDAO;
import com.rak.rakapp.village.DAO.VillageDAOIMPL;

public class FetchTester {

	public static void main(String[] args) {
		VillageDAO dao=new VillageDAOIMPL();
		System.out.println("Main started");
		dao.fetchById(2);
	}

}
