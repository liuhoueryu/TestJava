package com.neuedu.java06;

//abstract����Գ������ͱ��
public class Test3 {

	public static void main(String[] args) throws Exception {

		/*
		//��Ծ�������
		Circle c = new Circle("Բ��", 2);
		print(c);
		
		Rectangle r = new Rectangle("����", 4 , 5);
		print(r);
		*/
		
		//Shape s = new Shape();   //�����಻��ֱ��ʵ����
		
		//��̬  ͬһ�����ñ���������������ָ��Ĳ�ͬ�ľ������ʵ�������¶�ͬһ����Ϣ�������˲�ͬ����Ӧ���
		Shape s = new Circle("Բ��", 2);
		//System.out.println(s.getArea());
		print(s);
		
		s = new Rectangle("����", 4 , 5);
		//System.out.println(s.getArea());
		print(s);
		
		s = new Triangle("������", 4 , 5);
		//System.out.println(s.getArea());
		print(s);
		
	}
	
	/*static void printCircle(Circle c){
		System.out.println(c + " ���=" + c.getArea());
	}

	static void printRectangle(Rectangle r){
		System.out.println(r + " ���=" + r.getArea());
	}*/
	
	/*//����
	static void print(Circle c){
		System.out.println(c + " ���=" + c.getArea());
	}
	
	static void print(Rectangle r){
		System.out.println(r + " ���=" + r.getArea());
	}*/
	
	//��̬1---��ڲ����ǳ�������
	static void print(Shape s){
		System.out.println(s + " ���=" + s.getArea());
	}
	
	
}
