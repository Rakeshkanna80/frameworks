package com.rak.rakapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rak.rakapp.annot.Billionarie;

public class JcTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/springjc.xml");
		Billionarie billionarie=applicationContext.getBean(Billionarie.class);
		billionarie.getHome();
		
		ClassPathXmlApplicationContext classpath=(ClassPathXmlApplicationContext)applicationContext;
		classpath.close();
	}

}
