package com.neuedu.java05;

//���ָı�����ָ��͸ı���������
public class Test03 {

	public static void main(String[] args) {
			 
		Person p = new Person("����", "��", 20);
		
		change(p);

		System.out.println(p);
	}
	
	static void change(Person p){
		
		//�ı���������
		//p.setName("����");
		//p.setGender("Ů");
		//p.setAge(30);
		
		//�ı�����ָ��
		p = new Person("����", "Ů", 30);
	}

}
