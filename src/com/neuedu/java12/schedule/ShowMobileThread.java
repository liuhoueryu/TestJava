package com.neuedu.java12.schedule;

import java.util.Random;

public class ShowMobileThread extends Thread {
	
	private boolean stopFlag = false;

	private String mobile = null;
	
	public String getMobile() {
		return mobile;
	}

	//终止线程
	public void stopThread(){
		this.stopFlag = true;
	}
	
	@Override
	public void run() {
		
		while(!stopFlag){
			
			//生成手机号
		    StringBuilder sb = new StringBuilder("13");
		    
		   
		    for (int i = 1; i < 10; i++) {
				
		    	sb.append(new Random().nextInt(10));
			}

		    this.mobile = sb.toString();
		    
		    System.out.println(this.mobile);
		    
		    try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}
}
