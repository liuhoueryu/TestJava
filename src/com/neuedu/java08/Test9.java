package com.neuedu.java08;

import java.text.NumberFormat;

//数字格式化
public class Test9 {

	public static void main(String[] args) {

		int i = 123456789;
		
		NumberFormat nf1 = NumberFormat.getInstance();
		System.out.println(nf1);  //DecimalFormat子类
		System.out.println(nf1.format(i));  //123,456,789
		
		NumberFormat nf2 = NumberFormat.getCurrencyInstance();
		System.out.println(nf2); //DecimalFormat子类
		System.out.println(nf2.format(i));  //￥123,456,789.00
		
		NumberFormat nf3 = NumberFormat.getPercentInstance();
		System.out.println(nf3); //DecimalFormat子类
		System.out.println(nf3.format(i));  //12,345,678,900%
		
	}

}
