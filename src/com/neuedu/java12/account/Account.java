package com.neuedu.java12.account;

public class Account {

	private int amount = 0;

	public int getAmount() {
		return amount;
	}
	
	public void save(int amount){  //��Ǯ
		this.amount += amount;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public boolean withdraw(int amount){  //ȡǮ
		
		if(this.amount>=amount){
			this.amount -= amount;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return true;
		}else{
			return false;
		}
		
	}
	   
}
