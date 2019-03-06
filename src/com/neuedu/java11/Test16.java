package com.neuedu.java11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

//顺序流---SequenceInputStream
public class Test16 {

	public static void main(String[] args) throws IOException {
		merge3();

	}

	//手工
	static void merge1() throws IOException{
		
		FileInputStream fis1 = new FileInputStream("d:/test/1.txt");
		FileInputStream fis2 = new FileInputStream("d:/test/2.txt");
		FileOutputStream fos = new FileOutputStream("d:/test/3.txt");
		
		List<FileInputStream> list = new ArrayList<>();
		list.add(fis1);
		list.add(fis2);
		
		byte[] buf = new byte[1024];
		
		for (int i = 0; i < list.size(); i++) {
			
			FileInputStream fis = list.get(i);
			
			int len = 0;
			
			while((len=fis.read(buf))!=-1){
				fos.write(buf, 0, len);
			}
			
			fis.close();
			
		}
		
		fis1.close();
		fis2.close();
		fos.close();
		
	}
	
	//SequenceInputStream
	static void merge2() throws IOException{
		
		FileInputStream fis1 = new FileInputStream("d:/test/1.txt");
		FileInputStream fis2 = new FileInputStream("d:/test/2.txt");
		
		SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
		
		FileOutputStream fos = new FileOutputStream("d:/test/3.txt");
			
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=sis.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		
		sis.close();
		fos.close();
		
	}
	
	//SequenceInputStream
	static void merge3() throws IOException{
		
		FileInputStream fis1 = new FileInputStream("d:/test/1.txt");
		FileInputStream fis2 = new FileInputStream("d:/test/2.txt");
		FileInputStream fis3 = new FileInputStream("d:/test/3.txt");
		
		//创建Vector集合
		Vector<FileInputStream> v = new Vector();
		v.add(fis1);
		v.add(fis2);
		v.add(fis3);
		
		//获取枚举
		Enumeration<FileInputStream> e = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(e);
		
		FileOutputStream fos = new FileOutputStream("d:/test/4.txt");
			
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=sis.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		
		sis.close();
		fos.close();
		
	}
}
