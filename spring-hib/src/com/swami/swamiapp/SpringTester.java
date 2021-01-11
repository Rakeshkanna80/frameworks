package com.swami.swamiapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.swami.swamiapp.dao.SwamijiDAO;
import com.swami.swamiapp.dto.SwamijiDTO;

public class SpringTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring.xml");
		SwamijiDAO dao=applicationContext.getBean(SwamijiDAO.class);
		dao.savedto(new SwamijiDTO("deepak","db",false));
		
		
	}

}
