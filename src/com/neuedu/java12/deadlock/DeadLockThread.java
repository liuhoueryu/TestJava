package com.neuedu.java12.deadlock;

public class DeadLockThread extends Thread {

	public DeadLockThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		if("张三".equals(this.getName())){
			
			synchronized ("身份证") {
				
				System.out.println(this.getName() + "有身份证了，还需要银行卡");
				
				synchronized ("银行卡") {
					
					System.out.println(this.getName() + "有银行卡了，可以取钱了");
				}
				
			}
		}else{
			synchronized ("银行卡") {
				
				System.out.println(this.getName() + "有银行卡了，还需要身份证");
				
				synchronized ("身份证") {
					
					System.out.println(this.getName() + "有身份证了，可以取钱了");
				}
				
			}
		}
	}
	
}
