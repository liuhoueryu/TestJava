package com.neuedu.java12.redpacket;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		//��������� 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������� =");
		
		int amount = sc.nextInt();
		
		RedPacket rp = new RedPacket(amount);
		
		System.out.print("�������� =");
		
		int count = sc.nextInt();
		
		for (int i = 1; i <= count; i++) {
			new UserThread("user" + i, rp).start();
		}
		
	}

}
