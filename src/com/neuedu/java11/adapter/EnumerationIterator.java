package com.neuedu.java11.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E> {

	private Enumeration<E> e;   //组合
	
	public EnumerationIterator(Enumeration e){  
		this.e = e;  //注入
	}
	
	@Override
	public boolean hasNext() {
		return e.hasMoreElements();  //委托
	}

	@Override
	public E next() {
		return e.nextElement();  //委托
	}

}
