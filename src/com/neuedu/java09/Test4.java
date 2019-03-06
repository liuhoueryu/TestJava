package com.neuedu.java09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//异常的处理方式1---try + catch---捕获并处理---非运行时异常
public class Test4 {

	public static void main(String[] args) {

		String filename = "e:/1.txt";
		
		readFile(filename);
		
		System.out.println("程序结束");
	}

	static void readFile(String filename) {
		
		try {
			FileReader fr = new FileReader(filename);
			
			int data = fr.read();
			
			System.out.println("data=" + data);
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("文件IO出错");
		}
		
		System.out.println("readFile方法结束");
	}
}
