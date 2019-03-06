package com.neuedu.java11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//IO操作的异常处理
public class Test10 {
	
	public static void main(String[] args) {
		test();
	}

	//读取全部字节---缓冲区字节数组
	static void test() {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("d:/test/1.jpg");
			fos = new FileOutputStream("d:/test/2.jpg");

			byte[] buf = new byte[1024];
			
			int len = 0;
			
			while((len=fis.read(buf))!=-1){
				fos.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("文件未找到");
			
			//步骤1---保存到日志文件
			MyLog.log(e);
			
			//步骤2---异常经过转译后，再次抛出
			throw new RuntimeException("文件未找到", e);
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("IO操作出错");
			
			//步骤1---保存到日志文件
			MyLog.log(e);
			
			//步骤2---异常经过转译后，再次抛出
			throw new RuntimeException("IO操作出错", e);
			
		} finally{
			
			try {
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
