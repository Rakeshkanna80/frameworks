package com.rak.rakapp.init;

public class Water {
	private float phLevel;

	public Water(float phLevel) {
		// TODO Auto-generated constructor stub
		System.out.println("created \t" + this.getClass().getSimpleName());
		this.phLevel = phLevel;
	}

	public void flow(String location) {
		System.out.println("location:" + location);
	}
}
