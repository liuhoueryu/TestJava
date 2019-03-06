package com.neuedu.java07.demo3;

public abstract class MyRuntime {

	//模板方法---描述算法的步骤
	public void execute(){
		
		long begin = System.currentTimeMillis();

		code();   
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");
		
	}
	
	protected abstract void code();//等待子类去提供具体实现
	
	
}
