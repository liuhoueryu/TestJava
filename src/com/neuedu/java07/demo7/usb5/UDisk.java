package com.neuedu.java07.demo7.usb5;

public class UDisk implements USB{

	@Override
	public void start(){
		System.out.println("U�̿�ʼ����");
	}

	@Override
	public void stop(){
		System.out.println("U��ֹͣ����");
	}
}
