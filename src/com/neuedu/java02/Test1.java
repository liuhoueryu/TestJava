package com.neuedu.java02;

//while循环
public class Test1 {

	public static void main(String[] args) {

		/* 打印5次Hello World
		
		int i = 1;   //初始化循环变量 
		
		while(i<=5){   //进入循环的条件
			System.out.println("第"+i+"次Hello World");
			i++;    //改变循环变量
		}
		*/
		
		/* 计算1到100的累加和 1+2+...+100
		
		int i = 1;  
		int sum = 0;   //累加和
		
		while(i<=100){  
			sum+=i;
			i++;   
		}
		
		System.out.println("sum=" + sum);
		*/
		
		// 打印1到100内所有7的倍数，并统计其个数
		
		int i = 1;  
		int count = 0;
		while(i<=100){  
		
			if(i%7==0){
				System.out.println(i);
				count++;  //个数+1
			}
			
			i++;  //扫描下一个数据
		}
		
		System.out.println("count=" + count);
	}
	
}
