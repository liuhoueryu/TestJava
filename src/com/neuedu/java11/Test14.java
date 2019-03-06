package com.neuedu.java11;

import java.io.IOException;
import java.io.PrintStream;

//PrintStream
public class Test14 {

	public static void main(String[] args) throws IOException {

		PrintStream ps = new PrintStream("d:/test/4.txt");
		ps.println(10);
		ps.println(3.14f);
		ps.println("东软");
		
		//输出重定向
		System.setOut(ps);
		
		System.out.println("hello");
		
		ps.close();
	}

	

}
