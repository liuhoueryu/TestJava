package com.neuedu.java12.deadlock;

//�̵߳�����
public class Test {

	public static void main(String[] args) {

		new DeadLockThread("����").start();
		new DeadLockThread("����").start();
		
	}

}
