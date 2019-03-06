package com.neuedu.java09;

//只try不抛的异常---不能破坏父子类的重写规则
public class Test6 {

	public static void main(String[] args) {

	}

}

class MyThread extends Thread{
	
	@Override
	public void run() {

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}