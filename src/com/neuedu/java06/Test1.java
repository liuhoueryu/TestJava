package com.neuedu.java06;

//继承的基本使用
public class Test1 {

	public static void main(String[] args) {

		Person p = new Person("张三");
		p.show();
		
		Student s = new Student("李四");
		s.show();
		
		Student s2 = new Student("王五", 90);
		
		//Person p = new Person("张三", "男", 10);
		//p.show();
		
		//Student s = new Student("李四", "女", 20);
		//s.show2();
	}

}
