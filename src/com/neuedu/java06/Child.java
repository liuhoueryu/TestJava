package com.neuedu.java06;

import java.io.IOException;

public class Child extends Parent{

	static{
		System.out.println("子类静态块");		
	}
	
	{
		System.out.println("子类构造块");		
	}
	
	public Child(){
		System.out.println("子类无参构造方法");
	}
	
	public Child(int i){
		System.out.println("子类有参构造方法 i=" + i);   
		
	}
	
	public IOException method() throws IOException{
		System.out.println("子类普通方法");	
		return null;
	}
	
}
