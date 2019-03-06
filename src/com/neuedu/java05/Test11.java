package com.neuedu.java05;

//不变类
public class Test11 {

	public static void main(String[] args) {

		ImmutablePerson ip = new ImmutablePerson("张三","男", 20);
				
		ImmutablePerson ipNew = ip.addAge(10);
		
		System.out.println(ip);
		System.out.println(ipNew);
	
		String s = "abc123def123gh";
		String s2 = s.replace("123", "456");
		System.out.println(s2);
	}

}
