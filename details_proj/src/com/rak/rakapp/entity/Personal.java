package com.rak.rakapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "personal_table")
public class Personal {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "phone")
	private long phone;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	private String confirmPassword;

	public Personal() {
		System.out.println("created \t" + this.getClass().getSimpleName());
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

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Override
	public String toString() {
		return "Personal [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", password="
				+ password + ", confirmPassword=" + confirmPassword + "]";
	}

}
