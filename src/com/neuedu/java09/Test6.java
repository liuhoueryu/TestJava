package com.neuedu.java09;

//ֻtry���׵��쳣---�����ƻ����������д����
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