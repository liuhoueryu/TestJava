package com.neuedu.java13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		boolean loginFlag = false;
		
		while(true){
			
			System.out.print("���������ݿ���û���=");
			String username = sc.nextLine();
			
			System.out.print("���������ݿ������=");
			String password = sc.nextLine();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", username, password);
				
				if(conn!=null){
					System.out.println("���ݿ����ӳɹ�");
					loginFlag = true;
					break;
				}

			} catch (ClassNotFoundException e) {
				System.out.println("���ݿ���������ʧ��");
			} catch (SQLException e) {
				System.out.print("��¼ʧ�ܣ��û�������������Ƿ����µ�¼(y/n)=");
				
				String choice = sc.nextLine();
				
				if("n".equalsIgnoreCase(choice)){
					System.out.println("Bye");
					break;
				}
			}
		}
		
		if(loginFlag){   //CRUD����
			
			try {
				stmt = conn.createStatement();
			} catch (SQLException e) {
				System.out.println("�����󴴽�ʧ��");
			}
			
			while(true){
				
				//����SQL���
				System.out.print("SQL>");
				String sql = sc.nextLine().trim().toLowerCase();
				
				if(sql.startsWith("insert") || sql.startsWith("delete") || sql.startsWith("update")){
					
					int rows;
					try {
						rows = stmt.executeUpdate(sql);
						System.out.println("���³ɹ���Ӱ����" + rows + "��");
						
						//��ѯ��ǰ���ȫ����¼    
						String tableName = null;
						
						//��ȡ����
						String[] sqls = sql.split(" ");
						
						if("insert".equals(sqls[0]) || "delete".equals(sqls[0])){
							tableName = sqls[2];
						}else{
							tableName = sqls[1];
						}
						
						sql = "select * from " + tableName;
						
						rs = queryData(stmt, rs, sql);
						
					} catch (SQLException e) {
						System.out.println("����ʧ��");
					}
					
				}else if(sql.startsWith("select")){
					
					rs = queryData(stmt, rs, sql);
					
				}else if(sql.equals("exit")){
					
					try {
						rs.close();
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						System.out.println("�ر���Դʧ��");
					}
					
					System.out.println("Bye");
					break;
				}else{
					System.out.println("SQL��������������������");
				}
			}
		}
		
	}

	private static ResultSet queryData(Statement stmt, ResultSet rs, String sql) {
		
		try {
			rs = stmt.executeQuery(sql);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int columnCount = rsmd.getColumnCount();
			
			//��ӡ��ͷ
			for (int i = 1; i <= columnCount; i++) {
				System.out.print(rsmd.getColumnName(i) +  " ");
			}
			System.out.println();
			
			while(rs.next()){
				
				for (int i = 1; i <= columnCount; i++) {
					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();
			}
		} catch (SQLException e) {
			System.out.println("��ѯʧ��");
		}
		return rs;
	}

}
