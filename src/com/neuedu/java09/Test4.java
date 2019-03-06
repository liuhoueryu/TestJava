package com.neuedu.java09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//�쳣�Ĵ���ʽ1---try + catch---���񲢴���---������ʱ�쳣
public class Test4 {

	public static void main(String[] args) {

		String filename = "e:/1.txt";
		
		readFile(filename);
		
		System.out.println("�������");
	}

	static void readFile(String filename) {
		
		try {
			FileReader fr = new FileReader(filename);
			
			int data = fr.read();
			
			System.out.println("data=" + data);
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("�ļ�������");
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("�ļ�IO����");
		}
		
		System.out.println("readFile��������");
	}
}
