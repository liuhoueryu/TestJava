package com.neuedu.java11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//BufferedOutputStream类
public class Test12 {

	public static void main(String[] args) throws IOException {
		test2();
	}

	//写出一个字节
	static void test1() throws IOException{
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/test/2.txt"));
		
		bos.write(97);
		
		bos.close();
		
	}
	
	//拷贝全部字节---缓冲流  + 缓冲区 字节数组
	static void test2() throws IOException{
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("d:/test/1.mp3"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("d:/test/2.mp3"));
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		long begin = System.currentTimeMillis();
		
		while((len=bis.read(buf))!=-1){
			bos.write(buf, 0, len);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("time=" + (end-begin) + "ms");  //7ms
		
		bis.close();
		bos.close();
	}
}
