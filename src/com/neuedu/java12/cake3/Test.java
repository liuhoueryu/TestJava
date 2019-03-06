package com.neuedu.java12.cake3;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Cake> cakeList = new LinkedList<>();
		
		new CookerThread(cakeList, "ʦ��1").start();
		new CookerThread(cakeList, "ʦ��2").start();
		new CookerThread(cakeList, "ʦ��3").start();
		
		new CustomerThread(cakeList, "����1").start();
		new CustomerThread(cakeList, "����2").start();
		new CustomerThread(cakeList, "����3").start();
		
 	}

}
