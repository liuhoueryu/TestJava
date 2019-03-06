package com.neuedu.java07.demo7.usb4;

public class PC {

	public static void main(String[] args) {

		USB mp3 = USBFactory.getUSB(1);
		plugIn(mp3);
		
		USB uDisk = USBFactory.getUSB(2);
		plugIn(uDisk);
		
		USB mouse = USBFactory.getUSB(3);
		plugIn(mouse);
	}

	//方法的参数类型是接口---策略模式
	static void plugIn(USB usb){
		usb.start();
		usb.stop();
	}
	
}
