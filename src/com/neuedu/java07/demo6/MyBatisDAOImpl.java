package com.neuedu.java07.demo6;

public class MyBatisDAOImpl implements DAO {

	@Override
	public void save() {
		System.out.println("MyBatis����Ӳ���");

	}

	@Override
	public void delete() {
		System.out.println("MyBatis��ɾ������");

	}

	@Override
	public void update() {
		System.out.println("MyBatis�ĸ��²���");

	}

	@Override
	public void query() {
		System.out.println("MyBatis�Ĳ�ѯ����");

	}

}
