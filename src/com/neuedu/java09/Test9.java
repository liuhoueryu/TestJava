package com.neuedu.java09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//自定义异常
public class Test9 {

	public static void main(String[] args) {
		
		try {
			readFile("e:/1.txt");
			
		} catch (MyFileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("包装的异常信息=" + e.getMessage());
			System.out.println("原始的异常信息=" + e.getCause().getMessage());
					
		}

	}
	
	static void readFile(String filename) throws MyFileNotFoundException {
		
		/*File file = new File(filename);
		
		if(!file.exists()){
			throw new MyFileNotFoundException("文件不存在");
		}*/
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(filename);
			
			int data = fr.read();
			
			System.out.println("data=" + data);
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("文件不存在");
			
			//异常转译
			throw new MyFileNotFoundException("文件不存在", e);
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("文件IO出错");
			
		} finally{
			
			try {
				if(fr!=null){
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("readFile方法结束");
		}
	}

}
