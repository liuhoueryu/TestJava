package com.neuedu.java07.demo5;

public class Test {

	public static void main(String[] args) {
		
		Pencil p = new Pencil("��ͨǦ��");
		p.write();

		AdvancePencil ap = new AdvancePencil("2BǦ��");
		ap.write();
		ap.remove();
		
		//�ӿ��е�ȫ�ֳ���ʹ�ýӿ���.����������ʽ����   Erasable.SIZE
	}

}
