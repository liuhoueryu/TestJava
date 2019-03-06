package com.neuedu.java12.ticket;

import java.util.Random;

public class TickedRunnable implements Runnable {

private static final int TICKET_COUNT = 20;
	
	private int saledCount;  //���۳���Ʊ��

	@Override
	public void run() {
	while(true){
			
			//�����ͬһ���������
			synchronized("��"){  //��
				
				if(saledCount<TICKET_COUNT){  //������
			
					saledCount++;  //д����
					
					try {
						Thread.sleep(new Random().nextInt(100));
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					System.out.println(Thread.currentThread().getName() + "�۳��˵�" + saledCount + "��Ʊ");
				}else{
					System.out.println(Thread.currentThread().getName() + "ȫ������");
					break;
				}
			}
			
		}

	}

}
