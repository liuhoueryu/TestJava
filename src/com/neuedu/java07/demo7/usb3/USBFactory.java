package com.neuedu.java07.demo7.usb3;

//工厂类
public class USBFactory {

	//简单工厂方法
	static USB getUSB(int type){  //1:MP3  2：udisk
		
		if(type==1){
			return new MP3();
		}else if(type==2){
			return new UDisk();
		}
			
		return null;
	}
}
