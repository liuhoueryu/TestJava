package com.neuedu.java12.schedule;

import java.util.Scanner;
import java.util.Timer;

//�̵߳Ķ�ʱ����
public class Test {

	public static void main(String[] args) {
		test4();
	}
	
	//��д
	static void test1(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ʼ��ʾ��ǰʱ�䣬���س���������ʾ");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ShowTimeThread t = new ShowTimeThread();
		t.start();
		
		//���հ���
		sc.nextLine();
		
		//��ֹ�߳�
		t.stopThread();
		
		
	}
	
	//TimerTask + Timer
	static void test2(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�����ʼ��ʾ��ǰʱ�䣬���س���������ʾ");
		
		Timer timer = new Timer();
		
		ShowTimeTask task = new ShowTimeTask();
		
		timer.schedule(task, 3000, 1000);
		
		//���հ���
		sc.nextLine();
		
		//��ֹ��ʱ��
		timer.cancel();
	}
	
	//ϰ��1---ģ���ֻ�������齱---�ֱ�ʹ�ô�ͳ�̷߳�ʽ��Timer+TimerTask���ַ�ʽʵ��
	static void test3(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���س�����ʼ��ʾ���ٴΰ��س���������ʾ");
		
		//���հ���
		sc.nextLine();
		
		ShowMobileThread t = new ShowMobileThread();
		t.start();
		
		//���հ���
		sc.nextLine();
		
		//��ֹ�߳�
		t.stopThread();
		
		System.out.println("���ս��=" + t.getMobile());
		
	}
	
	//TimerTask + Timer
	static void test4(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���س�����ʼ��ʾ���ٴΰ��س���������ʾ");
		
		//���հ���
		sc.nextLine();
		
		Timer timer = new Timer();
		
		ShowMobileTask task = new ShowMobileTask();
		
		timer.schedule(task, 0, 100);
		
		//���հ���
		sc.nextLine();
		
		//��ֹ��ʱ��
		timer.cancel();
	}
}
