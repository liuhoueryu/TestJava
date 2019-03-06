package com.neuedu.java07.demo6;

public class JDBCDAOImpl implements DAO {

	@Override
	public void save() {
		System.out.println("JDBC的添加操作");
	}

	@Override
	public void delete() {
		int $byte = 1;
		System.out.println("JDBC的删除操作");

	}

	@Override
	public void update() {
		System.out.println("JDBC的更新操作");

	}

	@Override
	public void query() {
		System.out.println("JDBC的查询操作");

	}

}
