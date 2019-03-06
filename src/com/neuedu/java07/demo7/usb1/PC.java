package com.neuedu.java07.demo7.usb1;

public class PC {

	public static void main(String[] args) {

		MP3 mp3 = new MP3();
		plugIn(mp3);
		
		UDisk uDisk = new UDisk();
		plugIn(uDisk);
	}

	static void plugIn(MP3 mp3){
		mp3.start();
		mp3.stop();
	}
	
	static void plugIn(UDisk uDisk){
		uDisk.start();
		uDisk.stop();
	}
}
