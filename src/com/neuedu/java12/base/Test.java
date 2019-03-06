package com.neuedu.java12.base;

//线程的基本操作
public class Test {
	
	//创建线程的方式1---继承Thread类
	static void test1(){

		MyThread t = new MyThread("子线程");
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("主线程 i=" + i);
		}
	}
	
	//创建线程的方式2---实现Runnable接口
	static void test2(){
		
		MyRunnable r = new MyRunnable();
		
		Thread t = new Thread(r);
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println("主线程 i=" + i);
		}
	}
	
	//线程起名
	static void test3(){

	/*	MyThread t1 = new MyThread();
		t1.setName("线程A");
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("线程B");
		t2.start();*/
		
		
		MyThread t1 = new MyThread("线程A");
		t1.start();

		MyThread t2 = new MyThread("线程B");
		t2.start();
		
		/*for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
		}*/
	}
	
	//线程的优先级
	static void test4(){
		
		MyThread t = new MyThread("子线程");
		
		t.setPriority(10);
		System.out.println(t.getPriority());
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
		}
	}
	
	//线程的休眠
	static void test5(){
		
		MyThread t = new MyThread("子线程");
		
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
	
	//线程的连接/等待
	static void test6(){
		
		MyThread t = new MyThread("子线程");
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			
			if(i==10){
				try {
					t.join();   //在当前线程中拉入子线程
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//线程的放弃/礼让
	static void test7(){
		
		MyThread t = new MyThread("子线程");
		
		t.start();
		
		for (int i = 1; i <= 20; i++) {
			System.out.println(Thread.currentThread().getName() + " i=" + i);
			
			if(i>=10){
				System.out.println("主线程放弃。。。");
				Thread.yield();
			}
		}
	}
	
	//守护线程
	static void test8(){
		
		DaemonThread t = new DaemonThread();
		
		//设置为守护线程
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
