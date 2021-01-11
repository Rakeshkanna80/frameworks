package com.rak.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rak.mvc.dao.ShaadiDAO;
import com.rak.mvc.dto.ShaadiDTO;

@Component
public class ShaadiServiceImpl implements ShaadiService {
	
	@Autowired
	ShaadiDAO shaadiDAO;

	public ShaadiServiceImpl() {
		System.out.println("created \t"+this.getClass().getTypeName());
	}

	@Override
	public boolean validateAndSave(ShaadiDTO dto) {
		
		return false;
	}

}
