package com.neuedu.java07.demo3;

public class MyCode extends MyRuntime {

	@Override
	public void code() {
		
		long s = 1;
		for (int i = 1; i <= 20; i++) {
			s*=i;
		}
		System.out.println("10£¡=" + s);
	}

}

