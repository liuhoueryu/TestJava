package com.neuedu.java11;

import java.io.File;

//File类---过滤文件列表---FilenameFilter
//习题1---显示指定目录下所有指定后缀的文件名  
public class Test03 {

	public static void main(String[] args) {
		show("e:/apache-tomcat-7.0.55/bin", "bat");
	}
	
	static void show(String path, String suffix){
		
		File dir = new File(path);
		
		//获取全部的文件列表
		File[] files = dir.listFiles(new MyFilenameFilter(suffix));
		
		for(File file : files){
			
			String filename = file.getName();
			
			System.out.println(filename);
		}
		
	}

}
