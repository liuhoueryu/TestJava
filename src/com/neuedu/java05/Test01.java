package com.neuedu.java05;

//���ݷ�װ---getter/setter
public class Test01 {

	public static void main(String[] args) {

		Person p = new Person();
		
		//Class.forName("com.neuedu.java05.Person").newInstance();
		
		//System.out.println(p);  //com.neuedu.java05.Person@1db9742
		
		p.show();
		
		p.setName("����");
		p.setGender("��");
		p.setAge(20);
		
		System.out.println("name=" + p.getName() + " gender=" + p.getGender() + " age=" + p.getAge());

		System.out.println(p);
		
		Person p2 = new Person();
		
		p2.setName("����");
		p2.setGender("Ů");
		p2.setAge(30);
		
		System.out.println("name=" + p2.getName() + " gender=" + p2.getGender() + " age=" + p2.getAge());

		
	}

}
