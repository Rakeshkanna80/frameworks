package com.rak.rakapp.Stadium.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="stadium_table")
public class StadiumDTO implements Serializable {
	@Id
	@Column(name="stadium_id")
	private int sid;
	@Column(name="stadium_capacity")
	private int capacity;
	@Column(name="stadium_entryfee")
	private double entryFee;
	@Column(name="stadium_noOfEntry")
	private int noOfEntry;
	@Column(name="stadium_parking")
	private boolean parking;
	
	public StadiumDTO() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(double entryFee) {
		this.entryFee = entryFee;
	}

	public int getNoOfEntry() {
		return noOfEntry;
	}

	public void setNoOfEntry(int noOfEntry) {
		this.noOfEntry = noOfEntry;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "StadiumDto [sid=" + sid + ", capacity=" + capacity + ", entryFee=" + entryFee + ", noOfEntry="
				+ noOfEntry + ", parking=" + parking + "]";
	}
	
}
