package com.neuedu.java13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//Statement接口---CRUD
public class Test1 {

	public static void main(String[] args) {
		test2();
	}
	
	//增删改
	static void test1(){
		
		Connection conn = null;
		Statement stmt = null;
		
	    try {
	    	
	    	//步骤1---通过反射实例化数据库驱动类
			Class.forName("com.mysql.jdbc.Driver");
			
			//步骤2---调用DriverManager的静态工厂方法获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", "root", "liuhoueryu123");
			
			//步骤3---调用连接对象的工厂方法创建语句对象
			stmt = conn.createStatement();
			
		    //步骤4---准备完整的SQL语句
			//String sql = "insert into user values(null, 'user6', '6', 60)";
			String sql = "update user set score = score + 5 where score>30";
					
		    //步骤5---调用语句对象的更新方法，传入SQL语句，返回本次更新所影响的记录行数，行数>0---表示更新成功 行数=0---找不到要更新的数据 行数<0---更新失败
			int rows = stmt.executeUpdate(sql);
			
			System.out.println("rows=" + rows);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			
			  //步骤6---关闭语句对象和数据库连接对象
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	}
	
	//查询
	static void test2(){
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
	    try {
	    	
	    	//步骤1---通过反射实例化数据库驱动类
			Class.forName("com.mysql.jdbc.Driver");
			
			//步骤2---调用DriverManager的静态工厂方法获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", "root", "liuhoueryu123");
			
			//步骤3---调用连接对象的工厂方法创建语句对象
			stmt = conn.createStatement();
			
		    //步骤4---准备完整的SQL语句
			String sql = "select * from user";
					
		    //步骤5---调用语句对象的查询方法，传入SQL语句，返回结果集

			rs = stmt.executeQuery(sql);
			
			while(rs.next()){
				
				System.out.println(rs.getInt(1) + "-" + rs.getString(2) + "-" + rs.getString(3) + "-" + rs.getInt(4));
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			
			  //步骤6---关闭语句对象和数据库连接对象
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
