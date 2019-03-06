package com.neuedu.java03;

//函数的执行流程---交换2个数
public class Test3 {

	public static void main(String[] args) {

		int a=3, b=5;

		System.out.println("a=" + a + " b=" + b);
		
		swap(a, b);
		
		System.out.println("a=" + a + " b=" + b);
	}

	static void swap(int a, int b){
		
		int temp=a;
		a=b;
		b=temp;
		
	}
}
