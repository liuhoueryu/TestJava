package com.neuedu.java09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//�쳣�Ĵ���ʽ2---ʹ��throws�����׳�---������ʱ�쳣
public class Test5 {

	public static void main(String[] args) {
		
		String filename = "e:/1.txt";
		
		try {
			readFile(filename);
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("�ļ�IO����");
		}
		
		System.out.println("�������");
	}

	static void readFile(String filename) throws FileNotFoundException, IOException {
		
		FileReader fr = new FileReader(filename);
			
		int data = fr.read();
		
		if(true){
			throw new IOException();
		}
		
		System.out.println("data=" + data);
		
		System.out.println("readFile��������");
	}
}
