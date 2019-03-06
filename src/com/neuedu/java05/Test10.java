package com.neuedu.java05;

//¶àÀý
public class Test10 {

	public static void main(String[] args) {

		EnumPerson ep1 = EnumPerson.getInstance(EnumPerson.MALE);
		System.out.println(ep1);
		EnumPerson ep2 = EnumPerson.getInstance(EnumPerson.MALE);
		System.out.println(ep2);
		
		System.out.println(ep1==ep2);
		
		EnumPerson ep3 = EnumPerson.getInstance(EnumPerson.FEMALE);
		System.out.println(ep3);
		EnumPerson ep4 = EnumPerson.getInstance(EnumPerson.FEMALE);
		System.out.println(ep4);
		
		System.out.println(ep4==ep3);
	}

}
