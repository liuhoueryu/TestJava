package com.neuedu.java12.cake2;

import java.util.List;

//消费者线程
public class CustomerThread extends Thread {

	//共享资源
	private List<Cake> cakeList;

	public CustomerThread(List<Cake> cakeList) {
		super();
		this.cakeList = cakeList;
	}

	@Override
	public void run() {
		
		while(true){
			
			synchronized (cakeList) {
				
				while(cakeList.size()==0){  
					try {
						System.out.println("暂时无法消费。。。");
						cakeList.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				Cake cake = cakeList.get(0);
				
				cakeList.remove(cake);
				
				System.out.println("消费了" + cake.getName() + "size=" + cakeList.size());
				
				
				//通知生产者
				cakeList.notifyAll();
				
			}
		}
		
	}
}
