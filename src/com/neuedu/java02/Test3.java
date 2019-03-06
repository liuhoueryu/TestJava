package com.neuedu.java02;

//do while循环
public class Test3 {

	public static void main(String[] args) {

		/* 打印5次Hello World
		
		int i = 10;   //初始化循环变量 
		
		do{
			System.out.println("第"+i+"次Hello World");
			i++;    
		}while(i<=5);
		*/
		
		//* 计算1到100的累加和 1+2+...+100
		
		int i = 1;  
		int sum = 0;   //累加和
		
		do{  
			sum+=i;
			i++;   
		}while(i<=100);
		
		System.out.println("sum=" + sum);
		
		
	}
	
}
