package com.neuedu.java12.ticket;

//�̵߳�ͬ��/����
public class Test {

	public static void main(String[] args) {

		/*TicketThread2 t1 = new TicketThread2("��Ʊ��A");
		TicketThread2 t2 = new TicketThread2("��Ʊ��B");
		TicketThread2 t3 = new TicketThread2("��Ʊ��C");
		
		t1.start();
		t2.start();
		t3.start();*/
		
		TickedRunnable r = new TickedRunnable();
		Thread t1 = new Thread(r, "��Ʊ��A");
		t1.start();
		
		Thread t2 = new Thread(r, "��Ʊ��B");
		t2.start();
		
		Thread t3 = new Thread(r, "��Ʊ��C");
		t3.start();
		

	}

}
