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
			
			System.out.print("请输入数据库的用户名=");
			String username = sc.nextLine();
			
			System.out.print("请输入数据库的密码=");
			String password = sc.nextLine();
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", username, password);
				
				if(conn!=null){
					System.out.println("数据库连接成功");
					loginFlag = true;
					break;
				}

			} catch (ClassNotFoundException e) {
				System.out.println("数据库驱动加载失败");
			} catch (SQLException e) {
				System.out.print("登录失败，用户名或密码错误，是否重新登录(y/n)=");
				
				String choice = sc.nextLine();
				
				if("n".equalsIgnoreCase(choice)){
					System.out.println("Bye");
					break;
				}
			}
		}
		
		if(loginFlag){   //CRUD操作
			
			try {
				stmt = conn.createStatement();
			} catch (SQLException e) {
				System.out.println("语句对象创建失败");
			}
			
			while(true){
				
				//输入SQL语句
				System.out.print("SQL>");
				String sql = sc.nextLine().trim().toLowerCase();
				
				if(sql.startsWith("insert") || sql.startsWith("delete") || sql.startsWith("update")){
					
					int rows;
					try {
						rows = stmt.executeUpdate(sql);
						System.out.println("更新成功，影响了" + rows + "行");
						
						//查询当前表的全部记录    
						String tableName = null;
						
						//获取表名
						String[] sqls = sql.split(" ");
						
						if("insert".equals(sqls[0]) || "delete".equals(sqls[0])){
							tableName = sqls[2];
						}else{
							tableName = sqls[1];
						}
						
						sql = "select * from " + tableName;
						
						rs = queryData(stmt, rs, sql);
						
					} catch (SQLException e) {
						System.out.println("更新失败");
					}
					
				}else if(sql.startsWith("select")){
					
					rs = queryData(stmt, rs, sql);
					
				}else if(sql.equals("exit")){
					
					try {
						rs.close();
						stmt.close();
						conn.close();
					} catch (SQLException e) {
						System.out.println("关闭资源失败");
					}
					
					System.out.println("Bye");
					break;
				}else{
					System.out.println("SQL语句输入错误，请重新输入");
				}
			}
		}
		
	}

	private static ResultSet queryData(Statement stmt, ResultSet rs, String sql) {
		
		try {
			rs = stmt.executeQuery(sql);
			
			ResultSetMetaData rsmd = rs.getMetaData();
			
			int columnCount = rsmd.getColumnCount();
			
			//打印表头
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
			System.out.println("查询失败");
		}
		return rs;
	}

}
