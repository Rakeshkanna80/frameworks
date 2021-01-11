package com.rak.rakapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rak.rakapp.dto.Detailsdto;
import com.rak.rakapp.service.DetailsService;

@Component
@RequestMapping("/")
public class DetailsController {

	@Autowired
	private DetailsService detailsService;

	public DetailsController() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/personal.det", method = RequestMethod.POST)
	public String addPersonal(Detailsdto dto) {
		System.out.println("invoked addpersonal");
		boolean saved = this.detailsService.validateAndSave(dto);
		if (saved) {
			System.out.println("saved successfully");
			return "success.jsp";
		} else {
			System.out.println("not saved");
		}
		return "details.jsp";
		
	}
}
