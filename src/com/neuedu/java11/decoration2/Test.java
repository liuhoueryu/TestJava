package com.neuedu.java11.decoration2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		//SemiBufferedReader sbr = new SemiBufferedReader(new BufferedReader(new FileReader("d:/test/1.txt")));
		//BracketBufferedReader sbr = new BracketBufferedReader(new BufferedReader(new FileReader("d:/test/1.txt")));
		//LineNumberBufferedReader sbr = new LineNumberBufferedReader(new BufferedReader(new FileReader("d:/test/1.txt")));
		LineNumberBracketBufferedReader sbr = new LineNumberBracketBufferedReader(new BufferedReader(new FileReader("d:/test/1.txt")));
		
		String line = null;
		
		while((line = sbr.readLine())!=null){
			System.out.println(line);
		}

	}

}
