package com.neuedu.java12.base;

//�ػ��߳�
class DaemonThread extends Thread{

	@Override
	public void run() {

		for(int i = 1; i<=100 ; i++){

			System.out.println(this.getName() + "���°�������" + i + "%");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("���°�������ϣ�׼����װ...");
	}
}
