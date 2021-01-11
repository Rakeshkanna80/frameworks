package com.rak.rakapp.init;

public class Barber {
	private String name;
	private int experience;

	public Barber(String name, int experience) {
		System.out.println("created \t" + this.getClass().getSimpleName());
		this.experience = experience;
		this.name = name;
	}

	public void hairDesigning(String name) {
		System.out.println("name:" + name);
	}
}
