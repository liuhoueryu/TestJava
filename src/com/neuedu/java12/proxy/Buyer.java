package com.neuedu.java12.proxy;

//��ʵ����/Ŀ�����
public class Buyer implements BuyHouse {

	@Override
	public void select() {
		System.out.println("�ͻ�ѡ��");
	}

	@Override
	public void pay() {
		System.out.println("�ͻ�����");

	}

}
