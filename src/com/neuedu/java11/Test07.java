package com.neuedu.java11;

import java.io.File;

//ϰ��2---��ʾָ��Ŀ¼�����г��ȳ���10k���ļ���   void show(String path, long length)
public class Test07 {

	public static void main(String[] args) {
		show("e:/apache-tomcat-7.0.55/bin", 1024*10);
	}
	
	static void show(String path, long length){
		
		/*File dir = new File(path);
		
		//��ȡȫ�����ļ��б�
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
