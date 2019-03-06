package com.neuedu.java10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TreeMap;

//ϰ��6---ͼ������������۸�ͳ����������ԣ�ѡ�ú��ʵ����ݽṹʵ�ִ洢ͼ���ͼ���ISBN��ӳ���ϵ��������ͼ��ļ۸�������������۸���ͬ���ٰ��������ڽ�������
public class Test14 {

	public static void main(String[] args) throws ParseException {

		Map<Book, String> map = new TreeMap<>();
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			
		Book book1 = new Book("book1",  10, df.parse("2018-12-25"));
		Book book2 = new Book("book2",  30, df.parse("2019-02-14"));
		Book book3 = new Book("book3",  30, df.parse("2017-06-01"));
		
		map.put(book1, "ISBN1");
		map.put(book2, "ISBN2");
		map.put(book3, "ISBN3");
		
		System.out.println(map);
		
	}

}
