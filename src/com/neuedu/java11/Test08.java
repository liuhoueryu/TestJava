package com.neuedu.java11;

import java.io.File;

//ϰ��4---ɾ��һ���ǿ��ļ���    
public class Test08 {

	public static void main(String[] args) {
		
		File root = new File("d:/1");
		
		delete(root);
		
	}

	static void delete(File dir){
		
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			if(files[i].isDirectory()){   //��Ŀ¼�������ݹ����
				delete(files[i]);
			}else{
				files[i].delete();  //ɾ���ļ�
			}
		}
		
		dir.delete();   //ɾ����ǰ�Ŀ�Ŀ¼
		
	}
}
