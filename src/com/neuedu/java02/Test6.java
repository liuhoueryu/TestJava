package com.neuedu.java02;

import java.util.Scanner;

//使用break关键字退出循环_判断素数
public class Test6 {

	public static void main(String[] args) {

		/*
		//判断一个数是否是素数
		Scanner sc = new Scanner(System.in);
		
		System.out.print("输入一个数=");
		int n = sc.nextInt();
		
		boolean flag = true;  //是素数
		
//		for(int i=2;i<=n/2;i++){
//			
//			if(n%i==0){
//				flag = false;  //不是素数
//				break;
//			}
//		}
		
		int i=2;
		while(i<=n/2){
			
			if(n%i==0){
				flag = false;  //不是素数
				break;
			}
			
			i++;
		}
		
		if(flag){
			System.out.println(n + "是素数");
		}else{
			System.out.println(n + "不是素数");
		}
		*/
		
		//找出1-n之间的所有素数
		Scanner sc = new Scanner(System.in);
				
		System.out.print("输入一个数=");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++){
			
			//判断i是否是素数
			boolean flag = true;  //是素数
			
			for(int j=2;j<=i/2;j++){
				
				if(i%j==0){
					flag = false;  //不是素数
					break;
				}
			}
			
			if(flag){
				System.out.println(i + " ");
			}
		}
		
	}
	
}
