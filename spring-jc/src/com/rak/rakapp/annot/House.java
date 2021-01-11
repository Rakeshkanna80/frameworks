package com.rak.rakapp.annot;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class House {

	@Value("5")
	private int no;
	
	public House() {
		System.out.println("hutide \t"+this.getClass().getSimpleName());
	}
	@PostConstruct
	public void stay() {
		System.out.println("started staying");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("destroyed resources");
	}
	
	
	
}
