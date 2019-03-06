package com.neuedu.java10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.TreeMap;

//习题6---图书包含书名，价格和出版日期属性，选用合适的数据结构实现存储图书和图书的ISBN的映射关系，并按照图书的价格升序排序，如果价格相同，再按出版日期降序排序
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
