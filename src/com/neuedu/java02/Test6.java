package com.neuedu.java02;

import java.util.Scanner;

//ʹ��break�ؼ����˳�ѭ��_�ж�����
public class Test6 {

	public static void main(String[] args) {

		/*
		//�ж�һ�����Ƿ�������
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����һ����=");
		int n = sc.nextInt();
		
		boolean flag = true;  //������
		
//		for(int i=2;i<=n/2;i++){
//			
//			if(n%i==0){
//				flag = false;  //��������
//				break;
//			}
//		}
		
		int i=2;
		while(i<=n/2){
			
			if(n%i==0){
				flag = false;  //��������
				break;
			}
			
			i++;
		}
		
		if(flag){
			System.out.println(n + "������");
		}else{
			System.out.println(n + "��������");
		}
		*/
		
		//�ҳ�1-n֮�����������
		Scanner sc = new Scanner(System.in);
				
		System.out.print("����һ����=");
		int n = sc.nextInt();
		
		for(int i=2; i<=n; i++){
			
			//�ж�i�Ƿ�������
			boolean flag = true;  //������
			
			for(int j=2;j<=i/2;j++){
				
				if(i%j==0){
					flag = false;  //��������
					break;
				}
			}
			
			if(flag){
				System.out.println(i + " ");
			}
		}
		
	}
	
}
