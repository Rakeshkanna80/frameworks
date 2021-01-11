package com.rak.rakapp;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zaxxer.hikari.HikariDataSource;

public class HikariDemo {
	public static void main(String[] args) {
		try {
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resources/hikari.xml");
			HikariDataSource dataSource = applicationContext.getBean(HikariDataSource.class);

			dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
