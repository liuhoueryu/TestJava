package com.neuedu.java07.demo2;

//具体类
public class Dog extends Animal {

	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println("吃骨头");
	}

	@Override
	public void shout() {
		System.out.println("汪汪。。。");
	}
	
	public void guard(){
		System.out.println("我会看家");
	}

}
