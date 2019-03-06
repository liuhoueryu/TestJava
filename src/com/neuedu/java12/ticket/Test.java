package com.neuedu.java12.ticket;

//线程的同步/互斥
public class Test {

	public static void main(String[] args) {

		/*TicketThread2 t1 = new TicketThread2("售票点A");
		TicketThread2 t2 = new TicketThread2("售票点B");
		TicketThread2 t3 = new TicketThread2("售票点C");
		
		t1.start();
		t2.start();
		t3.start();*/
		
		TickedRunnable r = new TickedRunnable();
		Thread t1 = new Thread(r, "售票点A");
		t1.start();
		
		Thread t2 = new Thread(r, "售票点B");
		t2.start();
		
		Thread t3 = new Thread(r, "售票点C");
		t3.start();
		

	}

}
