package com.neuedu.java07.demo6;

public class Test {

	public static void main(String[] args) {

		DAO userDAO = new JDBCDAOImpl();   //��̬    ��������ָ������Ķ���   ���������ǳ������ͻ�ӿ�����  ����ʱ�����Ǿ�������
		
		userDAO.save();
		
		userDAO = new MyBatisDAOImpl();
		
		userDAO.save();
		
		StringBuilder s  =new StringBuilder();
		s.append(1);
System.out.println(s.length());
	}

}
