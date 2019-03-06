package com.neuedu.java07.demo7.usb5;

public class MP3 implements USB{

	@Override
	public void start(){
		System.out.println("MP3开始工作");
	}

	@Override
	public void stop(){
		System.out.println("MP3停止工作");
	}
	
	/*public MP3(){
		System.out.println("无参的构造方法");
	}*/
}
