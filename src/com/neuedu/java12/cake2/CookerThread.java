package com.neuedu.java12.cake2;

import java.util.List;

//�������߳�
public class CookerThread extends Thread {

	private static final int MAX_CAKE_COUNT = 4;
	
	//������Դ
	private List<Cake> cakeList;

	public CookerThread(List<Cake> cakeList) {
		super();
		this.cakeList = cakeList;
	}


	@Override
	public void run() {
		
		int index = 0;   //��������
		
		while(true){
			
			synchronized (cakeList) {
				
				while(cakeList.size()==MAX_CAKE_COUNT){  //
					try {
						System.out.println("��ʱ�޷�����������");
						cakeList.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				Cake cake = new Cake();
				cake.setName("��" + (++index) + " ������");
				cakeList.add(cake);
				
				System.out.println("������" + cake.getName() + "size=" + cakeList.size());
				
				
				
				//֪ͨ������
				cakeList.notifyAll();
				
			}
		}
		
	}
}
