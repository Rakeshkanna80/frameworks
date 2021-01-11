package com.rak.rakapp.bottles;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Waterbottle implements Bottle {

	
	//@PostConstruct
	@Override
	public void openBottle() {
		System.out.println("water bottle class");
	}

}
