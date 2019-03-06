package com.neuedu.java07.demo7.usb5;

import java.io.IOException;
import java.util.Properties;

//工厂类
public class USBFactory {

	private static Properties prop = new Properties();
	
	//初始化---加载属性文件
	static{
		
		try {
			prop.load(USBFactory.class.getResourceAsStream("usb-config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//简单工厂方法
	static USB getUSB(int type){  //1:MP3  2：udisk
		
		//根据type对应的类名
		String className = prop.getProperty(type + "");
		
		//通过反射创建对象
		USB usb;
		try {
			usb = (USB) Class.forName(className).newInstance();
			return usb;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
}
