package com.neuedu.java11.adapter;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		
		v.add("aaa");
		v.add("bbb");
		v.add("ccc");
		
		/*Enumeration<String> e = v.elements();
		
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}*/
		
		EnumerationIterator<String> ei = new EnumerationIterator<>(v.elements());
		
		while(ei.hasNext()){
			System.out.println(ei.next());
			
		}
	}

}
