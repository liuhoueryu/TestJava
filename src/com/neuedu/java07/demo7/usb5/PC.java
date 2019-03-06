package com.neuedu.java07.demo7.usb5;

public class PC {

	public static void main(String[] args) {

		USB mp3 = USBFactory.getUSB(1);
		plugIn(mp3);
		
		USB uDisk = USBFactory.getUSB(2);
		plugIn(uDisk);
		
		USB mouse = USBFactory.getUSB(3);
		plugIn(mouse);
		
		USB camera = USBFactory.getUSB(4);
		plugIn(camera);
	}

	//�����Ĳ��������ǽӿ�---����ģʽ
	static void plugIn(USB usb){
		usb.start();
		usb.stop();
	}
	
}
