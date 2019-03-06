package com.neuedu.java09;

//常见的错误和异常
public class Test1 {

	public static void main(String[] args) {

		//OutOfMemoryError
		//int[] arr = new int[1024*1024*100];
		
		//StackOverflowError
		//f();
		
		//ArithmeticException---算术异常
		//int i = 10/0;
		
		//ClassCastException---类型转换异常
		//Object obj = new Object();
		//String s = (String) obj;
		
		//ArrayIndexOutOfBoundsException---下标越界异常
		//int[] arr = new int[10];
		//arr[10] = 1;
		
		//StringIndexOutOfBoundsException---下标越界异常
		//String s = "abc";
		//s.charAt(6);
		
		//NullPointerException---空指针异常
		//String s = null;
		//s.length();
		
		//InterruptedException---中断异常
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	static void f(){
		f();
	}
}
