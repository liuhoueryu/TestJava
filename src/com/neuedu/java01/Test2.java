package com.neuedu.java01;

//运算符
public class Test2 {

	public static void main(String[] args) {

		/*  字符串的拼接
		System.out.println("a"+1);	  //a1
		System.out.println("a"+1+2);   //a12
		System.out.println(1+2+"a");  //3a	
		*/		
		
		/*  除法运算
		int i = 10/3;   			//3
		double d = 10/3.0;  	    //3.33333
		float f=(float) (10/3.0);   //3.33333
		
		System.out.println(-10 % 4); 
		*/
		
		/*  自增和自减操作 操作 
		short s = 1;
		int i = s++;    //1
		int i = ++s;    //2
		*/
		
		/* 赋值操作 
		int a = 2;
		a += a -= a*a;
		System.out.println(a);  //0
		*/
		
		/*
		int a = 3, b = 5;
		System.out.println(++a>5 & b--<6);  
		System.out.println(b);
		*/
		
	    /*	短路与和短路或
	    int a = 1, b = 1, c = 1;
		System.out.println(a-- == 1 &&  b-- == 1 || c-- != 1); //true
		System.out.println("a=" + a + " b=" + b + " c=" + c);  //a=0 b=0 c=1
	    */
		
	    /*	二进制操作 + 三元运算符
		int a = 11, b = 30;
		System.out.println((a++ & ++b) > 10 ? a++ : ++b);  
		System.out.println("a=" + a + " b=" + b); 
     	*/	
		
		/*  运算符的优先级
		int a = 1, b = 2, c = 3;
		System.out.println(b+=c--/++a);	
		*/
		
	}

}
