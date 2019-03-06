package com.neuedu.java13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//PreparedStatement�ӿ�---ϰ��
public class Test4 {

	public static void main(String[] args) {
		test2();
	}
	
	//��������
	static void test1(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
	    try {
	    	
	    	//����1---ͨ������ʵ�������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");
			
			//����2---����DriverManager�ľ�̬����������ȡ���ݿ����Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", "root", "liuhoueryu123");
			
			//����3---׼����?��SQL���
			String sql = "insert into user values(null, ?, ?, ?)";
			
			//����4---�������Ӷ���Ĺ�����������������
			pstmt = conn.prepareStatement(sql);
			
			long begin = System.currentTimeMillis();
			
			for (int i = 1; i <= 1000; i++) {
				//����5---������ֵ
				pstmt.setString(1, "user" + i);
				pstmt.setString(2, ""+i);
				pstmt.setInt(3, i*10);
				
			    //����6---����������ĸ��·��������ر��θ�����Ӱ��ļ�¼����������>0---��ʾ���³ɹ� ����=0---�Ҳ���Ҫ���µ����� ����<0---����ʧ��
				pstmt.executeUpdate();
				
			}
			   
			long end = System.currentTimeMillis();
			
			System.out.println("���³ɹ�,time=" + (end-begin) + "ms");  //45028ms
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			
			  //����6---�ر�����������ݿ����Ӷ���
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	}
	
	//ģ���¼
	static void test2(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	    try {
	    	
	    	//����1---ͨ������ʵ�������ݿ�������
			Class.forName("com.mysql.jdbc.Driver");
			
			//����2---����DriverManager�ľ�̬����������ȡ���ݿ����Ӷ���
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", "root", "liuhoueryu123");
			
			//����3---׼��?��SQL���
			String sql = "select * from user where username = ? and password = ?";
			
			//����4---�������Ӷ���Ĺ�����������������
			pstmt = conn.prepareStatement(sql);
		   	
			Scanner sc = new Scanner(System.in);
			System.out.print("�û���=");
			String username = sc.nextLine();
			System.out.print("����=");
			String password = sc.nextLine();
			
			//����5---������ֵ
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
		    //����6---����������Ĳ�ѯ����������SQL��䣬���ؽ����
			rs = pstmt.executeQuery();
			
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
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	  
	}

}
