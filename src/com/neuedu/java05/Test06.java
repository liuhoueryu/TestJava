package com.neuedu.java05;

//��ҵ3
public class Test06 {

	public static void main(String[] args) {
		
		Point center = new Point(3, 5);
		
		Circle c = new Circle(center, 4);
		
		System.out.println(c);
		
		System.out.println("�ܳ�=" + c.getLength() + " ���=" + c.getArea());

		Point p = new Point(4, 4);
		
		System.out.println(p + (c.contains(p) ? "��Բ�ڲ�":"����Բ�ڲ�"));
		
	}

}
