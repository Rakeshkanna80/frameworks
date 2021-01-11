package com.rak.rakapp.ref;

public class Women {
	private String event;
	private double budget;
	private MakeupKit kit;
	
	public Women(String event,double budget) {
		System.out.println("created \t"+this.getClass().getSimpleName());
		this.event=event;
		this.budget=budget;
	}
	public void setKit(MakeupKit kit) {
		System.out.println("invoked \t"+kit);
		this.kit = kit;
	}

	
	
}
