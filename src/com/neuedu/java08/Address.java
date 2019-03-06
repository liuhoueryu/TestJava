package com.neuedu.java08;

public class Address {

	private String city;
	private String area;
	
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
