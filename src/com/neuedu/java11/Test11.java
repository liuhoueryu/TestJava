package com.neuedu.java11;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

//BufferedInputStream类
public class Test11 {

	public static void main(String[] args) throws IOException {
		test2();
	}

	//读取全部字节---一个一个字节
	static void test1() throws IOException{
		
		FileInputStream fis = new FileInputStream("d:/test/1.mp3");
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		//BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/test/1.mp3"));
		
		int data = 0;
		
		long begin = System.currentTimeMillis();
		
		while((data=fis.read())!=-1){
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");  //ms
		
		bis.close();
		
	}
	
	//读取全部字节---缓冲区字节数组
	static void test2() throws IOException{
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/test/1.mp3"));
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		long begin = System.currentTimeMillis();
		
		while((len=bis.read(buf))!=-1){
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");  //7ms
		
		bis.close();
	}
}
