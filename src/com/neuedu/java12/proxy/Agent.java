package com.neuedu.java12.proxy;

//代理主题
public class Agent implements BuyHouse {

	private Buyer buyer;  //组合
	
	public Agent(Buyer buyer){
		this.buyer = buyer;   //注入
	}
	
	public void search(){
		System.out.println("中介找房源");
	}
	
	@Override
	public void select() {
		buyer.select();  //委托
	}

	public void loan(){
		System.out.println("中介办贷款");
	}
	
	@Override
	public void pay() {
		buyer.pay();  //委托
	}

	public void handle(){
		System.out.println("中介办过户");
	}
	
	public void buy(){
		this.search();
		this.select();
		this.loan();
		this.pay();
		this.handle();
	}
	
}
