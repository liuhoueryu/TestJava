package com.neuedu.java12.proxy;

public class Test {

	public static void main(String[] args) {
		
		Agent agent = new Agent(new Buyer());
		
		agent.buy();   //门面模式

	}

}
