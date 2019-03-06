package com.neuedu.java02;

import java.util.Scanner;

//作业
public class Test7 {

	public static void main(String[] args) {
		
		/*
		//习题1---找出100到999之间的所有水仙花数，水仙花数是指一个三位数，其各位数字立方和等于该数本身。如：153，407都是水仙花数

		for(int i=100; i<=999; i++){
			
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100;
			
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai==i){
				System.out.println(i);
			}
		}
		*/
		
		///习题2---正整数的分解因数  60=2*2*3*5
		Scanner sc = new Scanner(System.in);
		
		System.out.print("输入一个数n=");
		int n = sc.nextInt();
		
		System.out.print(n + "=");
		
		//判断从2到n的每一个数是否是因数
		int i = 2;   
		while(i<=n){
			
			if(n % i==0){   //是因数
				
				n /= i;   
				
				if(n!=1){
					System.out.print(i + "*");
				}else{
					System.out.print(i);   //最后一项，不用再打印乘号	
				}
				
			}else{
				i++;   //不能被n整除，扫描下一个数
			}
			
		}
		//*/
		
		/*
		//习题3---打印一个九九乘法表
		for(int i=1; i<=9; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			
			System.out.println();
		}
		*/
		

		//习题4---输入行数row，打印正立的等腰三角形
		
/*
    *    
   ***
  *****
 *******    *  5个空格  *
*********
i   空格数  星号数
1   4     1
2   3     3
3   2     5
4   1     7
5   0     9
**/
/*		Scanner sc = new Scanner(System.in);
		
		System.out.print("输入行数row=");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++){   //正立
		//for(int i=row; i>=1; i--){  //倒立
					
			//打印空格
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}
			
			//打印*
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
	    /*	
		//习题5---输入行数row，打印正立的空心的等腰三角形
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("输入行数row=");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++){   //正立
			
			//打印空格
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}
			
			if(i==1){   //第一行
				System.out.print("*");
			}else if(i==row){  //最后一行
				for(int j=1; j<=2*i-1; j++){
					System.out.print("*");
				}
			}else{  //中间行
				
				System.out.print("*");
				
				//打印空格
				for(int j=1; j<=2*i-1-2; j++){
					System.out.print(" ");
				}
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		/*
		//习题6---百钱买百鸡  公鸡5元一只 母鸡3元一只 小鸡一元3只  打印出所有的购买方案

		for(int i=0; i<100/5; i++){   //公鸡
			for(int j=0; j<100/3; j++){   // 母鸡
				for(int k=0; k<100; k++){   // 小鸡
					
					if(i+j+k==100 && i*5+j*3+k/3==100 && k%3==0){
						System.out.println("公鸡=" + i + " 母鸡=" + j + " 小鸡=" + k);
					}
				}
			}
		}
		*/
	}

}
