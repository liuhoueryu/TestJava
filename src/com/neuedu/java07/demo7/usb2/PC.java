package com.neuedu.java07.demo7.usb2;

public class PC {

	public static void main(String[] args) {

		USB mp3 = new MP3();
		plugIn(mp3);
		
		USB uDisk = new UDisk();
		plugIn(uDisk);
	}

	//�����Ĳ��������ǽӿ�---����ģʽ
	static void plugIn(USB usb){
		usb.start();
		usb.stop();
	}
	
}
