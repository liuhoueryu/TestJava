package com.neuedu.java11.decoration3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class LineNumberBufferedReader extends BufferedReader {

	private BufferedReader br;   //组合
	
	private int lineNumber;
	
	public LineNumberBufferedReader(BufferedReader br) {
		super(br);
		this.br = br;   //注入
	}
	
	@Override
	public String readLine() throws IOException {
		
		String line = br.readLine();  //委托
		
		if(line==null){
			return null;
		}
		
		return (++lineNumber) + " " + line;
	}

}
