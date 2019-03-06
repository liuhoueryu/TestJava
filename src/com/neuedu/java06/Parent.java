package com.neuedu.java06;

import java.io.IOException;

public class Parent {
	
	static{
		System.out.println("父类静态块");		
	}
	
	{
		System.out.println("父类构造块");		
	}
	
	public Parent(){
		System.out.println("父类无参构造方法");
	}
	
	public Parent(int i){
		System.out.println("父类有参构造方法 i=" + i);		
	}
	
	public IOException method() throws IOException{
		System.out.println("父类普通方法");	
		return null;
	}	
}
