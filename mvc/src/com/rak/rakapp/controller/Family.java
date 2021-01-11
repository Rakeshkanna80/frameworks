package com.rak.rakapp.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Family {
	public Family() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/family.rak", method = RequestMethod.POST)
	public String onAdd(@RequestParam String familyName, @RequestParam String memberName,
			@RequestParam String occupation, @RequestParam String place, @RequestParam String gender) {
		System.out.println("invoked onAdd");
		System.out.println("details");
		System.out.println(familyName+" " + memberName +" "+ occupation+" " + place +" "+ gender);
		return "/success.jsp";
	}
}
