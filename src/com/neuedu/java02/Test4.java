package com.neuedu.java02;

//forѭ��
public class Test4 {

	public static void main(String[] args) {

		/* ��ӡ5��Hello World
		
		for(int i=1;i<=5;i++){
			System.out.println("��"+i+"��Hello World");
		}
		
		*/
		
		//* ����1��100���ۼӺ� 1+2+...+100
		
		int sum = 0;   //�ۼӺ�
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		
		System.out.println("sum=" + sum);
		
		
	}
	
}
