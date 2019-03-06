package com.neuedu.java10;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Book implements Comparable<Book>{

	private String name;
	private Integer price;
	private Date pubtime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Date getPubtime() {
		return pubtime;
	}
	public void setPubtime(Date pubtime) {
		this.pubtime = pubtime;
	}
	
	@Override
	public String toString() {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		
		return "Book [name=" + name + ", price=" + price + ", pubtime=" + df.format(pubtime) + "]";
	}
	
	public Book(String name, Integer price, Date pubtime) {
		super();
		this.name = name;
		this.price = price;
		this.pubtime = pubtime;
	}
	@Override
	public int compareTo(Book book) {
		return this.price>book.price ? 1 : this.price<book.price ? -1 : -1 * this.pubtime.compareTo(book.pubtime);
	}
	
	
}
