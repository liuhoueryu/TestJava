package com.neuedu.java06;

public class Triangle extends Shape {

	private int width, height;
	
	public Triangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	
	@Override
	public String toString() {
		return "Triangle [width=" + width + ", height=" + height + "]";
	}


	@Override
	public int getArea() {
		return width * height / 2;
	} 

}
