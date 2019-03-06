package com.neuedu.java12.cake3;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Cake> cakeList = new LinkedList<>();
		
		new CookerThread(cakeList, "师傅1").start();
		new CookerThread(cakeList, "师傅2").start();
		new CookerThread(cakeList, "师傅3").start();
		
		new CustomerThread(cakeList, "客人1").start();
		new CustomerThread(cakeList, "客人2").start();
		new CustomerThread(cakeList, "客人3").start();
		
 	}

}
