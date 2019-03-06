package com.neuedu.java07.demo6;

public class MyBatisDAOImpl implements DAO {

	@Override
	public void save() {
		System.out.println("MyBatis的添加操作");

	}

	@Override
	public void delete() {
		System.out.println("MyBatis的删除操作");

	}

	@Override
	public void update() {
		System.out.println("MyBatis的更新操作");

	}

	@Override
	public void query() {
		System.out.println("MyBatis的查询操作");

	}

}
