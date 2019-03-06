package com.neuedu.java07.demo1;

public class Circle extends Shape{
	
	//private String name;
	private int r; 
	
	public Circle(String name, int r) {
		super(name);
		//this.name = name;
		this.r = r;
	}
	

	@Override
	public String toString() {
		return "Circle [name=" + name + ", r=" + r + "]";
	}

	@Override
	public int getArea(){ 
		return (int) (Math.PI * r * r);
	}

	
}

