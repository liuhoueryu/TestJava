package com.neuedu.java12.schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ShowTimeThread extends Thread {

	private DateFormat df = new SimpleDateFormat("HH:mm:ss");
	
	private boolean stopFlag = false;

	//终止线程
	public void stopThread(){
		this.stopFlag = true;
	}
	
	@Override
	public synchronized void run() {
		
		while(!stopFlag){
			
			try {
				this.wait();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			System.out.println("当前时间=" + df.format(new Date()));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}
