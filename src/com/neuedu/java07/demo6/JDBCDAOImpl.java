package com.neuedu.java07.demo6;

public class JDBCDAOImpl implements DAO {

	@Override
	public void save() {
		System.out.println("JDBC����Ӳ���");
	}

	@Override
	public void delete() {
		int $byte = 1;
		System.out.println("JDBC��ɾ������");

	}

	@Override
	public void update() {
		System.out.println("JDBC�ĸ��²���");

	}

	@Override
	public void query() {
		System.out.println("JDBC�Ĳ�ѯ����");

	}

}
