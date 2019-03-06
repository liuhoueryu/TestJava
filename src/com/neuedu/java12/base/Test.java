package com.neuedu.java12.base;

//�̵߳Ļ�������
public class Test {
	
	//�����̵߳ķ�ʽ1---�̳�Thread��
	static void test1(){

		MyThread t = new MyThread("���߳�");
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("���߳� i=" + i);
		}
	}
	
	//�����̵߳ķ�ʽ2---ʵ��Runnable�ӿ�
	static void test2(){
		
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("���߳� i=" + i);
		}
	}
	
	//�߳�����
	static void test3(){

	/*	MyThread t1 = new MyThread();
		t1.setName("�߳�A");
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("�߳�B");
		t2.start();*/
		
		
		MyThread t1 = new MyThread("�߳�A");
		t1.start();

		MyThread t2 = new MyThread("�߳�B");
		t2.start();
		
		/*for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
		}*/
	}
	
	//�̵߳����ȼ�
	static void test4(){
		
		MyThread t = new MyThread("���߳�");
		
		t.setPriority(10);
		System.out.println(t.getPriority());
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
		}
	}
	
	//�̵߳�����
	static void test5(){
		
		MyThread t = new MyThread("���߳�");
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	//�̵߳�����/�ȴ�
	static void test6(){
		
		MyThread t = new MyThread("���߳�");
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			
			if(i==10){
				try {
					t.join();   //�ڵ�ǰ�߳����������߳�
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//�̵߳ķ���/����
	static void test7(){
		
		MyThread t = new MyThread("���߳�");
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			
			if(i>=10){
				System.out.println("���̷߳���������");
				Thread.yield();
			}
		}
	}
	
	//�ػ��߳�
	static void test8(){
		
		DaemonThread t = new DaemonThread();
		
		//����Ϊ�ػ��߳�
		t.setDaemon(true);

		t.start();
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			try {
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
	
	public static void main(String[] args) {

		test8();

	}
}
