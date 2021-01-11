package com.rak.rakapp;

public class Port {
	public Port() {
		System.out.println("created"+this.getClass().getSimpleName());
	}
	public void importGoods() {
		System.out.println("invoked goods");
	}
}
