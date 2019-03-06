package com.neuedu.java12.schedule;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class ShowTimeTask extends TimerTask {

	private DateFormat df = new SimpleDateFormat("HH:mm:ss");
	
	@Override
	public void run() {

		System.out.println("当前时间=" + df.format(new Date()));

	}

}
