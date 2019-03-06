package com.neuedu.java05;

import java.util.Calendar;

//µ¥Àý
public class Test09 {

	public static void main(String[] args) {

		//Singleton s1 = new Singleton();
		//Singleton s2 = new Singleton();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		
		Runtime r1 = Runtime.getRuntime();
		Runtime r2 = Runtime.getRuntime();
		System.out.println(r1==r2);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		System.out.println(c1==c2);
		
	}

}
