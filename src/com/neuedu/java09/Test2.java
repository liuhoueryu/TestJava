package com.neuedu.java09;

//异常的处理方式1---try + catch---捕获并处理---运行时异常
public class Test2 {

	public static void main(String[] args) {
		
		try{
			div(10, 2, new int[10]);
		}catch(IndexOutOfBoundsException e){
			//e.printStackTrace();
			System.out.println("数组越界了");
		}

		System.out.println("程序结束");
	}

	static void div(int a, int b, int[] arr){
		
		try{
			int result = a / b;
			
			System.out.println("result=" + result);
			
			System.out.println("length=" + arr.length);
			
			System.out.println(arr[10]);
			
			System.out.println("xxxx");
		}catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println("除数为零了");
		}catch(NullPointerException e){
			//e.printStackTrace();
			System.out.println("空指针了");
		}/*catch(Exception e){
			e.printStackTrace();
			//System.out.println("异常信息=" + e.toString());
			System.out.println("神医来了，包治百病");
		}*/
		
		System.out.println("div方法结束");
	}
}
