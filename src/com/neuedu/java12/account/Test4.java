package com.neuedu.java12.account;

//ϰ��2---ģ��ʵ�ֶ�ͬһ���˻����Ϲ���Ǯ������ȡǮ�Ĺ���
public class Test4 {

	public static void main(String[] args) {

		AccountThread husband = new AccountThread("�Ϲ�");
		AccountThread wife = new AccountThread("����");
		
		husband.start();
		wife.start();
	}

}
