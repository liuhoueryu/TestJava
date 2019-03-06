package com.neuedu.java12.cake1;

public class Test {

	public static void main(String[] args) {

		Cake cake = new Cake();
		
		new CookerThread(cake).start();
		new CustomerThread(cake).start();
 	}

}
