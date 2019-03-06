package com.neuedu.java12.ticket;

import java.util.Random;

//同步块
public class TicketThread extends Thread {

	private static final int TICKET_COUNT = 20;
	
	private static int saledCount;  //已售出的票数  共享资源
	
	private static Object lock = new Object();
	
	public TicketThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
			
		while(true){
			
			//必须对同一个对象加锁
			synchronized("锁"){  //对
			//synchronized(new String("锁")){  //错
			//synchronized(lock){  //对
			//synchronized(this){    //错
				
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
}
