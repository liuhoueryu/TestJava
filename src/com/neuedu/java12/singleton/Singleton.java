package com.neuedu.java12.singleton;

public class Singleton {

	//懒汉式
	//内部提供一个唯一的实例
	private static Singleton instance = null;
	
	//构造方法私有化
	private Singleton(){
	}
	
	//提供公有的方法，外界能够通过类名直接访问
	public static Singleton getInstance(){
		
		if(instance==null){  //提高效率  双重检查
			
			synchronized(Singleton.class){
				
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
}
