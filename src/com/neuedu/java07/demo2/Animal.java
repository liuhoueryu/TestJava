package com.neuedu.java07.demo2;

//≥ÈœÛ¿‡
public abstract class Animal {

	private String name;
	private String color;
	
	public Animal(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public abstract void eat();
	
	public abstract void shout();
}
