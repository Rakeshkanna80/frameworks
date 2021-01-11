package com.rak.rakapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTester {
	public static void main(String[] args) {
		String congifFilePath = "file:C:\\Users\\Rakesh kanna\\OneDrive\\Desktop\\context.xml";
		ApplicationContext spring = new ClassPathXmlApplicationContext(congifFilePath);

		/*
		 * Port refOfPort=spring.getBean(Port.class); refOfPort.importGoods();
		 * System.out.println(refOfPort);
		 */

		int count = spring.getBeanDefinitionCount();
		System.out.println(count);

		String refOfString = spring.getBean(String.class);
		System.out.println(refOfString.isEmpty());

		Object refOfObject = spring.getBean("object", Object.class);
		System.out.println(refOfObject);

		Exception refOfException = spring.getBean(Exception.class);
		System.out.println(refOfException.getMessage());

		Thread refOfThread = spring.getBean(Thread.class);
		System.out.println(refOfThread.isAlive());

	}
}
