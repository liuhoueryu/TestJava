package com.neuedu.java06;

//�г��󷽷�����һ���ǳ�����,���ǳ������в�һ���г��󷽷�
public abstract class Shape {
	
	protected String name;

	public Shape(String name) {
		super();
		this.name = name;
	}
	
	//���󷽷�
	public abstract int getArea();
}