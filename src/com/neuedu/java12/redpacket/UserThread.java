package com.neuedu.java12.redpacket;

import java.util.Random;

public class UserThread extends Thread {

	//共享资源
	private RedPacket rp;
	
	//用户抢到的金额
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
				
				//更新余额
				rp.setAmount(rp.getAmount() - money);
				
				this.amount = money;
				
				System.out.println(this.getName() + "抢到了" + this.amount + "元的红包");
			}else{
				System.out.println(this.getName() + "没抢到红包");
			}
		}
		
	}
}
