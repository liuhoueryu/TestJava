package com.neuedu.java12.cake1;

//�������߳�
public class CookerThread extends Thread {

	private Cake cake;
	
	public CookerThread(Cake cake) {
		super();
		this.cake = cake;
	}

	@Override
	public void run() {
		
		int index = 0;   //��������
		
		while(true){
			
			synchronized (cake) {
				
				if(cake.isFlag()){  //�Ѵ���
					try {
						System.out.println("��ʱ�޷�����������");
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
				
				cake.setName("��" + (++index) + " ������");
				
				System.out.println("������" + cake.getName());
				
				cake.setFlag(true);
				
				//֪ͨ������
				cake.notifyAll();
			
			}
		}
		
	}
}
