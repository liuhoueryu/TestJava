package com.neuedu.java11;

import java.io.File;
import java.io.IOException;

//File¿‡
public class Test01 {

	public static void main(String[] args) throws IOException {
		
		/*
		File file = new File("d:/test/1.jpg");
		
		System.out.println(file.getName());
		System.out.println(file.length());
		
		//System.out.println(file.exists());
		
		//file.createNewFile();
		
		File dir = new File("d:/1/2/3");
		if(!dir.exists()){
			dir.mkdirs();
		}*/
		
		
		/*File dir = new File("e:/apache-tomcat-7.0.55");
		
		String[] filenames = dir.list();
		
		for(String filename : filenames){
			System.out.println(filename);
		}*/
		
		File dir = new File("e:/apache-tomcat-7.0.55");
		
		File[] files = dir.listFiles();
		
		for(File file : files){
			System.out.println(file.length());
		}
		
	}

}
