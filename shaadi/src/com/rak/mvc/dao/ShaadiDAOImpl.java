package com.rak.mvc.dao;

import org.springframework.stereotype.Component;

import com.rak.mvc.dto.ShaadiDTO;


@Component
public class ShaadiDAOImpl implements ShaadiDAO{

	public ShaadiDAOImpl() {
		System.out.println("created \t"+this.getClass().getCanonicalName());
	}

	@Override
	public void save(ShaadiDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("invoked save");

	}

	
	
}
