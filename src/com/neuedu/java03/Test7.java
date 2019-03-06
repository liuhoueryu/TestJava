package com.neuedu.java03;

import java.util.Scanner;

//��ҵ---Fibonacci����
public class Test7 {

	public static void main(String[] args) {
		//��������n�����Fibonacci���е�ǰn������  ���庯��int fibonacci(int n) ���ص�n������  ʹ�õݹ�ͷǵݹ������㷨ʵ��
		//Fibonacci���е�1��͵�2���1����������ǰ������֮��    ��  1   1   2   3   5   8   13   21   34

		//System.out.println(fibonacci2(9));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������n=");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++){
			System.out.print(fibonacci(i) + "\t");
		}
		
	}

	//�ǵݹ��
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
	
	//�ݹ��
	static int fibonacci2(int n){
		
		if(n==1 || n==2){
			return 1;
		}else{
			return fibonacci2(n-1) + fibonacci2(n-2);
		}
	}
}
