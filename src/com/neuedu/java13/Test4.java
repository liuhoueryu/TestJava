package com.neuedu.java13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//PreparedStatement接口---习题
public class Test4 {

	public static void main(String[] args) {
		test2();
	}
	
	//批量插入
	static void test1(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
	    try {
	    	
	    	//步骤1---通过反射实例化数据库驱动类
			Class.forName("com.mysql.jdbc.Driver");
			
			//步骤2---调用DriverManager的静态工厂方法获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", "root", "liuhoueryu123");
			
			//步骤3---准备带?的SQL语句
			String sql = "insert into user values(null, ?, ?, ?)";
			
			//步骤4---调用连接对象的工厂方法创建语句对象
			pstmt = conn.prepareStatement(sql);
			
			long begin = System.currentTimeMillis();
			
			for (int i = 1; i <= 1000; i++) {
				//步骤5---参数赋值
				pstmt.setString(1, "user" + i);
				pstmt.setString(2, ""+i);
				pstmt.setInt(3, i*10);
				
			    //步骤6---调用语句对象的更新方法，返回本次更新所影响的记录行数，行数>0---表示更新成功 行数=0---找不到要更新的数据 行数<0---更新失败
				pstmt.executeUpdate();
				
			}
			   
			long end = System.currentTimeMillis();
			
			System.out.println("更新成功,time=" + (end-begin) + "ms");  //45028ms
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			
			  //步骤6---关闭语句对象和数据库连接对象
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
				
	}
	
	//模拟登录
	static void test2(){
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
	    try {
	    	
	    	//步骤1---通过反射实例化数据库驱动类
			Class.forName("com.mysql.jdbc.Driver");
			
			//步骤2---调用DriverManager的静态工厂方法获取数据库连接对象
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/tylgky", "root", "liuhoueryu123");
			
			//步骤3---准备?的SQL语句
			String sql = "select * from user where username = ? and password = ?";
			
			//步骤4---调用连接对象的工厂方法创建语句对象
			pstmt = conn.prepareStatement(sql);
		   	
			Scanner sc = new Scanner(System.in);
			System.out.print("用户名=");
			String username = sc.nextLine();
			System.out.print("密码=");
			String password = sc.nextLine();
			
			//步骤5---参数赋值
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
		    //步骤6---调用语句对象的查询方法，传入SQL语句，返回结果集
			rs = pstmt.executeQuery();
			
			if(rs.next()){   
				System.out.println("登录成功");
			}else{
				System.out.println("登录失败");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			
			  //步骤6---关闭语句对象和数据库连接对象
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
