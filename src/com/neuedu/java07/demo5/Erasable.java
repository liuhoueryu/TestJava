package com.neuedu.java07.demo5;

public interface Erasable {

	int SIZE = 10;
	void remove();
	
	//JDK1.8支持定义普通方法
	default String normal(){
		return null;
	}
}
