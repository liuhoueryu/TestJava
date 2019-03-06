package com.neuedu.java12.singleton;

public class SingletonThread extends Thread {

	@Override
	public void run() {
	
		System.out.println(Singleton.getInstance());
		
	}
}
