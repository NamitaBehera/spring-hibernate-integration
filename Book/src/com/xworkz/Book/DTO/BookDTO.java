package com.xworkz.Book.DTO;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="book_table")
public class BookDTO implements Serializable {
	
	private int id;
	private String name;
	private int pages;
	private int price;
	
	public BookDTO() {
		System.out.println("invoked private constructor");
	}
	public BookDTO(String name, int pages, int price) {
		this.name = name;
		this.pages = pages;
		this.price = price;
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

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", name=" + name + ", pages=" + pages + ", price=" + price + "]";
	}


	
}
