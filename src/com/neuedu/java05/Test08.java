package com.neuedu.java05;

//static�ؼ���
public class Test08 {

	public static void main(String[] args) {

		//����main��������ڲ���
		System.out.println("args=" + args.length);

		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		
		
		//��̬������ʹ��---����.������    ����.������()
		System.out.println(Person.count);

		System.out.println(Person.getCount());

		
		Person p1 = new Person("p1", "��", 20);
		
		//��̬������ʹ��2---������.������   ������.������()
		System.out.println(p1.count);
		System.out.println(p1.getCount());

		//Person p2 = new Person("p2", "Ů", 30);
		//System.out.println(Person.count);
		
	}

}
