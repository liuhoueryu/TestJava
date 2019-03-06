package com.neuedu.java12.redpacket;

import java.util.Random;

public class UserThread extends Thread {

	//������Դ
	private RedPacket rp;
	
	//�û������Ľ��
	private int amount;
	
	public UserThread(String name, RedPacket rp){
		super(name);
		this.rp = rp;
	}
	
	@Override
	public void run() {
		
		Random random = new Random();
		
		synchronized (rp) {
			
			if(rp.getAmount() > 0){
				
				int money = random.nextInt(rp.getAmount()) + 1;
				
				try {
					Thread.sleep(random.nextInt(1000));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				//�������
				rp.setAmount(rp.getAmount() - money);
				
				this.amount = money;
				
				System.out.println(this.getName() + "������" + this.amount + "Ԫ�ĺ��");
			}else{
				System.out.println(this.getName() + "û�������");
			}
		}
		
	}
}
