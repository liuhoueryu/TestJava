package com.neuedu.java12.proxy;

//真实主题/目标对象
public class Buyer implements BuyHouse {

	@Override
	public void select() {
		System.out.println("客户选房");
	}

	@Override
	public void pay() {
		System.out.println("客户付款");

	}

}
