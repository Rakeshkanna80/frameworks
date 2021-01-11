package com.rak.rakapp.DTO;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product_tabele")
@NamedQueries({ @NamedQuery(name = "fetchNameList", query = "select product.name from ProductDTO as product"),
		@NamedQuery(name = "fetchCountofEntityByQuantity", query = "select count(*) from ProductDTO"),
		@NamedQuery(name = "fetchPriceList", query = "select product.price from ProductDTO as product"),
		@NamedQuery(name = "fetchNameandPriceByQuantity", query = "select product.name,product.price from ProductDTO as product where product.quantity=:qty") })

public class ProductDTO implements Serializable {
	@Id
	@GenericGenerator(name = "product", strategy = "increment")
	@GeneratedValue(generator = "product")
	private int id;
	@Columns(columns = { @Column })
	private String name;
	private int quantity;
	private double price;

	public ProductDTO() {
		// TODO Auto-generated constructor stub
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

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
