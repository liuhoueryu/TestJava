package com.neuedu.java07.demo7.usb5;

import java.io.IOException;
import java.util.Properties;

//������
public class USBFactory {

	private static Properties prop = new Properties();
	
	//��ʼ��---���������ļ�
	static{
		
		try {
			prop.load(USBFactory.class.getResourceAsStream("usb-config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//�򵥹�������
	static USB getUSB(int type){  //1:MP3  2��udisk
		
		//����type��Ӧ������
		String className = prop.getProperty(type + "");
		
		//ͨ�����䴴������
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
