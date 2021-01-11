package com.swami.swamiapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="swamiji_table")
public class SwamijiDTO implements Serializable{
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	@Column(name="id")
	private Integer id;
	@Column(name="name")
	private String swamiName;
	@Column(name="ashrama")
	private String ashrama;
	@Column(name="married")
	private Boolean married;
	
	public SwamijiDTO(String swamiName, String ashrama, Boolean married) {
		super();
		this.swamiName = swamiName;
		this.ashrama = ashrama;
		this.married = married;
	}
	
	public SwamijiDTO() {
		System.out.println("created /t"+this.getClass().getSimpleName());
	}

	public String getSwamiName() {
		return swamiName;
	}

	public void setSwamiName(String swamiName) {
		this.swamiName = swamiName;
	}

	public String getAshrama() {
		return ashrama;
	}

	public void setAshrama(String ashrama) {
		this.ashrama = ashrama;
	}

	public Boolean getMarried() {
		return married;
	}

	public void setMarried(Boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "SwamijiDTO [id=" + id + ", swamiName=" + swamiName + ", ashrama=" + ashrama + ", married=" + married
				+ "]";
	}
}
