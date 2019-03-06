package com.neuedu.java05;

//static关键字
public class Test08 {

	public static void main(String[] args) {

		//接收main方法的入口参数
		System.out.println("args=" + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		//静态变量的使用---类名.属性名    类名.方法名()
		System.out.println(Person.count);

		System.out.println(Person.getCount());

		
		Person p1 = new Person("p1", "男", 20);
		
		//静态变量的使用2---对象名.属性名   对象名.方法名()
		System.out.println(p1.count);
		System.out.println(p1.getCount());

		//Person p2 = new Person("p2", "女", 30);
		//System.out.println(Person.count);
		
	}

}
