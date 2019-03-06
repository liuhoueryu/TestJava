package com.neuedu.java10.bank;

import java.util.Scanner;

//视图类
public class View {

	private View(){
	}
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int mainMenu(){
		
		System.out.println("*********************");
		System.out.println("1---登录   2---注册   3---退出");
		System.out.println("*********************");
		
		System.out.print("输入选项=");
		
		return sc.nextInt();
	}

	public static int operationMenu(){
		
		System.out.println("*********************");
		System.out.println("1---查询  2---存款  3---取款   4---转账   5---返回");
		System.out.println("*********************");
		
		System.out.print("输入选项=");
		
		return sc.nextInt();
	}

	
	/*public static String inputAccountId(){
		System.out.print("输入卡号=");
		return sc.next();
	}
	
	public static String inputPassword(){
		System.out.print("输入密码=");
		return sc.next();
	}*/
	
	public static String input(String tip){
		System.out.print(tip + "=");
		return sc.next();
	}

	
}
