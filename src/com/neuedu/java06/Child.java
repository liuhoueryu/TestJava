package com.neuedu.java06;

import java.io.IOException;

public class Child extends Parent{

	static{
		System.out.println("���ྲ̬��");		
	}
	
	{
		System.out.println("���๹���");		
	}
	
	public Child(){
		System.out.println("�����޲ι��췽��");
	}
	
	public Child(int i){
		System.out.println("�����вι��췽�� i=" + i);   
		
	}
	
	public IOException method() throws IOException{
		System.out.println("������ͨ����");	
		return null;
	}
	
}
