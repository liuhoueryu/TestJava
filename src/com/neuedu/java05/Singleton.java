package com.neuedu.java05;

public class Singleton {

	/*  饿汉式
	//内部提供一个唯一的实例
	private static Singleton instance = new Singleton();
	
	//构造方法私有化
	private Singleton(){
	}
	
	//提供公有的方法，外界能够通过类名直接访问
	public static Singleton getInstance(){
		return instance;
	}
	*/
	
	//懒汉式
	//内部提供一个唯一的实例
	private static Singleton instance = null;
	
	//构造方法私有化
	private Singleton(){
	}
	
	//提供公有的方法，外界能够通过类名直接访问
	public static Singleton getInstance(){
		
		if(instance==null){
			instance = new Singleton();
		}
		
		return instance;
	}
	
}
