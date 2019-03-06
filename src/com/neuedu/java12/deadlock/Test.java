package com.neuedu.java12.deadlock;

//线程的死锁
public class Test {

	public static void main(String[] args) {

		new DeadLockThread("张三").start();
		new DeadLockThread("李四").start();
		
	}

}
