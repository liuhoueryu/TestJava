package com.neuedu.java12.base;

//�����̵߳ķ�ʽ1---�̳�Thread��
public class MyThread extends Thread {

	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		
		for (int i = 1; i <=20; i++) {
			System.out.println("\t" + Thread.currentThread().getName() + " i=" + i);
			
		/*	try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		
		System.out.println("���߳̽���************");
	}
}
