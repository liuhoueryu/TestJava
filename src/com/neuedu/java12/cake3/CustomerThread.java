package com.neuedu.java12.cake3;

import java.util.List;

//�������߳�
public class CustomerThread extends Thread {

	//������Դ
	private List<Cake> cakeList;

	public CustomerThread(List<Cake> cakeList, String name) {
		super(name);
		this.cakeList = cakeList;
	}

	@Override
	public void run() {
		
		while(true){
			
			synchronized (cakeList) {
				
				while(cakeList.size()==0){  
					try {
						System.out.println(this.getName() + "��ʱ�޷����ѡ�����");
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
				
				Cake cake = cakeList.get(0);
				
				cakeList.remove(cake);
				
				System.out.println(this.getName() + "������" + cake.getName() + "size=" + cakeList.size());
				
				
				//֪ͨ������
				cakeList.notifyAll();
				
			}
		}
		
	}
}
