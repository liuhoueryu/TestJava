package com.neuedu.java02;

//for循环
public class Test4 {

	public static void main(String[] args) {

		/* 打印5次Hello World
		
		for(int i=1;i<=5;i++){
			System.out.println("第"+i+"次Hello World");
		}
		
		*/
		
		//* 计算1到100的累加和 1+2+...+100
		
		int sum = 0;   //累加和
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		
		System.out.println("sum=" + sum);
		
		
	}
	
}
