package com.neuedu.java11.decoration2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class LineNumberBracketBufferedReader extends BufferedReader {

	private int lineNumber;
	
	public LineNumberBracketBufferedReader(BufferedReader br) {
		super(br);
	}
	
	@Override
	public String readLine() throws IOException {
		
		String line = super.readLine();
		
		if(line==null){
			return null;
		}
		
		return "[" + (++lineNumber) + " " + line + "]";
	}

}
