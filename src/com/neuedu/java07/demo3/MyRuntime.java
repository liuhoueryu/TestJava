package com.neuedu.java07.demo3;

public abstract class MyRuntime {

	//ģ�巽��---�����㷨�Ĳ���
	public void execute(){
		
		long begin = System.currentTimeMillis();

		code();   
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");
		
	}
	
	protected abstract void code();//�ȴ�����ȥ�ṩ����ʵ��
	
	
}
