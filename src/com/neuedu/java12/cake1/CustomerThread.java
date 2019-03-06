package com.neuedu.java12.cake1;

//消费者线程
public class CustomerThread extends Thread {

	private Cake cake;
	
	public CustomerThread(Cake cake) {
		super();
		this.cake = cake;
	}

	@Override
	public void run() {
		
		while(true){
			
			synchronized (cake) {
				
				if(!cake.isFlag()){  //不存在
					try {
						System.out.println("暂时无法消费。。。");
						cake.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("消费了" + cake.getName());
				
				cake.setFlag(false);
				
				//通知生产者
				cake.notifyAll();
				
			}
		}
		
	}
}
