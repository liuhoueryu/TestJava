package com.neuedu.java09;

//异常的处理方式2---使用throws声明抛出---运行时异常
public class Test3 {

	public static void main(String[] args) {

		div(10, 0, new int[10]);
		
		System.out.println("程序结束");
	}

	static void div(int a, int b, int[] arr) throws ArithmeticException, NullPointerException{
		
		if(b!=0){
			int result = a / b;
		
			System.out.println("result=" + result);
		}else{
			
			//抛出一个ArithmeticException异常
			
			throw new ArithmeticException();
			
		}
		
		if(arr!=null){
			System.out.println("length=" + arr.length);
		}else{
			throw new NullPointerException();
		}
		
		System.out.println(arr[10]);
		
		System.out.println("div方法结束");
	}
}
