package com.neuedu.java07.demo7.usb4;

public class MP3 implements USB{

	@Override
	public void start(){
		System.out.println("MP3��ʼ����");
	}

	@Override
	public void stop(){
		System.out.println("MP3ֹͣ����");
	}
	
	
}
