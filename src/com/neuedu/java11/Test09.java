package com.neuedu.java11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//习题5---剪切一个非空文件夹  先复制再删除
public class Test09 {

	public static void main(String[] args) throws IOException {
		
		File source = new File("d:/1");
		File dest = new File("e:/1");
		
		if(!dest.exists()){
			dest.mkdir();
		}
		
		copy(source, dest);
		
		delete(source);
	}

	static void copy(File source, File dest) throws IOException{
		
		File[] files = source.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			if(files[i].isDirectory()){   //是目录，继续递归调用
				
				//在dest下创建子目录
				File dir = new File(dest, files[i].getName());
				dir.mkdir();
				
				copy(files[i], dir);
			}else{
				 
				//复制文件的内容
				
				FileInputStream fis = new FileInputStream(files[i]);
				FileOutputStream fos = new FileOutputStream(new File(dest, files[i].getName()));
			
				byte[] buf = new byte[1024];
				
				int len = 0;
				
				while((len=fis.read(buf))!=-1){
					fos.write(buf, 0, len);
				}
				
				fis.close();
				fos.close();
			}
		}
		
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
