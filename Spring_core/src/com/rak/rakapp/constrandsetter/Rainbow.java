package com.rak.rakapp.constrandsetter;

public class Rainbow {
	private String color;
	private float intensity;
	private boolean there;
	
	public Rainbow(String color) {
		System.out.println("created \t"+this.getClass().getSimpleName());
		this.color=color;
		System.out.println(color);
	}
	public void setIntensity(float intensity) {
		this.intensity = intensity;
	}
	public float getIntensity() {
		return intensity;
	}
	public void setThere(boolean there) {
		this.there = there;
	}
	public boolean isThere() {
		return there;
	}
	
	
}
