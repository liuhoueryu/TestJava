package com.neuedu.java12.proxy;

//��������
public class Agent implements BuyHouse {

	private Buyer buyer;  //���
	
	public Agent(Buyer buyer){
		this.buyer = buyer;   //ע��
	}
	
	public void search(){
		System.out.println("�н��ҷ�Դ");
	}
	
	@Override
	public void select() {
		buyer.select();  //ί��
	}

	public void loan(){
		System.out.println("�н�����");
	}
	
	@Override
	public void pay() {
		buyer.pay();  //ί��
	}

	public void handle(){
		System.out.println("�н�����");
	}
	
	public void buy(){
		this.search();
		this.select();
		this.loan();
		this.pay();
		this.handle();
	}
	
}
