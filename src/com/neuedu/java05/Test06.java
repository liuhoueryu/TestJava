package com.neuedu.java05;

//作业3
public class Test06 {

	public static void main(String[] args) {
		
		Point center = new Point(3, 5);
		
		Circle c = new Circle(center, 4);
		
		System.out.println(c);
		
		System.out.println("周长=" + c.getLength() + " 面积=" + c.getArea());

		Point p = new Point(4, 4);
		
		System.out.println(p + (c.contains(p) ? "在圆内部":"不在圆内部"));
		
	}

}
