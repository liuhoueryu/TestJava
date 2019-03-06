package com.neuedu.java11;

import java.io.File;

//习题2---显示指定目录下所有长度超过10k的文件名   void show(String path, long length)
public class Test07 {

	public static void main(String[] args) {
		show("e:/apache-tomcat-7.0.55/bin", 1024*10);
	}
	
	static void show(String path, long length){
		
		/*File dir = new File(path);
		
		//获取全部的文件列表
		File[] files = dir.listFiles();
		
		for(File file : files){
			
			if(file.isFile() && file.length()>length){
				System.out.println(file.getName());
			}
		}*/
		
		File dir = new File(path);
		
		File[] files = dir.listFiles(new MyFileFilter(1024*10));
		
		for(File file : files){
			
			System.out.println(file.getName());
			
		}
	}

}
