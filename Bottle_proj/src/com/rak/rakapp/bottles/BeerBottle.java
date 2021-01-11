package com.rak.rakapp.bottles;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class BeerBottle implements Bottle {

	

	//@PostConstruct
	@Override
	public void openBottle() {
		System.out.println("beer bottle opened");
	}

}
