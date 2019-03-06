package com.neuedu.java07.demo4;

public class English extends Person {

	@Override
	protected void greet() {
		System.out.println("good morning");
	}

	@Override
	protected void eat() {
		System.out.println("eat hamburger and pizza");
	}

	@Override
	protected void bye() {
		System.out.println("good night");
	}

}
