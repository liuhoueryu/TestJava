package com.neuedu.java05;

//数据初始化---构造器
public class Test02 {

	public static void main(String[] args) {

		Person p1 = new Person("张三", "男", 20);
		System.out.println(p1);
		
		System.out.println("----------------------");
		
		Person p2 = new Person("李四", "女", 30);
		System.out.println(p2);
	
		System.out.println("----------------------");
		
		Person p3 = new Person("王五", "女");
		System.out.println(p3);
		
		System.out.println("----------------------");
		
		Person p4 = new Person("赵六");
		System.out.println(p4);
		
	}

}
