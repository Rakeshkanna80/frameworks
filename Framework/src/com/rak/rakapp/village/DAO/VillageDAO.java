package com.rak.rakapp.village.DAO;

import com.rak.rakapp.village.DTO.VillageDTO;

public interface VillageDAO {
	public void Save(VillageDTO dto);
	
	public VillageDTO fetchById(int id);

	public default void  updateByName(String name,int id) {
		System.out.println("updating details");
	}
	
}
