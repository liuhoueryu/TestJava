package com.neuedu.java03;

import java.util.Scanner;

//作业---Fibonacci数列
public class Test7 {

	public static void main(String[] args) {
		//输入整数n，输出Fibonacci数列的前n项数据  定义函数int fibonacci(int n) 返回第n项数据  使用递归和非递归两种算法实现
		//Fibonacci数列第1项和第2项都是1，后面的项都是前面两项之和    如  1   1   2   3   5   8   13   21   34

		//System.out.println(fibonacci2(9));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("输入项数n=");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.print(fibonacci(i) + "\t");
		}
		
	}

	//非递归版
	static int fibonacci(int n){
		
		if(n==1 || n==2){
			return 1;
		}else{
			
			int f1 = 1;
			int f2 = 1;
			
			for(int i=3; i<=n; i++){
				
				int temp = f2;
				
				f2 = f1 + f2;
				
				f1 = temp;
				
			}
			
			return f2;
		}
	}
	
	//递归版
	static int fibonacci2(int n){
		
		if(n==1 || n==2){
			return 1;
		}else{
			return fibonacci2(n-1) + fibonacci2(n-2);
		}
	}
}
