package com.neuedu.java12.base;

//�����̵߳ķ�ʽ2---ʵ��Runnable�ӿ�
public class MyRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <=20; i++) {
			System.out.println("\t���߳� i=" + i);
		}
		
		System.out.println("���߳̽���************");
	}

}
