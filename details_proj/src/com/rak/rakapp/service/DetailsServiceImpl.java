package com.rak.rakapp.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rak.rakapp.dao.DetailsdaoAddress;
import com.rak.rakapp.dao.DetailsdaoPersonal;
import com.rak.rakapp.dto.Detailsdto;
import com.rak.rakapp.entity.Address;
import com.rak.rakapp.entity.Personal;

@Component
public class DetailsServiceImpl implements DetailsService {

	@Autowired
	private DetailsdaoAddress address;
	@Autowired
	private DetailsdaoPersonal personal;

	public DetailsServiceImpl() {
		System.out.println("created \t" + this.getClass().getName());
	}

	@Override
	public boolean validateAndSave(Detailsdto dto) {
		System.out.println("invoked validateandsave" + dto);
		String email = dto.getEmail();
		String password = dto.getPassword();
		String cpwd = dto.getConfirmPassword();
		boolean valid = true;
		if (email != null || !email.isEmpty() || email.length() > 8 && email.length() < 20) {
			System.out.println("email is valid");
		} else {
			System.out.println("email is invalid");
			valid = false;
		}
		if (password != null || !password.isEmpty() || password.length() > 8 && password.length() < 16) {
			System.out.println("password is valid");
		} else {
			System.out.println("password is invalid");
			valid = false;
		}
		if (password.equals(cpwd)) {
			System.out.println("password matches");
		} else {
			System.out.println("password doesnt match");
			valid = false;
		}

		Personal personalEntity = new Personal();
		BeanUtils.copyProperties(dto, personalEntity);
		this.personal.save(personalEntity);
		Address addressEntity = new Address();
		BeanUtils.copyProperties(dto, addressEntity);
		this.address.save(addressEntity);
		return valid;
	}

}
