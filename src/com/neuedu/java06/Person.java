package com.neuedu.java06;

public class Person {
	/*
	protected String name;
	private String gender;
	private int age;
	
    
	public Person(){
		System.out.println("������޲ι���");
	}
	
	
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
*/
	
	protected String name;
	
	public Person(String name) {
		super();
		this.name = name;
	}


	public void show(){
		System.out.println("������ name=" + this.name);
	}
	
	
}
