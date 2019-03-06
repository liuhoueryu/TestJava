package com.neuedu.java13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//PreparedStatement�ӿ�---CRUD
public class Test2 {

	public static void main(String[] args) {
		test2();
	}
	
	//��ɾ��
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
			//String sql = "update user set score = score + 5 where score>30";
			
			//����4---�������Ӷ���Ĺ�����������������
			pstmt = conn.prepareStatement(sql);
			
			//����5---������ֵ
			pstmt.setString(1, "user6");
			pstmt.setString(2, "6");
			pstmt.setInt(3, 60);
			
		    //����6---����������ĸ��·��������ر��θ�����Ӱ��ļ�¼����������>0---��ʾ���³ɹ� ����=0---�Ҳ���Ҫ���µ����� ����<0---����ʧ��
			int rows = pstmt.executeUpdate();
			
			System.out.println("rows=" + rows);
			
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
	
	//��ѯ
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
			String sql = "select * from user where score > ?";
			
			//����4---�������Ӷ���Ĺ�����������������
			pstmt = conn.prepareStatement(sql);
		   	
			//����5---������ֵ
			pstmt.setInt(1, 30);
			
		    //����6---����������Ĳ�ѯ����������SQL��䣬���ؽ����
			rs = pstmt.executeQuery();
			
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
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	  
	}

}
