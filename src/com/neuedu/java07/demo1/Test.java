package com.neuedu.java07.demo1;

//��̬---��Գ�������
public class Test {

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
		
		
		Shape s1 = getShape(2);
		print(s1);
		
		
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
	
	//��̬2---���������ǳ�������   ��̬��������
	static Shape getShape(int type){   //type 1 circle  2 rect  3 triangle
		
		if(type==1){
			return new Circle("Բ��", 2);
		}else if(type==2){
			return new Rectangle("����", 4, 5);
		}else{
			return new Triangle("������", 4, 5);
		}
	}
	
}
