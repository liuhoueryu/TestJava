package com.neuedu.java02;

import java.util.Scanner;

//��ҵ
public class Test7 {

	public static void main(String[] args) {
		
		/*
		//ϰ��1---�ҳ�100��999֮�������ˮ�ɻ�����ˮ�ɻ�����ָһ����λ�������λ���������͵��ڸ��������磺153��407����ˮ�ɻ���

		for(int i=100; i<=999; i++){
			
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100;
			
			if(ge*ge*ge + shi*shi*shi + bai*bai*bai==i){
				System.out.println(i);
			}
		}
		*/
		
		///ϰ��2---�������ķֽ�����  60=2*2*3*5
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����һ����n=");
		int n = sc.nextInt();
		
		System.out.print(n + "=");
		
		//�жϴ�2��n��ÿһ�����Ƿ�������
		int i = 2;   
		while(i<=n){
			
			if(n % i==0){   //������
				
				n /= i;   
				
				if(n!=1){
					System.out.print(i + "*");
				}else{
					System.out.print(i);   //���һ������ٴ�ӡ�˺�	
				}
				
			}else{
				i++;   //���ܱ�n������ɨ����һ����
			}
			
		}
		//*/
		
		/*
		//ϰ��3---��ӡһ���žų˷���
		for(int i=1; i<=9; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			
			System.out.println();
		}
		*/
		

		//ϰ��4---��������row����ӡ�����ĵ���������
		
/*
    *    
   ***
  *****
 *******    *  5���ո�  *
*********
i   �ո���  �Ǻ���
1   4     1
2   3     3
3   2     5
4   1     7
5   0     9
**/
/*		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������row=");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++){   //����
		//for(int i=row; i>=1; i--){  //����
					
			//��ӡ�ո�
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}
			
			//��ӡ*
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
	    /*	
		//ϰ��5---��������row����ӡ�����Ŀ��ĵĵ���������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������row=");
		int row = sc.nextInt();
		
		for(int i=1; i<=row; i++){   //����
			
			//��ӡ�ո�
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}
			
			if(i==1){   //��һ��
				System.out.print("*");
			}else if(i==row){  //���һ��
				for(int j=1; j<=2*i-1; j++){
					System.out.print("*");
				}
			}else{  //�м���
				
				System.out.print("*");
				
				//��ӡ�ո�
				for(int j=1; j<=2*i-1-2; j++){
					System.out.print(" ");
				}
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		/*
		//ϰ��6---��Ǯ��ټ�  ����5Ԫһֻ ĸ��3Ԫһֻ С��һԪ3ֻ  ��ӡ�����еĹ��򷽰�

		for(int i=0; i<100/5; i++){   //����
			for(int j=0; j<100/3; j++){   // ĸ��
				for(int k=0; k<100; k++){   // С��
					
					if(i+j+k==100 && i*5+j*3+k/3==100 && k%3==0){
						System.out.println("����=" + i + " ĸ��=" + j + " С��=" + k);
					}
				}
			}
		}
		*/
	}

}
