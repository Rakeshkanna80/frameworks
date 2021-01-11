package com.rak.rakapp.ref;

public class Drama {
	private String CompanyName;
	private MakeupKit kit;
	
	public Drama() {
		// TODO Auto-generated constructor stub
		System.out.println("created \t"+this.getClass().getSimpleName());
	}
	
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public void setKit(MakeupKit kit) {
		this.kit = kit;
	}
	
	public void natak() {
		System.out.println("shuruagide natak");
	}

}
