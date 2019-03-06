package com.neuedu.java11.decoration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BracketBufferedReader extends BufferedReader {

	public BracketBufferedReader(BufferedReader br) {
		super(br);
	}
	
	@Override
	public String readLine() throws IOException {
		
		String line = super.readLine();
		
		if(line==null){
			return null;
		}
		
		return "[" + line + "]";
	}

}
