package com.neuedu.java09;

//�����Ĵ�����쳣
public class Test1 {

	public static void main(String[] args) {

		//OutOfMemoryError
		//int[] arr = new int[1024*1024*100];
		
		//StackOverflowError
		//f();
		
		//ArithmeticException---�����쳣
		//int i = 10/0;
		
		//ClassCastException---����ת���쳣
		//Object obj = new Object();
		//String s = (String) obj;
		
		//ArrayIndexOutOfBoundsException---�±�Խ���쳣
		//int[] arr = new int[10];
		//arr[10] = 1;
		
		//StringIndexOutOfBoundsException---�±�Խ���쳣
		//String s = "abc";
		//s.charAt(6);
		
		//NullPointerException---��ָ���쳣
		//String s = null;
		//s.length();
		
		//InterruptedException---�ж��쳣
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
