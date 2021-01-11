package com.rak.rakapp.ref;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "Resources/makeup.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(path);
		//MakeupKit kit = applicationContext.getBean(MakeupKit.class);
		Women women = applicationContext.getBean(Women.class);

	}

}
