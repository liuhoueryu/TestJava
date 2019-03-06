package com.neuedu.java03;

//函数的执行流程---查看异常栈
public class Test4 {

	public static void main(String[] args) {
		f1();
	}

	static void f1(){
		System.out.println("f1()...");
		
		f2();
		
		int i = 10/0;
	}
	
	static void f2(){
		System.out.println("f2()...");
		
	}
}
