package com.neuedu.java07.demo7.usb5;

public class Camera implements USB {

	@Override
	public void start() {
		System.out.println("����ͷ��ʼ����");
	}

	@Override
	public void stop() {
		System.out.println("����ͷֹͣ����");
	}

}
