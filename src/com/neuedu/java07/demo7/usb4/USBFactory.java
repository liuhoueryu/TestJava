package com.neuedu.java07.demo7.usb4;

import java.util.HashMap;
import java.util.Map;

//������
public class USBFactory {

	private static Map<Integer, USB> map = new HashMap<>();
	
	//��ʼ��map
	static{
		map.put(1, new MP3());
		map.put(2, new UDisk());
		map.put(3, new Mouse());
	}
	
	//�򵥹�������
	static USB getUSB(int type){  //1:MP3  2��udisk
		
		return map.get(type);
		
	}
}
