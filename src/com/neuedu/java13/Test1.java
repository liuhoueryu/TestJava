package com.neuedu.java13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Statement�ӿ�---CRUD
public class Test1 {

	public static void main(String[] args) {
		test2();
	}
	
	//��ɾ��
	static void test1(){
		
		Connection conn = null;
		Statement stmt = null;
		
	    try {
	    	
	    	//����1---ͨ������ʵ�������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");
			
			//����2---����DriverManager�ľ�̬����������ȡ���ݿ����Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", "root", "liuhoueryu123");
			
			//����3---�������Ӷ���Ĺ�����������������
			stmt = conn.createStatement();
			
		    //����4---׼��������SQL���
			//String sql = "insert into user values(null, 'user6', '6', 60)";
			String sql = "update user set score = score + 5 where score>30";
					
		    //����5---����������ĸ��·���������SQL��䣬���ر��θ�����Ӱ��ļ�¼����������>0---��ʾ���³ɹ� ����=0---�Ҳ���Ҫ���µ����� ����<0---����ʧ��
			int rows = stmt.executeUpdate(sql);
			
			System.out.println("rows=" + rows);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			
			  //����6---�ر�����������ݿ����Ӷ���
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	}
	
	//��ѯ
	static void test2(){
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	    try {
	    	
	    	//����1---ͨ������ʵ�������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");
			
			//����2---����DriverManager�ľ�̬����������ȡ���ݿ����Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", "root", "liuhoueryu123");
			
			//����3---�������Ӷ���Ĺ�����������������
			stmt = conn.createStatement();
			
		    //����4---׼��������SQL���
			String sql = "select * from user";
					
		    //����5---����������Ĳ�ѯ����������SQL��䣬���ؽ����

			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				
				System.out.println(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getString(3) + "-" + rs.getInt(4));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			
			  //����6---�ر�����������ݿ����Ӷ���
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	  
	}

}
