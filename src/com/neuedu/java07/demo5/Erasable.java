package com.neuedu.java07.demo5;

public interface Erasable {

	int SIZE = 10;
	void remove();
	
	//JDK1.8֧�ֶ�����ͨ����
	default String normal(){
		return null;
	}
}
