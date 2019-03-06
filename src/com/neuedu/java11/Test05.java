package com.neuedu.java11;

import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream类
public class Test05 {

	public static void main(String[] args) throws IOException {
		test3();
	}

	//读取单个字节
	static void test1() throws IOException{
		
		FileInputStream fis = new FileInputStream("d:/test/1.jpg");
		
		int data = fis.read();
		
		System.out.println(data);
		System.out.println((char)data);

		fis.close();
	}
	
	//读取全部字节---一个一个字节
	static void test2() throws IOException{
		
		FileInputStream fis = new FileInputStream("d:/test/1.jpg");
		
		int data = 0;
		
		long begin = System.currentTimeMillis();
		
		while((data=fis.read())!=-1){
			//System.out.println((char)data);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");  //45222ms
		
		fis.close();
	}
	
	//读取全部字节---缓冲区字节数组
	static void test3() throws IOException{
		
		FileInputStream fis = new FileInputStream("d:/test/1.mp3");  
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		long begin = System.currentTimeMillis();
		
		while((len=fis.read(buf))!=-1){
			//System.out.println(new String(buf,0,len));
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");  //29ms
		
		fis.close();
	}
}
