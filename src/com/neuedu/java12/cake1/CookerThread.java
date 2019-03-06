package com.neuedu.java12.cake1;

//生产者线程
public class CookerThread extends Thread {

	private Cake cake;
	
	public CookerThread(Cake cake) {
		super();
		this.cake = cake;
	}

	@Override
	public void run() {
		
		int index = 0;   //蛋糕的序号
		
		while(true){
			
			synchronized (cake) {
				
				if(cake.isFlag()){  //已存在
					try {
						System.out.println("暂时无法生产。。。");
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
				
				cake.setName("第" + (++index) + " 个蛋糕");
				
				System.out.println("生产了" + cake.getName());
				
				cake.setFlag(true);
				
				//通知消费者
				cake.notifyAll();
			
			}
		}
		
	}
}
