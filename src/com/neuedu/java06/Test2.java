package com.neuedu.java06;

//子类对象的创建过程
public class Test2 {

	public static void main(String[] args) throws Exception {

		//父类的无参构造
		//Parent p = new Parent();
		//p.method();
		
		//父类的有参构造
		//Parent p = new Parent(10);
		//p.method();
		
		//子类的无参构造
		//Child c = new Child();
		//c.method();
		
		/*
		 * 父类静态块
		子类静态块
		父类构造块
		父类无参构造方法
		子类构造块
		子类无参构造方法
		子类普通方法
		*/
		
		//子类的无参构造
		Child c = new Child(10);
		c.method();
				
		/*
		 * 父类静态块
		子类静态块
		父类构造块
		父类无参构造方法
		子类构造块
		子类有参构造方法 i=10
		子类普通方法
		
				 */
	}

}
