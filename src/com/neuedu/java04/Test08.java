package com.neuedu.java04;

import java.util.Random;
import java.util.Scanner;

//二维数组
public class Test08 {

	public static void main(String[] args) {

		/*int[][] arr = new int[3][5];
		
		System.out.println(arr[0]);   //[I@1db9742
		System.out.println(arr.length);  // 3
		System.out.println(arr[0].length);   //5
		*/
		
		/*
		int[][] arr = new int[3][];
		System.out.println(arr[0]); //null
		System.out.println(arr.length);  //3
		System.out.println(arr[0].length);  //抛出NullPointerException异常
        */	 
		
	    /*
	   	 int[][] arr = {{1,2,3}, {4,5}, {6,7,8,9}};
		 
		 for (int i = 0; i < arr.length; i++) {
			 
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
        */
		
		//创建棋盘
		int[][] arr = new int[10][10];
		
		Random random = new Random();
		
		//初始化棋盘  0 空 1 黑 2 白
		for (int i = 0; i < arr.length; i++) {
			 
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(3);
			}
			
		}
		
		//打印棋盘
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i + " ");
		}	
			
		System.out.println();
		
		System.out.println("-------------------");
		
		for (int i = 0; i < arr.length; i++) {
			 
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println("|" + i);
		}
		
		//输入x，y
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		int x = sc.nextInt();
		System.out.print("y=");
		int y = sc.nextInt();
		
		//判断是否连成一线
		if(arr[x][y]==0){
			
			arr[x][y] = 1;   //落黑子
			
			if(
					arr[x][y]==arr[x][y+1] && arr[x][y]==arr[x][y+2]  ||	//水平方向
					arr[x][y]==arr[x][y-1] && arr[x][y]==arr[x][y+1]  ||	
					arr[x][y]==arr[x][y-1] && arr[x][y]==arr[x][y-2]  ||
					
					arr[x][y]==arr[x+1][y] && arr[x][y]==arr[x+2][y]  ||   //垂直方向
					arr[x][y]==arr[x-1][y] && arr[x][y]==arr[x+1][y]  ||
					arr[x][y]==arr[x-1][y] && arr[x][y]==arr[x-2][y]  ||
				
				    arr[x][y]==arr[x+1][y+1] && arr[x][y]==arr[x+2][y+2] ||   //左上到右下
				    arr[x][y]==arr[x+1][y+1] && arr[x][y]==arr[x-1][y-1] ||
				    arr[x][y]==arr[x-1][y-1] && arr[x][y]==arr[x-2][y-2] ||
				   
				    arr[x][y]==arr[x+1][y-1] && arr[x][y]==arr[x+2][y-2] ||   //右上到左下
				    arr[x][y]==arr[x+1][y-1] && arr[x][y]==arr[x-1][y+1] ||
				    arr[x][y]==arr[x-1][y+1] && arr[x][y]==arr[x-2][y+2] 
					
			   ){
				System.out.println("胜利");
			}
		}else{
			System.out.println("不能落子");
		}
		
		
	}

}
