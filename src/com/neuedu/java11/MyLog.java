package com.neuedu.java11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyLog {

	public static void log(Exception e){
		
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("d:/test/log_" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ".txt", true));
			
			//异常发生的时间 + 异常的类名
			ps.println("-------------------------");
			String now = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date());
			ps.println(now + "抛出了" + e.getClass().getSimpleName() + "异常");
			ps.println("-------------------------");
			
			//记录异常栈的信息
			e.printStackTrace(ps);
			
			ps.println();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		try{
			int a = 10/0;
			//String s = null;
			//s.length();
			
		}catch(Exception e){
			MyLog.log(e);
			System.out.println("异常已经记录成功");
		}
	}
}
