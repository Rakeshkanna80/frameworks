package com.rak.rakapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RailwayStation {
	public static void main(String[] args) {
		RailwayStation r=new RailwayStation();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date d=null;
		try {
			d=sdf.parse("12/09/1996");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.setName("KSR");
		System.out.println(r.getName());
		r.setCode("1234");
		System.out.println(r.getCode());
		r.setLocation("Bengaluru");
		System.out.println(r.getLocation());
		r.setBuildDate(d);
		System.out.println(d);
		
	}
	private String name;
	private String code;
	private String location;
	private Date buildDate;
	
	public RailwayStation() {
		System.out.println("default constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBuildDate() {
		return buildDate;
	}

	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}
	

}
