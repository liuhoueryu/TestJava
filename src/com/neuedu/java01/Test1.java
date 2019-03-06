package com.neuedu.java01;

//常量  变量  类型转换
public class Test1 {

	public static void main(String[] args) {

	 /*	
	  	//不同进制表示的数值大小不同
	    System.out.println(10);
		System.out.println(0b10);
		System.out.println(010);
		System.out.println(0x10);
		
		byte b;   //局部变量使用前必须赋初值
		byte b=1, b1=2;  //定义+初始化
		
	 */
 	 /*
	    int a = 10;
	    int b, c;

	    if (a > 15) {
	      b = 9;
	    }

	    c = b + a;
	    System.out.println(c);
	    */
		
		/*short s = 10;
		int i = s ;  //自动转型
		
		int j=10;
		short s2 = (short) j;   //强制转型
*/		
		
		//short s = 10;
		//short i = s + 1 ;  //自动转型
		
		//int i = 127; 
		//byte b = i;    //超出范围
		
//		byte b1 = 1;
//		byte b2 = 2;
//		byte b3 = (byte) (b1 + b2); 
		
//		System.out.println('a'+1);	  //98
//		System.out.println((char)('a'+1));  //b
//		
		
		int i = 10;
		long L = 20;
		i = (int) (i + L);
		
	
	}

}
