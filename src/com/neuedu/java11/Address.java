package com.neuedu.java11;

import java.io.Serializable;

public class Address implements Serializable{

	private String city, area;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Address(String city, String area) {
		super();
		this.city = city;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + "]";
	}
	
	
}
