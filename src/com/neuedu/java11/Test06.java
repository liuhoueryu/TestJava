package com.neuedu.java11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//FileOutputStream��
public class Test06 {

	public static void main(String[] args) throws IOException {
		test3();
	}

	//д�������ֽ�
	static void test1() throws IOException{
		
		FileOutputStream fos = new FileOutputStream("d:/test/2.txt", true);  //׷��
		
		fos.write(99);  //д��һ�������ĵͰ�λ
		fos.write(99);
		fos.write(99);
		
		fos.write('a');  //д��һ���ַ�
		
		fos.write("hello\r\njava".getBytes());   //���ַ���ת��Ϊ�ֽ�����д��
		
		fos.close();
	}
	
	//����ȫ���ֽ�---һ��һ���ֽ�
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
	
	//��ȡȫ���ֽ�---�������ֽ�����
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
