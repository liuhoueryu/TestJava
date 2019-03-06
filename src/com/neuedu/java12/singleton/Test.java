package com.neuedu.java12.singleton;

//懒汉式单例的线程安全问题
public class Test {

	public static void main(String[] args) {

		new SingletonThread().start();
		new SingletonThread().start();
		
	}

}
