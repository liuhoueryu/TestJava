 package com.neuedu.java12.ticket;

import java.util.Random;

//ͬ������
public class TicketThread2 extends Thread {

	private static final int TICKET_COUNT = 20;
	
	private static int saledCount;  //���۳���Ʊ��
	
	private static Object lock = new Object();
	
	public TicketThread2(String name){
		super(name);
	}
	
	@Override
	public synchronized void run() {
			
		while(true){
			
				if(saledCount<TICKET_COUNT){  //������
			
					saledCount++;  //д����
					
					try {
						Thread.sleep(new Random().nextInt(100));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(this.getName() + "�۳��˵�" + saledCount + "��Ʊ");
				}else{
					System.out.println(this.getName() + "ȫ������");
					break;
				}
			}

	}
}
