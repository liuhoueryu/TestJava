package com.neuedu.java07.demo2;

public class Test {

	public static void main(String[] args) {

		/*Dog dog = new Dog("̩��","��ɫ");
		dog.eat();
		dog.shout();
		
		Cat cat = new Cat("��Ƥ","��ɫ");
		cat.eat();
		cat.shout();*/
		
	/*	Animal animal = new Dog("̩��","��ɫ");
		animal.eat();
		animal.shout();

		//����ת��    ����-->����  �Զ�   ����-->����  ǿ��
		Dog dog = (Dog) animal;
		dog.guard();*/
		
		/*//Animal a = new Cat("��Ƥ","��ɫ");
		Animal a = new Dog("̩��","��ɫ");
		if(a instanceof Dog){
			Dog dog2 = (Dog) a;   //����ͨ��������ʱ���׳�ClassCastException�쳣
			dog2.guard();
		}else{
			System.out.println("�޷�ת��");
		}*/
		
		/*Animal a = new Cat("��Ƥ","��ɫ");
		if(a instanceof Cat){
			Cat cat = (Cat)a;
			cat.climb();
		}*/
		
		/*Dog dog = new Dog("̩��","��ɫ");

		System.out.println(dog instanceof Dog); 	 //true	 
		System.out.println(dog instanceof Animal);		//true 
		System.out.println(dog instanceof Cat);	 //����
		*/
		
		Animal animal = new Dog("̩��","��ɫ");   
		
		System.out.println(animal instanceof Dog); 		//true	  
		System.out.println(animal instanceof Animal);   //true	    	 
		System.out.println(animal instanceof Cat);	//false 
		
	}

}
