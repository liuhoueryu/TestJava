package com.neuedu.java07.demo2;

//������
public class Cat extends Animal {

	public Cat(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println("��С��");
	}

	@Override
	public void shout() {
		System.out.println("����������");
	}

	public void climb() {
		System.out.println("�һ�����");
	}

	
}
