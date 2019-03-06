package com.neuedu.java12.cake1;

//�������߳�
public class CustomerThread extends Thread {

	private Cake cake;
	
	public CustomerThread(Cake cake) {
		super();
		this.cake = cake;
	}

	@Override
	public void run() {
		
		while(true){
			
			synchronized (cake) {
				
				if(!cake.isFlag()){  //������
					try {
						System.out.println("��ʱ�޷����ѡ�����");
						cake.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println("������" + cake.getName());
				
				cake.setFlag(false);
				
				//֪ͨ������
				cake.notifyAll();
				
			}
		}
		
	}
}
