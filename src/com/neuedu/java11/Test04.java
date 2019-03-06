package com.neuedu.java11;

import java.io.File;

//习题3---显示指定文件夹中的全部内容   void show(File dir)
public class Test04 {

	public static void main(String[] args) {
		
		File root = new File("e:/apache-tomcat-7.0.55");
		
		System.out.println(root.getName());
		
		show(root, 1);
		
	}

	static void show(File dir, int level){
		
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			//缩进
			for (int j = 0; j < level * 3; j++) {
				System.out.print(" ");
			}
			
			if(files[i].isDirectory()){   //是目录，继续递归调用
				System.out.println("[" + files[i].getName() + "]");
				show(files[i], level+1);
			}else{
				System.out.println(files[i].getName());
			}
		}
		
	}
}
