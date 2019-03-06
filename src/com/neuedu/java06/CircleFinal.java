package com.neuedu.java06;

//修饰类时，表示该类不能再被子类继承---最终类
public class CircleFinal {
	
	private final int r; //修饰类的实例变量时，可以在定义该变量时赋值，也可以在构造方法中赋值
	
	private final static int d = 10; //修饰类的静态变量时，只能在定义该变量时赋值
	
	public CircleFinal(int r) {
		super();
		this.r = r;
	}
	
	public final void show(final int a){  //修饰类的方法时，表示该方法不能再被子类重写
		//a=1;   //修饰方法形参时，表示该形参在此方法中不能被修改
		System.out.println("cirle");
	}

/*	public void setR(int r) {
		this.r = r;
	}
*/
	public static void main(String[] args) {
		
		final int r = 10;   
		//r=20;   //修饰基本类型变量时，不能修改
		
		final CircleFinal c = new CircleFinal(1);
		
		//c.setR(2);
		
		//c = new Circle(2);  //修饰引用类型变量时，表示该变量不能再指向新的对象，但是对象本身的内容可以改变
		
	}

}
