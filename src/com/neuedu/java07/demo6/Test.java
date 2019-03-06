package com.neuedu.java07.demo6;

public class Test {

	public static void main(String[] args) {

		DAO userDAO = new JDBCDAOImpl();   //多态    父类引用指向子类的对象   编译类型是抽象类型或接口类型  运行时类型是具体子类
		
		userDAO.save();
		
		userDAO = new MyBatisDAOImpl();
		
		userDAO.save();
		
		StringBuilder s  =new StringBuilder();
		s.append(1);
System.out.println(s.length());
	}

}
