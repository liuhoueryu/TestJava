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
			
			if("�Ϲ�".equals(this.getName())){
				
				int amount = random.nextInt(10)+1;
				
				synchronized ("��") {
					
					account.save(amount);
					
					System.out.println(this.getName() + "����" + amount + "Ԫ�� ��ǰ���=" + account.getAmount() + "Ԫ");
				}

			}else{
				
				int amount = random.nextInt(10)+1;
				
				synchronized ("��") {
					
					if(account.withdraw(amount)){
						System.out.println(this.getName() + "ȡ��" + amount + "Ԫ�� ��ǰ���=" + account.getAmount() + "Ԫ");
					}else{
						System.out.println(this.getName() + "�޷�ȡ��" + amount + "Ԫ�� ��ǰ���=" + account.getAmount() + "Ԫ");
					}
					
				}
				
			}
		}
	}
}
