package com.neuedu.java11;

import java.io.File;

//ϰ��3---��ʾָ���ļ����е�ȫ������   void show(File dir)
public class Test04 {

	public static void main(String[] args) {
		
		File root = new File("e:/apache-tomcat-7.0.55");
		
		System.out.println(root.getName());
		
		show(root, 1);
		
	}

	static void show(File dir, int level){
		
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			//����
			for (int j = 0; j < level * 3; j++) {
				System.out.print(" ");
			}
			
			if(files[i].isDirectory()){   //��Ŀ¼�������ݹ����
				System.out.println("[" + files[i].getName() + "]");
				show(files[i], level+1);
			}else{
				System.out.println(files[i].getName());
			}
		}
		
	}
}
