package com.neuedu.java05;

//区分改变对象的指向和改变对象的内容
public class Test03 {

	public static void main(String[] args) {
			 
		Person p = new Person("张三", "男", 20);
		
		change(p);

		System.out.println(p);
	}
	
	static void change(Person p){
		
		//改变对象的内容
		//p.setName("李四");
		//p.setGender("女");
		//p.setAge(30);
		
		//改变对象的指向
		p = new Person("李四", "女", 30);
	}

}
