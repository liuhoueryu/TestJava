package com.neuedu.java11.decoration3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BracketBufferedReader extends BufferedReader {

	private BufferedReader br;   //���
	
	public BracketBufferedReader(BufferedReader br) {
		super(br);
		this.br = br;   //ע��
	}
	
	@Override
	public String readLine() throws IOException {
		
		String line = br.readLine();   //ί��
		
		if(line==null){
			return null;
		}
		
		return "[" + line + "]";
	}

}
