package com.neuedu.java12.account;

//习题2---模拟实现对同一个账户，老公存钱，老婆取钱的过程
public class Test4 {

	public static void main(String[] args) {

		AccountThread husband = new AccountThread("老公");
		AccountThread wife = new AccountThread("老婆");
		
		husband.start();
		wife.start();
	}

}
