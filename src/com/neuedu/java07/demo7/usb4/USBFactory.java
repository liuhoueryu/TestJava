package com.neuedu.java07.demo7.usb4;

import java.util.HashMap;
import java.util.Map;

//工厂类
public class USBFactory {

	private static Map<Integer, USB> map = new HashMap<>();
	
	//初始化map
	static{
		map.put(1, new MP3());
		map.put(2, new UDisk());
		map.put(3, new Mouse());
	}
	
	//简单工厂方法
	static USB getUSB(int type){  //1:MP3  2：udisk
		
		return map.get(type);
		
	}
}
