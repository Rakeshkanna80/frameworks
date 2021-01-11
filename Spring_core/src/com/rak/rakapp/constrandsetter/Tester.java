package com.rak.rakapp.constrandsetter;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String path = "Resources/combine.xml";
			ApplicationContext ac = new ClassPathXmlApplicationContext(path);
			System.out.println(ac.getBean(Stethoscope.class).getBrand());
			System.out.println("``````````````````````````````````````````````````");
			System.out.println(ac.getBean(Rainbow.class).getIntensity());
			if (ac != null) {
				System.out.println(ac.getBean(Rainbow.class).isThere());
			}
			System.out.println("``````````````````````````````````````````````````");
			Thread t = ac.getBean(Thread.class);

			t.start();
			Thread.sleep(7000);

			DriverManagerDataSource dataSource = ac.getBean(DriverManagerDataSource.class);
			dataSource.getConnection();
			dataSource.getUrl();
			dataSource.getUsername();
			dataSource.getPassword();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
           
}
