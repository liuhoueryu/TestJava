package com.neuedu.java02;

//do whileѭ��
public class Test3 {

	public static void main(String[] args) {

		/* ��ӡ5��Hello World
		
		int i = 10;   //��ʼ��ѭ������ 
		
		do{
			System.out.println("��"+i+"��Hello World");
			i++;    
		}while(i<=5);
		*/
		
		//* ����1��100���ۼӺ� 1+2+...+100
		
		int i = 1;  
		int sum = 0;   //�ۼӺ�
		
		do{  
			sum+=i;
			i++;   
		}while(i<=100);
		
		System.out.println("sum=" + sum);
		
		
	}
	
}
