package com.neuedu.java11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//文件字符流---FileReader和FileWriter
public class Test18 {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("d:/test/1.txt");
		FileWriter fw = new FileWriter("d:/test/2.txt");
		
		char[] buf = new char[1024];
		
		int len = 0;
		while((len=fr.read(buf))!=-1){
			fw.write(buf,0,len);
		}
		
		fr.close();
		fw.close();
	}
	
	
}
