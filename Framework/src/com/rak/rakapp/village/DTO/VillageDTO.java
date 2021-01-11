package com.rak.rakapp.village.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="village_table")
public class VillageDTO implements Serializable{
	@Id
	@GenericGenerator(name="village",strategy="increment")
	@GeneratedValue(generator="village")
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="pincode")
	private int pincode;
	@Column(name="population")
	private int population;
	@Column(name="famousfor")
	private String famousFor;
	
	public VillageDTO() {
		System.out.println("created a constructor");
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

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}
	
	
}
