package com.rak.rakapp.constrandsetter;

public class Stethoscope {
	private String brand;
	
	public Stethoscope() {
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand() {
		return brand;
	}
}
