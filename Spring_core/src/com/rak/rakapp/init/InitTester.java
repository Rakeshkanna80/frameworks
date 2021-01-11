package com.rak.rakapp.init;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitTester {

	public static void main(String[] args) {

		try {
			String path = "Resources/init.xml";
			ApplicationContext container = new ClassPathXmlApplicationContext(path);
			container.getBean(Water.class).flow("Shimoga");

			container.getBean(Barber.class).hairDesigning("nikunj");

			container.getBean("trimmer", Trimmer.class).trim();
			container.getBean("trimmer1",Trimmer.class);
		} catch (Exception e) {
			e.printStackTrace();

		}
	}

}
