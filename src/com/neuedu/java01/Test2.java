package com.neuedu.java01;

//�����
public class Test2 {

	public static void main(String[] args) {

		/*  �ַ�����ƴ��
		System.out.println("a"+1);	  //a1
		System.out.println("a"+1+2);   //a12
		System.out.println(1+2+"a");  //3a	
		*/		
		
		/*  ��������
		int i = 10/3;   			//3
		double d = 10/3.0;  	    //3.33333
		float f=(float) (10/3.0);   //3.33333
		
		System.out.println(-10 % 4); 
		*/
		
		/*  �������Լ����� ���� 
		short s = 1;
		int i = s++;    //1
		int i = ++s;    //2
		*/
		
		/* ��ֵ���� 
		int a = 2;
		a += a -= a*a;
		System.out.println(a);  //0
		*/
		
		/*
		int a = 3, b = 5;
		System.out.println(++a>5 & b--<6);  
		System.out.println(b);
		*/
		
	    /*	��·��Ͷ�·��
	    int a = 1, b = 1, c = 1;
		System.out.println(a-- == 1 &&  b-- == 1 || c-- != 1); //true
		System.out.println("a=" + a + " b=" + b + " c=" + c);  //a=0 b=0 c=1
	    */
		
	    /*	�����Ʋ��� + ��Ԫ�����
		int a = 11, b = 30;
		System.out.println((a++ & ++b) > 10 ? a++ : ++b);  
		System.out.println("a=" + a + " b=" + b); 
     	*/	
		
		/*  ����������ȼ�
		int a = 1, b = 2, c = 3;
		System.out.println(b+=c--/++a);	
		*/
		
	}

}
