package com.rak.rakapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rak.rakapp.bottles.Rakesh;

public class Tester {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/bottle.xml");
		applicationContext.getBean(Rakesh.class);
	}

}
