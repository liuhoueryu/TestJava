package com.neuedu.java12.base;

//守护线程
class DaemonThread extends Thread{

	@Override
	public void run() {

		for(int i = 1; i<=100 ; i++){

			System.out.println(this.getName() + "更新包已下载" + i + "%");

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println("更新包下载完毕，准备安装...");
	}
}
