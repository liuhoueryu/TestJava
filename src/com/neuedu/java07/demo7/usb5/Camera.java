package com.neuedu.java07.demo7.usb5;

public class Camera implements USB {

	@Override
	public void start() {
		System.out.println("摄像头开始工作");
	}

	@Override
	public void stop() {
		System.out.println("摄像头停止工作");
	}

}
