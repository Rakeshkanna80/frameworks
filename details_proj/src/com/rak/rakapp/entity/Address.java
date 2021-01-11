package com.rak.rakapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "address_table")
public class Address {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	@Column(name = "street")
	private String street;
	@Column(name = "address")
	private String address;
	@Column(name = "city")
	private String city;
	@Column(name = "pincode")
	private int pincode;

	public Address() {
		System.out.println("created \t" + this.getClass().getName());
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
		return "Address [street=" + street + ", address=" + address + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
