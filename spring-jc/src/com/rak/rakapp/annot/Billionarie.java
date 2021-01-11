package com.rak.rakapp.annot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Billionarie {

	private String name;

	private House house;

	@Autowired
	public Billionarie(@Value(value = "rakesh") String name) {
		System.out.println("created \t" + name);

	}
	
	public void getHome() {
		if (house!=null) {
			house.stay();
		}
	}

}
