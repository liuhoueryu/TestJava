package com.neuedu.java09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//异常的处理方式2---使用throws声明抛出---非运行时异常
public class Test5 {

	public static void main(String[] args) {
		
		String filename = "e:/1.txt";
		
		try {
			readFile(filename);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("文件不存在");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("文件IO出错");
		}
		
		System.out.println("程序结束");
	}

	static void readFile(String filename) throws FileNotFoundException, IOException {
		
		FileReader fr = new FileReader(filename);
			
		int data = fr.read();
		
		if(true){
			throw new IOException();
		}
		
		System.out.println("data=" + data);
		
		System.out.println("readFile方法结束");
	}
}
