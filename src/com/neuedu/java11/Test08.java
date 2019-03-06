package com.neuedu.java11;

import java.io.File;

//习题4---删除一个非空文件夹    
public class Test08 {

	public static void main(String[] args) {
		
		File root = new File("d:/1");
		
		delete(root);
		
	}

	static void delete(File dir){
		
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			if(files[i].isDirectory()){   //是目录，继续递归调用
				delete(files[i]);
			}else{
				files[i].delete();  //删除文件
			}
		}
		
		dir.delete();   //删除当前的空目录
		
	}
}
