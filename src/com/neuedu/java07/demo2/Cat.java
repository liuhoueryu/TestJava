package com.neuedu.java07.demo2;

//具体类
public class Cat extends Animal {

	public Cat(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println("吃小鱼");
	}

	@Override
	public void shout() {
		System.out.println("喵喵。。。");
	}

	public void climb() {
		System.out.println("我会爬树");
	}

	
}
