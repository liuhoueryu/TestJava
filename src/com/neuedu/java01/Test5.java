package com.neuedu.java01;

import java.util.Scanner;

//��ҵ
public class Test5 {

	public static void main(String[] args) {

		//ϰ��1---������������a��b��ֵ��������ʹ����ʱ����
		
		/*
		int a=3, b=5; 
		System.out.println("a=" + a + " b=" + b);	
		
		// ��ʽ1---ʹ����ʱ����
		int temp=a;
		a=b;
		b=temp;
		
		/* ��ʽ2---�Ӽ�����
		a = a + b;   //a=8
		b = a - b;   //b=3
		a = a - b;   //a=5
		*/
		
		/* ��ʽ3---������
		a = a^b;  //a=3^5
		b = a^b;   //b =3^5^5=3
		a = a^b;   //b =3^5^3=5
		System.out.println("a=" + a + " b=" + b);
		*/	
		
		/*ϰ��2
		int a=-67, b=116, c=78;

		int d = ~a | b & c;

		System.out.println("d=" + d);		  //70

		*/	
		
		/*
		//ϰ��3---��һ��������������ȡ�� int a = 0b00101101;  ��1��������
		int a = 0b00101101;
		int b = 0b11111111;
		System.out.println(Integer.toBinaryString(a^b));	
		*/
		
		/*	
	    //ϰ��4---��ȡһ�����������м��3-6λ int a = 0b11101101; 
		int a = 0b11101101; 
		int b = 0b00111100; 
		int c = a&b;
		c = c>>2;
		System.out.println(Integer.toBinaryString(c));  */ 
		
	    /*	
	    //ϰ��6---�����������year���жϸ����Ƿ�������  ����ܱ�400���������ܱ�4�����Ҳ��ܱ�100����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���������=");
		int year = sc.nextInt();
		
		if(year%400==0  || year%4==0 && year%100!=0){
			System.out.println(year + "������");
		}else{
			System.out.println(year + "��������");
		}
		
		sc.close();
		*/
		
	    /*	
	    //ϰ��7---��������ɼ�score�����ݷ��������Ӧ�ĵȼ�   90-100  A�ȼ�    80-89  B�ȼ�    70-79  C�ȼ�   60-69  D�ȼ�    <60 E�ȼ�
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ɼ�=");
		int score = sc.nextInt();
		
		//System.out.println(score>=90 ? "A" : score>=80 ? "B" : score>=70 ? "C" : score>=60 ? "D" : "E");
		
		char result = ' ';
		if(score>90){
			result = 'A';
		}else if(score>80){
			result = 'B';
		}else if(score>70){
			result = 'C';
		}else if(score>60){
			result = 'D';
		}else{
			result = 'E';
		}
		
		System.out.println(result);
		
		sc.close();
		*/
		
		/*
		//ϰ��8---Ͷ�ݼ����󣬹������޳���3��(��)����绰֪ͨ����˾���ԣ�����һ�ݱ����⣬���90������ֱ�Ӹ�offer��60-90�ֵĽ���ʵϰ�ڣ��������߲�¼ȡ����������ĵ绰֪ͨ��¼ȡ
		//�������ޱ�����ΪworkAge   ���Գɼ�������Ϊscore

		Scanner sc = new Scanner(System.in);
		System.out.println("Ͷ�ݼ���");
		
		System.out.print("���빤������=");
		int workAge = sc.nextInt();
		if(workAge>=3){
			System.out.println("�绰֪ͨ����˾����");
			
			System.out.print("������Գɼ�=");
			int score = sc.nextInt();
			if(score>90){
				System.out.print("ֱ�Ӹ�offer");
			}else if(score>=60){
				System.out.print("����ʵϰ��");
			}else{
				System.out.print("��¼ȡ");
			}
		}else{
			System.out.println("�绰֪ͨ��¼ȡ");
		}
		
		sc.close();
		*/
		
		/*
		//ϰ��9---������������������һ�������������ݲ���������Ӧ����������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������a=");
		int a = sc.nextInt();
		
		System.out.print("������b=");
		int b = sc.nextInt();
		
		System.out.print("������op=");
		String op = sc.next();

		switch(op){
		
			case "+":
				System.out.print(a + op + b + "=" + (a + b));
				break;
			case "-":
				System.out.print(a + op + b + "=" + (a - b));
				break;
			case "*":
				System.out.print(a + op + b + "=" + (a * b));
				break;
			case "/":
				if(b!=0){
					System.out.print(a + op + b + "=" + (a / b));
				}else{
					System.out.print("����b����Ϊ��");
				}
				break;
			default:
				System.out.print("�Ƿ��Ĳ�����");
		}
		
		sc.close();
		*/
		
		//ϰ��10---���������·�month�������·������������   345 ����   678 ����    9 10 11 ����    12 1 2 ����
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�·�=");
		int month = sc.nextInt();

		switch(month){
		
			case 3:
			case 4:
			case 5:
				System.out.print("����");
				break;
			
			case 6:
			case 7:
			case 8:
				System.out.print("����");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.print("����");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.print("����");
				break;
			default:
				System.out.print("�Ƿ��·�");
		}
		
		sc.close();
	}
}
