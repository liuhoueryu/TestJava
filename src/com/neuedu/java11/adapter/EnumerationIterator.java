package com.neuedu.java11.adapter;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator<E> implements Iterator<E> {

	private Enumeration<E> e;   //���
	
	public EnumerationIterator(Enumeration e){  
		this.e = e;  //ע��
	}
	
	@Override
	public boolean hasNext() {
		return e.hasMoreElements();  //ί��
	}

	@Override
	public E next() {
		return e.nextElement();  //ί��
	}

}
