package com.rak.rakapp.ref;

public class MakeupKit {
	private String application;
	private String type;
	
	public void setApplication(String application) {
		System.out.println("invoked \t"+application);
		this.application = application;
	}
	public void setType(String type) {
		System.out.println("invoked \t"+type);
		this.type = type;
	}
	
}
