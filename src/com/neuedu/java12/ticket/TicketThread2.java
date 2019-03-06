 package com.neuedu.java12.ticket;

import java.util.Random;

//同步方法
public class TicketThread2 extends Thread {

	private static final int TICKET_COUNT = 20;
	
	private static int saledCount;  //已售出的票数
	
	private static Object lock = new Object();
	
	public TicketThread2(String name){
		super(name);
	}
	
	@Override
	public synchronized void run() {
			
		while(true){
			
				if(saledCount<TICKET_COUNT){  //读操作
			
					saledCount++;  //写操作
					
					try {
						Thread.sleep(new Random().nextInt(100));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(this.getName() + "售出了第" + saledCount + "张票");
				}else{
					System.out.println(this.getName() + "全部售完");
					break;
				}
			}

	}
}
