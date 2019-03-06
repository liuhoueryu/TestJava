package com.neuedu.java11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream类
public class Test06 {

	public static void main(String[] args) throws IOException {
		test3();
	}

	//写出单个字节
	static void test1() throws IOException{
		
		FileOutputStream fos = new FileOutputStream("d:/test/2.txt", true);  //追加
		
		fos.write(99);  //写出一个整数的低八位
		fos.write(99);
		fos.write(99);
		
		fos.write('a');  //写出一个字符
		
		fos.write("hello\r\njava".getBytes());   //将字符串转换为字节数组写出
		
		fos.close();
	}
	
	//拷贝全部字节---一个一个字节
	static void test2() throws IOException{
		
		FileInputStream fis = new FileInputStream("d:/test/1.jpg");
		FileOutputStream fos = new FileOutputStream("d:/test/2.jpg");
		
		int data = 0;
		
		long begin = System.currentTimeMillis();
		
		while((data=fis.read())!=-1){
			fos.write(data);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");  //384ms
		
		fis.close();
		fos.close();
	}
	
	//读取全部字节---缓冲区字节数组
	static void test3() throws IOException{
		
		FileInputStream fis = new FileInputStream("d:/test/1.mp3");
		FileOutputStream fos = new FileOutputStream("d:/test/2.mp3");
	
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		long begin = System.currentTimeMillis();
		
		while((len=fis.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");  //0ms
		
		fis.close();
		fos.close();
	}
}
