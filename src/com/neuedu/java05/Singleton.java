package com.neuedu.java05;

public class Singleton {

	/*  ����ʽ
	//�ڲ��ṩһ��Ψһ��ʵ��
	private static Singleton instance = new Singleton();
	
	//���췽��˽�л�
	private Singleton(){
	}
	
	//�ṩ���еķ���������ܹ�ͨ������ֱ�ӷ���
	public static Singleton getInstance(){
		return instance;
	}
	*/
	
	//����ʽ
	//�ڲ��ṩһ��Ψһ��ʵ��
	private static Singleton instance = null;
	
	//���췽��˽�л�
	private Singleton(){
	}
	
	//�ṩ���еķ���������ܹ�ͨ������ֱ�ӷ���
	public static Singleton getInstance(){
		
		if(instance==null){
			instance = new Singleton();
		}
		
		return instance;
	}
	
}
