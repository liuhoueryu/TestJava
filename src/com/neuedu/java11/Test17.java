package com.neuedu.java11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

//习题5---将一个MP3文件切割成n个文件，每个文件1M大小，再使用顺序流将这些文件合并起来
public class Test17 {

	public static void main(String[] args) throws IOException {
		//cut("d:/test/mp3");
		merge("d:/test/mp3");
	}

	//切割文件
	static void cut(String path) throws IOException{
		
		//创建目录
		File dir = new File(path);
		if(!dir.exists()){
			dir.mkdir();
		}
		
		FileInputStream fis = new FileInputStream("d:/test/1.mp3");

		byte[] buf = new byte[1024*1024];
		
		int len = 0;
		
		int index = 1;
		while((len=fis.read(buf))!=-1){
			
			FileOutputStream fos = new FileOutputStream(new File(dir, "part" + (index++) + ".mp3"));

			fos.write(buf, 0, len);
			
			fos.close();
		}
		
		fis.close();
	}
	
	//合并文件
	static void merge(String path) throws IOException{
		
		File dir = new File(path);
		
		File[] files = dir.listFiles();
		
		//创建Vector集合
		Vector<FileInputStream> v = new Vector();
		
		for (int i = 0; i < files.length; i++) {
			v.add(new FileInputStream(files[i]));
		}
		
		//获取枚举
		Enumeration<FileInputStream> e = v.elements();
		
		SequenceInputStream sis = new SequenceInputStream(e);
		
		FileOutputStream fos = new FileOutputStream("d:/test/2.mp3");
			
		byte[] buf = new byte[1024];
		
		int len = 0;
		
		while((len=sis.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		
		sis.close();
		fos.close();
		
	}
}
