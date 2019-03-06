package com.neuedu.java07.demo2;

public class Test {

	public static void main(String[] args) {

		/*Dog dog = new Dog("泰迪","棕色");
		dog.eat();
		dog.shout();
		
		Cat cat = new Cat("虎皮","灰色");
		cat.eat();
		cat.shout();*/
		
	/*	Animal animal = new Dog("泰迪","棕色");
		animal.eat();
		animal.shout();

		//类型转换    子类-->父类  自动   父类-->子类  强制
		Dog dog = (Dog) animal;
		dog.guard();*/
		
		/*//Animal a = new Cat("虎皮","灰色");
		Animal a = new Dog("泰迪","棕色");
		if(a instanceof Dog){
			Dog dog2 = (Dog) a;   //编译通过，运行时会抛出ClassCastException异常
			dog2.guard();
		}else{
			System.out.println("无法转型");
		}*/
		
		/*Animal a = new Cat("虎皮","灰色");
		if(a instanceof Cat){
			Cat cat = (Cat)a;
			cat.climb();
		}*/
		
		/*Dog dog = new Dog("泰迪","棕色");

		System.out.println(dog instanceof Dog); 	 //true	 
		System.out.println(dog instanceof Animal);		//true 
		System.out.println(dog instanceof Cat);	 //报错
		*/
		
		Animal animal = new Dog("泰迪","棕色");   
		
		System.out.println(animal instanceof Dog); 		//true	  
		System.out.println(animal instanceof Animal);   //true	    	 
		System.out.println(animal instanceof Cat);	//false 
		
	}

}
