package com.rak.rakapp.dto;

import java.io.Serializable;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Detailsdto implements Serializable {

	private String name;
	private long phone;
	private String email;
	private String password;
	private String confirmPassword;
	private String street;
	private String address;
	private String city;
	private int pincode;

	public Detailsdto() {
		System.out.println("created \t" + this.getClass().getCanonicalName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Detailsdto [name=" + name + ", phone=" + phone + ", email=" + email + ", password=" + password
				+ ", street=" + street + ", address=" + address + ", city=" + city + ", pincode=" + pincode + "]";
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
