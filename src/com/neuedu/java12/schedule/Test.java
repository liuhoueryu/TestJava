package com.neuedu.java12.schedule;

import java.util.Scanner;
import java.util.Timer;

//线程的定时调度
public class Test {

	public static void main(String[] args) {
		test4();
	}
	
	//手写
	static void test1(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("三秒后开始显示当前时间，按回车键结束显示");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		ShowTimeThread t = new ShowTimeThread();
		t.start();
		
		//接收按键
		sc.nextLine();
		
		//终止线程
		t.stopThread();
		
		
	}
	
	//TimerTask + Timer
	static void test2(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("三秒后开始显示当前时间，按回车键结束显示");
		
		Timer timer = new Timer();
		
		ShowTimeTask task = new ShowTimeTask();
		
		timer.schedule(task, 3000, 1000);
		
		//接收按键
		sc.nextLine();
		
		//终止定时器
		timer.cancel();
	}
	
	//习题1---模拟手机号随机抽奖---分别使用传统线程方式和Timer+TimerTask两种方式实现
	static void test3(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("按回车键开始显示，再次按回车键结束显示");
		
		//接收按键
		sc.nextLine();
		
		ShowMobileThread t = new ShowMobileThread();
		t.start();
		
		//接收按键
		sc.nextLine();
		
		//终止线程
		t.stopThread();
		
		System.out.println("最终结果=" + t.getMobile());
		
	}
	
	//TimerTask + Timer
	static void test4(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("按回车键开始显示，再次按回车键结束显示");
		
		//接收按键
		sc.nextLine();
		
		Timer timer = new Timer();
		
		ShowMobileTask task = new ShowMobileTask();
		
		timer.schedule(task, 0, 100);
		
		//接收按键
		sc.nextLine();
		
		//终止定时器
		timer.cancel();
	}
}
