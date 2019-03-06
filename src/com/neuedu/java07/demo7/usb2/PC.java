package com.neuedu.java07.demo7.usb2;

public class PC {

	public static void main(String[] args) {

		USB mp3 = new MP3();
		plugIn(mp3);
		
		USB uDisk = new UDisk();
		plugIn(uDisk);
	}

	//方法的参数类型是接口---策略模式
	static void plugIn(USB usb){
		usb.start();
		usb.stop();
	}
	
}
