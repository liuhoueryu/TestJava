package com.neuedu.java02;

import java.util.Random;
import java.util.Scanner;

//������ 
public class Test2 {

	public static void main(String[] args) {
		
		/* ʹ��Rando����������
		Random random = new Random();
		
		//1-10
		System.out.println(random.nextInt(10) + 1);
		
		//29-67
		System.out.println(random.nextInt(67 - 29 + 1) + 29);

		int m = 29;
		int n = 67;
		
		System.out.println(random.nextInt(n - m + 1) + m);
		*/
		
		//�Ƿ��˳��ı�־����
		boolean exitFlag = false;
		while(!exitFlag){   //û�˳���Ϸ
			
			//������
			Random random = new Random();
			int answer = random.nextInt(10) + 1;
			
			//�Ƿ���еı�־����
			boolean guessFlag = false;
			
			Scanner sc = new Scanner(System.in);
			
			//ʣ�����
			int restCount = 3;
			
			while(!guessFlag && restCount>0){   //û���ж��һ���ʣ��Ļ���
				
				System.out.print("������" + restCount + "�λ��ᣬ����Ҫ�µ�����=");
				int guess = sc.nextInt();
				
				if(guess> answer){
					System.out.println("�´���");
					restCount--;
				}else if(guess < answer){
					System.out.println("��С��");
					restCount--;
				}else{
					guessFlag = true;
				}
			}
			
			if(!guessFlag){
				System.out.println("���ź������ζ�û���У����εĴ���" + answer);
			}else{
				System.out.println("��ϲ��������");
			}
			
			//ѯ���û��Ƿ������һ��
			System.out.print("�Ƿ������һ��(1:����  0:�˳�)");
			int response = sc.nextInt();
			if(response==0){
				System.out.print("886");
				exitFlag = true;
				//break;
			}
			
		}
		
	}

}
