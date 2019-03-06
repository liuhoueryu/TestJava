package com.neuedu.java09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//finally关键字---无论是否抛出异常，最终都需要执行的代码块
public class Test7 {

	public static void main(String[] args) {

		//div(10, 0);
		
		readFile("e:/2.txt");
		
	}

	static void div(int a, int b){
		
		try{
			
			/*if(b==0){
				//return;   //return前也会执行finally块的语句
				System.out.println("除数为零了----");  
				System.exit(0);  //程序退出时，不会执行finally块的语句   唯一的例外
			}*/
			
			int result = a / b;
			
			System.out.println("result=" + result);
			
		}catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println("除数为零了");
		}finally{
			System.out.println("div方法结束");
		}
	}
	
	static void readFile(String filename) {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(filename);
			
			int data = fr.read();
			
			System.out.println("data=" + data);
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("文件不存在");
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
