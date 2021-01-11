package com.rak.rakapp.Transport.DAO;

import org.hibernate.HibernateException;

import com.rak.rakapp.village.DTO.VillageDTO;

public class TransportDAOImpl implements TransportDAO{

	@Override
	public void save(VillageDTO dto) {
		try {
			
		} catch (HibernateException e) {
			System.err.println("");
		}
	}
	
}
