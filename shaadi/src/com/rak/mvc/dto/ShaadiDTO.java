package com.rak.mvc.dto;

import java.io.Serializable;

public class ShaadiDTO implements Serializable {

	private String name;
	private String dob;
	private String gender;
	private String status;
	private String occupation;
	private String lookingfor;
	
	public ShaadiDTO() {
		System.out.println("created \t shaadidto");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getLookingfor() {
		return lookingfor;
	}

	public void setLookingfor(String lookingfor) {
		this.lookingfor = lookingfor;
	}

	@Override
	public String toString() {
		return "ShaadiDTO [name=" + name + ", dob=" + dob + ", gender=" + gender + ", status=" + status
				+ ", occupation=" + occupation + ", lookingfor=" + lookingfor + "]";
	}

}
