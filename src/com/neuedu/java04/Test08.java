package com.neuedu.java04;

import java.util.Random;
import java.util.Scanner;

//��ά����
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
		System.out.println(arr[0].length);  //�׳�NullPointerException�쳣
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
		
		//��������
		int[][] arr = new int[10][10];
		
		Random random = new Random();
		
		//��ʼ������  0 �� 1 �� 2 ��
		for (int i = 0; i < arr.length; i++) {
			 
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = random.nextInt(3);
			}
			
		}
		
		//��ӡ����
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
		
		//����x��y
		Scanner sc = new Scanner(System.in);
		System.out.print("x=");
		int x = sc.nextInt();
		System.out.print("y=");
		int y = sc.nextInt();
		
		//�ж��Ƿ�����һ��
		if(arr[x][y]==0){
			
			arr[x][y] = 1;   //�����
			
			if(
					arr[x][y]==arr[x][y+1] && arr[x][y]==arr[x][y+2]  ||	//ˮƽ����
					arr[x][y]==arr[x][y-1] && arr[x][y]==arr[x][y+1]  ||	
					arr[x][y]==arr[x][y-1] && arr[x][y]==arr[x][y-2]  ||
					
					arr[x][y]==arr[x+1][y] && arr[x][y]==arr[x+2][y]  ||   //��ֱ����
					arr[x][y]==arr[x-1][y] && arr[x][y]==arr[x+1][y]  ||
					arr[x][y]==arr[x-1][y] && arr[x][y]==arr[x-2][y]  ||
				
				    arr[x][y]==arr[x+1][y+1] && arr[x][y]==arr[x+2][y+2] ||   //���ϵ�����
				    arr[x][y]==arr[x+1][y+1] && arr[x][y]==arr[x-1][y-1] ||
				    arr[x][y]==arr[x-1][y-1] && arr[x][y]==arr[x-2][y-2] ||
				   
				    arr[x][y]==arr[x+1][y-1] && arr[x][y]==arr[x+2][y-2] ||   //���ϵ�����
				    arr[x][y]==arr[x+1][y-1] && arr[x][y]==arr[x-1][y+1] ||
				    arr[x][y]==arr[x-1][y+1] && arr[x][y]==arr[x-2][y+2] 
					
			   ){
				System.out.println("ʤ��");
			}
		}else{
			System.out.println("��������");
		}
		
		
	}

}
