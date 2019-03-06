package com.neuedu.java06;

public class Rectangle extends Shape {

	//private String name;
	private int width, height;
	
	public Rectangle(String name, int width, int height) {
		super(name);
		//this.name = name;
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [name=" + name + ", width=" + width + ", height=" + height + "]";
	}
	
	@Override
	public int getArea(){ 
		return width * height;
	}
}
