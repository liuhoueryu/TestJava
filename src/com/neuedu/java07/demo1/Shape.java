package com.neuedu.java07.demo1;

//有抽象方法的类一定是抽象类,但是抽象类中不一定有抽象方法
public abstract class Shape {
	
	protected String name;

	public Shape(String name) {
		super();
		this.name = name;
	}
	
	//抽象方法
	public abstract int getArea();
}
