package com.neuedu.java11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

//转换流---InputStreamReader和OutputStreamWriter   
public class Test20 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new FileWriter("d:/test/5.txt"));
		
		String data = null;
		
		while((data=br.readLine())!=null){
			
			if(!"886".equals(data)){
				bw.write(data);
				bw.newLine();  //换行
			}else{
				break;
			}
		}
		
		br.close();
		bw.close();
	}
	
	
}
