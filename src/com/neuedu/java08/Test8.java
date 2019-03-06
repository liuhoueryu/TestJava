package com.neuedu.java08;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//日期时间类
public class Test8 {

	public static void main(String[] args) {

		/*Date now = new Date();
		
		System.out.println(now.getYear() + 1900);
		System.out.println(now.getMonth() + 1);
		*/
		
		/*
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));  //DATE等价于DAY_OF_MONTH
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //HOUR 12小时制  HOUR_OF_DAY 24小时制
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		
		//加减
		c.add(Calendar.HOUR_OF_DAY,2);
		
		//Calendar --> Date
		Date d = c.getTime();
		System.out.println(d);
		
		// Date --> Calendar
		c.setTime(d);
		
		c.set(2000, 2, 8, 16, 20, 35);
		System.out.println(c.getTime());
		
		*/
		
		Date now = new Date();
		
		//日期格式化
		DateFormat df = new SimpleDateFormat("yyyy年MM月dd日   HH时mm分ss秒SSS毫秒");  //数据库标准格式"yyyy-MM-dd HH:mm:ss"
		
		System.out.println(df.format(now));
		
	}

}
