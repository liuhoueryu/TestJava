package com.neuedu.java11;

import java.io.File;

//File��---�����ļ��б�---��д
//ϰ��1---��ʾָ��Ŀ¼������ָ����׺���ļ���  
public class Test02 {

	public static void main(String[] args) {
		show("e:/apache-tomcat-7.0.55/bin", "bat");
	}
	
	static void show(String path, String suffix){
		
		File dir = new File(path);
		
		//��ȡȫ�����ļ��б�
		File[] files = dir.listFiles();
		
		for(File file : files){
			
			String filename = file.getName();
			
			if(file.isFile() && filename.endsWith(suffix)){
				System.out.println(filename);
			}
		}
		
	}

}
