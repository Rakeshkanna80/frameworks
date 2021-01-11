package com.rak.rakapp.Movie.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

@Entity
@Table(name = "movie_table")
public class MovieDTO implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;
	@Columns(columns = { @Column })
	private String name;
	// @Column(name="language")
	private String language;
	// @Column(name="rating")
	private double rating;
	// @Column(name="budget")
	private String budget;

	public MovieDTO() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
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

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getBudget() {
		return budget;
	}

	public void setBudget(String budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "MovieDTO [id=" + id + ", name=" + name + ", language=" + language + ", rating=" + rating + ", budget="
				+ budget + "]";
	}

}
