package com.rak.rakapp.tasks;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/")
public class Main {
	public Main() {
		System.out.println("created \t" + this.getClass().getSimpleName());
	}

	@RequestMapping(value = "/country.wwe", method = RequestMethod.POST)
	public String country(@RequestParam String countryid, @RequestParam String countryName,
			@RequestParam String population) {
		System.out.println("invoked country");
		System.out.println(countryid + countryName + population);

		return "/final.jsp";

	}

	@RequestMapping(value = "/done.wwe", method = RequestMethod.POST)
	public String done() {
		return "/movie.jsp";

	}

	@RequestMapping(value = "/movie.wwe", method = RequestMethod.POST)
	public String movie(@RequestParam String name, @RequestParam String budget, @RequestParam String rating,
			@RequestParam String language, @RequestParam String certificate) {
		System.out.println("invoked movie");
		System.out.println(name + budget + rating + language + certificate);
		return "/final.jsp";

	}
	
	
}
