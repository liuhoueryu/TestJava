package com.neuedu.java02;

//whileѭ��
public class Test1 {

	public static void main(String[] args) {

		/* ��ӡ5��Hello World
		
		int i = 1;   //��ʼ��ѭ������ 
		
		while(i<=5){   //����ѭ��������
			System.out.println("��"+i+"��Hello World");
			i++;    //�ı�ѭ������
		}
		*/
		
		/* ����1��100���ۼӺ� 1+2+...+100
		
		int i = 1;  
		int sum = 0;   //�ۼӺ�
		
		while(i<=100){  
			sum+=i;
			i++;   
		}
		
		System.out.println("sum=" + sum);
		*/
		
		// ��ӡ1��100������7�ı�������ͳ�������
		
		int i = 1;  
		int count = 0;
		while(i<=100){  
		
			if(i%7==0){
				System.out.println(i);
				count++;  //����+1
			}
			
			i++;  //ɨ����һ������
		}
		
		System.out.println("count=" + count);
	}
	
}
