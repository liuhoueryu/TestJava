package com.neuedu.java06;

import java.io.IOException;

public class Parent {
	
	static{
		System.out.println("���ྲ̬��");		
	}
	
	{
		System.out.println("���๹���");		
	}
	
	public Parent(){
		System.out.println("�����޲ι��췽��");
	}
	
	public Parent(int i){
		System.out.println("�����вι��췽�� i=" + i);		
	}
	
	public IOException method() throws IOException{
		System.out.println("������ͨ����");	
		return null;
	}	
}
