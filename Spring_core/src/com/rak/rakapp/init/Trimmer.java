package com.rak.rakapp.init;

public class Trimmer {
	private String brand;
	private String price;
	private int weight;

	public Trimmer(String brand, String price) {
		System.out.println("created  \t" + this.getClass().getSimpleName());
		this.brand = brand;
		this.price = price;
		System.out.println(brand+" "+price);
	}

	public Trimmer(int weight,String brand) {
		System.out.println("created2 \t" + this.getClass().getSimpleName());

		this.weight = weight;
		this.brand = brand;
		System.out.println(weight+" "+brand);     
	}

	public void trim() {
		System.out.println("invoked trim");
	}

}
