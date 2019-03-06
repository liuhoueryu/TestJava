package com.neuedu.java07.demo7.usb4;

public class Mouse implements USB {

	@Override
	public void start() {
		System.out.println("鼠标开始工作");
	}

	@Override
	public void stop() {
		System.out.println("鼠标停止工作");
	}

}
