package com.rak.rakapp.bottles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rakesh {
	
	@Autowired
	@Qualifier("beerBottle")
	private Bottle bottle;
	
	public void openingBottle() {
		bottle.openBottle();
	}
	

}
