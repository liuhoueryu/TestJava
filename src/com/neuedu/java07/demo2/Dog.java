package com.neuedu.java07.demo2;

//������
public class Dog extends Animal {

	public Dog(String name, String color) {
		super(name, color);
	}

	@Override
	public void eat() {
		System.out.println("�Թ�ͷ");
	}

	@Override
	public void shout() {
		System.out.println("����������");
	}
	
	public void guard(){
		System.out.println("�һῴ��");
	}

}
