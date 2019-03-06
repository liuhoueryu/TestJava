package com.neuedu.java12.cake2;

import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Cake> cakeList = new LinkedList<>();
		
		new CookerThread(cakeList).start();
		new CustomerThread(cakeList).start();
 	}

}
