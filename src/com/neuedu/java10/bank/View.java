package com.neuedu.java10.bank;

import java.util.Scanner;

//��ͼ��
public class View {

	private View(){
	}
	
	private static Scanner sc = new Scanner(System.in);
	
	public static int mainMenu(){
		
		System.out.println("*********************");
		System.out.println("1---��¼   2---ע��   3---�˳�");
		System.out.println("*********************");
		
		System.out.print("����ѡ��=");
		
		return sc.nextInt();
	}

	public static int operationMenu(){
		
		System.out.println("*********************");
		System.out.println("1---��ѯ  2---���  3---ȡ��   4---ת��   5---����");
		System.out.println("*********************");
		
		System.out.print("����ѡ��=");
		
		return sc.nextInt();
	}

	
	/*public static String inputAccountId(){
		System.out.print("���뿨��=");
		return sc.next();
	}
	
	public static String inputPassword(){
		System.out.print("��������=");
		return sc.next();
	}*/
	
	public static String input(String tip){
		System.out.print(tip + "=");
		return sc.next();
	}

	
}
