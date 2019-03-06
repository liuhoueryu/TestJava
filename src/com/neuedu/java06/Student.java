package com.neuedu.java06;

public class Student extends Person {

	/*private int score;
	
	public Student(String name, String gender, int age) {
		super(name, gender, age);
	}

	public Student(String name, String gender, int age, int score) {
		super(name, gender, age);
		this.score = score;
	}

	public void show2() {
		super.show();
		this.show();
	}
	
	//@Override
	//public void show() {
	//	System.out.println("我是学生");
	//}
	*/
	
	private int score;
	
	private String name;
	
	public Student(String name) {
		super(name);
	}

	public Student(String name, int score) {
		super(name);
		this.score = score;
	}

	//扩充
	public void show2() {
		show(); 
		//没有重写show方法时      show()  super.show()  this.show()   指的是父类的show方法
		//重写show方法时(常用)      show()   this.show()    指的是子类的show方法          super.show()    指的是父类的show方法
		
		
		//没有在子类中定义个和父类同名的属性，name this.name  super.name   指的是父类的name属性
		//在子类中定义个和父类同名的属性(属性的隐藏 不常用)，   name this.name   指的是子类的name属性        super.name   指的是父类的name属性
		
	}

	//重写
	@Override
	public void show(){
		System.out.println("我是学生 name=" + this.name);
	}
	
	
}
