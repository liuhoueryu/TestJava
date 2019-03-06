package com.neuedu.java07.demo4;

public class Chinese extends Person {

	@Override
	protected void greet() {
		System.out.println("早安");
	}

	@Override
	protected void eat() {
		System.out.println("吃饺子和面条");
	}

	@Override
	protected void bye() {
		System.out.println("晚安");

	}

}
