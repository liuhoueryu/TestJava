package com.neuedu.java04;

//使用数组实现交换两个整数的值
public class Test04 {

	public static void main(String[] args) {

		//Integer a=3, b=5;
		
		int a=3, b=5;
		
		int[] arr = {a, b};
		
		System.out.println("a=" + a + " b=" + b);
		
		swap3(arr);
		
		a = arr[0];
		b = arr[1];
		System.out.println("a=" + a + " b=" + b);
	}

	static void swap1(int a, int b){
		int temp=a;
		a=b;
		b=temp;
	}
	
	static void swap2(Integer a, Integer b){
		Integer temp=a;
		a=b;
		b=temp;
	}
	
	static void swap3(int[] arr){
		int temp=arr[0];
		arr[0]=arr[1];
		arr[1]=temp;
	}
}
