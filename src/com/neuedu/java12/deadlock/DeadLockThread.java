package com.neuedu.java12.deadlock;

public class DeadLockThread extends Thread {

	public DeadLockThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		if("����".equals(this.getName())){
			
			synchronized ("���֤") {
				
				System.out.println(this.getName() + "�����֤�ˣ�����Ҫ���п�");
				
				synchronized ("���п�") {
					
					System.out.println(this.getName() + "�����п��ˣ�����ȡǮ��");
				}
				
			}
		}else{
			synchronized ("���п�") {
				
				System.out.println(this.getName() + "�����п��ˣ�����Ҫ���֤");
				
				synchronized ("���֤") {
					
					System.out.println(this.getName() + "�����֤�ˣ�����ȡǮ��");
				}
				
			}
		}
	}
	
}
