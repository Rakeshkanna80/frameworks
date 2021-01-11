package com.rak.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rak.mvc.dto.ShaadiDTO;
import com.rak.mvc.service.ShaadiService;
import com.rak.mvc.service.ShaadiServiceImpl;

@Component
@RequestMapping("/")
public class Shaadi {

	@Autowired
	ShaadiService shaadiService;

	public Shaadi() {
		System.out.println("created \t Shaadi");
	}

	@RequestMapping(value = "/shaadi.sha", method = RequestMethod.POST)
	public String addDetails(ShaadiDTO dto,ModelMap map) {
		System.out.println("invoked addDetails");
		System.out.println(dto);
		boolean saved=this.shaadiService.validateAndSave(dto);
		if (saved) {
			System.out.println("saved successfully");
			map.addAttribute("message", "Registration success");
		} else {
			System.out.println("not saved");
			map.addAttribute("message","Registration failed,try again");
			return "/shaadi.jsp";
		}
		return "/homepage.jsp";

	}

}
