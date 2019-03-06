package com.neuedu.java12.base;

//创建线程的方式2---实现Runnable接口
public class MyRunnable implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <=20; i++) {
			System.out.println("\t子线程 i=" + i);
		}
		
		System.out.println("子线程结束************");
	}

}
