package com.neuedu.java13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

//Statement�ӿ�---ϰ��
public class Test3 {

	public static void main(String[] args) {
		test2();
	}
	
	//��������
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
			
			long begin = System.currentTimeMillis();
			
			for (int i = 1; i <= 1000; i++) {
				 //����4---׼��������SQL���
				String sql = "insert into user values(null, 'user" + i + "', '" + i + "', " + i*10 + ")";
						
			    //����5---����������ĸ��·���������SQL��䣬���ر��θ�����Ӱ��ļ�¼����������>0---��ʾ���³ɹ� ����=0---�Ҳ���Ҫ���µ����� ����<0---����ʧ��
				stmt.executeUpdate(sql);
			}
		   
			long end = System.currentTimeMillis();
			
			System.out.println("���³ɹ�,time=" + (end-begin) + "ms");  //46521ms
			
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
	
	//ģ���¼
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
			
			Scanner sc = new Scanner(System.in);
			System.out.print("�û���=");
			String username = sc.nextLine();
			System.out.print("����=");
			String password = sc.nextLine();
			
		    //����4---׼��������SQL���
			String sql = "select * from user where username='" + username + "' and password='" + password + "'";
					
		    //����5---����������Ĳ�ѯ����������SQL��䣬���ؽ����
			rs = stmt.executeQuery(sql);
			
			if(rs.next()){   
				System.out.println("��¼�ɹ�");
			}else{
				System.out.println("��¼ʧ��");
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
