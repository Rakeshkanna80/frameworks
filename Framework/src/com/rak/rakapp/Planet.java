package com.rak.rakapp;

import java.io.Serializable;

public class Planet implements Serializable{
	public static void main(String[] args) {
		Planet planet=new Planet();
		planet.setName("mercury");
		System.out.println(planet.getName());
		System.out.println(planet.getAvgTemp());
	}
	
	private String name;
	private double AvgTemp;
	
	public Planet() {
		System.out.println("default cons");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name; 
		
	}
	public double getAvgTemp() {
		return 13.3;
	}
	

}
