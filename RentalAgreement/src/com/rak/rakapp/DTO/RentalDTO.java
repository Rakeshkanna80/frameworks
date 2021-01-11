package com.rak.rakapp.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="rental_table")
public class RentalDTO implements Serializable {
	@Id
	@GenericGenerator(name = "rental", strategy = "increment")
	@GeneratedValue(generator="rental")
	private int id;
	@Columns(columns = { @Column })
	private String OwnerName;
	private String TenantName;
	private String Address;
	private String Rent;
	private String Deposit;
	
	public RentalDTO() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOwnerName() {
		return OwnerName;
	}

	public void setOwnerName(String ownerName) {
		OwnerName = ownerName;
	}

	public String getTenantName() {
		return TenantName;
	}

	public void setTenantName(String tenantName) {
		TenantName = tenantName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getRent() {
		return Rent;
	}

	public void setRent(String rent) {
		Rent = rent;
	}

	public String getDeposit() {
		return Deposit;
	}

	public void setDeposit(String deposit) {
		Deposit = deposit;
	}

	@Override
	public String toString() {
		return "RentalDTO [id=" + id + ", OwnerName=" + OwnerName + ", TenantName=" + TenantName + ", Address="
				+ Address + ", Rent=" + Rent + ", Deposit=" + Deposit + ", getId()=" + getId() + ", getOwnerName()="
				+ getOwnerName() + ", getTenantName()=" + getTenantName() + ", getAddress()=" + getAddress()
				+ ", getRent()=" + getRent() + ", getDeposit()=" + getDeposit() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
