package com.neuedu.java05;

//���ݳ�ʼ��---������
public class Test02 {

	public static void main(String[] args) {

		Person p1 = new Person("����", "��", 20);
		System.out.println(p1);
		
		System.out.println("----------------------");
		
		Person p2 = new Person("����", "Ů", 30);
		System.out.println(p2);
	
		System.out.println("----------------------");
		
		Person p3 = new Person("����", "Ů");
		System.out.println(p3);
		
		System.out.println("----------------------");
		
		Person p4 = new Person("����");
		System.out.println(p4);
		
	}

}
