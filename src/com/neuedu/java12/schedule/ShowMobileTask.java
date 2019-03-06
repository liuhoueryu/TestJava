package com.neuedu.java12.schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.TimerTask;

public class ShowMobileTask extends TimerTask {

	@Override
	public void run() {

		//生成手机号
	    StringBuilder sb = new StringBuilder("13");
	   
	    for (int i = 1; i < 10; i++) {
			
	    	sb.append(new Random().nextInt(10));
		}
	    
	    System.out.println(sb.toString());

	}

}
