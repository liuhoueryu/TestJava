package com.neuedu.java12.cake3;

import java.util.List;

//生产者线程
public class CookerThread extends Thread {

	private static final int MAX_CAKE_COUNT = 4;
	
	//共享资源
	private List<Cake> cakeList;

	public CookerThread(List<Cake> cakeList, String name) {
		super(name);
		this.cakeList = cakeList;
	}


	@Override
	public void run() {
		
		int index = 0;   //蛋糕的序号
		
		while(true){
			
			synchronized (cakeList) {
				
				while(cakeList.size()==MAX_CAKE_COUNT){  //
					try {
						System.out.println(this.getName() + "暂时无法生产。。。");
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
				
				Cake cake = new Cake();
				cake.setName("第" + (++index) + " 个蛋糕");
				cakeList.add(cake);
				
				System.out.println(this.getName() + "生产了" + cake.getName() + "size=" + cakeList.size());
				
				
				
				//通知消费者
				cakeList.notifyAll();
				
			}
		}
		
	}
}
