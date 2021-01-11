package com.rak.rakapp.Transport.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="transport_table")
public class TransportDTO implements Serializable {
	@Id
	@GenericGenerator(name="transport",strategy="increment")
	@GeneratedValue(generator="transport")
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="state")
	private String state;
	@Column(name="cpuntry")
	private String country;
	
	public TransportDTO() {
		System.out.println("default constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	

}
