package com.neuedu.java12.singleton;

public class Singleton {

	//����ʽ
	//�ڲ��ṩһ��Ψһ��ʵ��
	private static Singleton instance = null;
	
	//���췽��˽�л�
	private Singleton(){
	}
	
	//�ṩ���еķ���������ܹ�ͨ������ֱ�ӷ���
	public static Singleton getInstance(){
		
		if(instance==null){  //���Ч��  ˫�ؼ��
			
			synchronized(Singleton.class){
				
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
	
}
