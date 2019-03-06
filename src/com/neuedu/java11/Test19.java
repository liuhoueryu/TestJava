package com.neuedu.java11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//»º³å×Ö·ûÁ÷---BufferedReaderºÍBufferedWriter
public class Test19 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("d:/test/1.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:/test/2.txt"));
		
		String data = null;
		
		while((data=br.readLine())!=null){
			System.out.println(data);
			bw.write(data);
			bw.newLine();  //»»ÐÐ
		}
		
		br.close();
		bw.close();
	}
	
	
}
