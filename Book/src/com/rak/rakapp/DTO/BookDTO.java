package com.rak.rakapp.DTO;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table(name="book_table")
public class BookDTO implements Serializable{
	
	@GenericGenerator(name="book",strategy="increment")
	@Id
	@GeneratedValue(generator="book")
	private int id;
	@Column(name="book_Name")
	private String bookName;
	@Column(name="author_name")
	private String authorName;
	@Type(type="date")
	@Column(name="publish_date")
	private Date publishDate;
	
	public BookDTO() {
		System.out.println("constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
}
