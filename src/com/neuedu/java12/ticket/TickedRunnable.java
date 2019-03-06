package com.neuedu.java12.ticket;

import java.util.Random;

public class TickedRunnable implements Runnable {

private static final int TICKET_COUNT = 20;
	
	private int saledCount;  //已售出的票数

	@Override
	public void run() {
	while(true){
			
			//必须对同一个对象加锁
			synchronized("锁"){  //对
				
				if(saledCount<TICKET_COUNT){  //读操作
			
					saledCount++;  //写操作
					
					try {
						Thread.sleep(new Random().nextInt(100));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + "售出了第" + saledCount + "张票");
				}else{
					System.out.println(Thread.currentThread().getName() + "全部售完");
					break;
				}
			}
			
		}

	}

}
