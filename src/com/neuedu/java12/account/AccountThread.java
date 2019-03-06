package com.neuedu.java12.account;

import java.util.Random;

public class AccountThread extends Thread {

	private static Account account = new Account();
	
	public AccountThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
	
		Random random = new Random();
		
		while(true){
			
			if("老公".equals(this.getName())){
				
				int amount = random.nextInt(10)+1;
				
				synchronized ("锁") {
					
					account.save(amount);
					
					System.out.println(this.getName() + "存入" + amount + "元， 当前余额=" + account.getAmount() + "元");
				}

			}else{
				
				int amount = random.nextInt(10)+1;
				
				synchronized ("锁") {
					
					if(account.withdraw(amount)){
						System.out.println(this.getName() + "取出" + amount + "元， 当前余额=" + account.getAmount() + "元");
					}else{
						System.out.println(this.getName() + "无法取出" + amount + "元， 当前余额=" + account.getAmount() + "元");
					}
					
				}
				
			}
		}
	}
}
