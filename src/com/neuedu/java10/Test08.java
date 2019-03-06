package com.neuedu.java10;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//有序对象的排序---Collections工具类---自定义类实现Comparable接口
public class Test08 {

	public static void main(String[] args) throws ParseException {

		List<String> list = new ArrayList<>();
		list.add("user2");
		list.add("user3");
		list.add("user211");
		
		List<Date> list2 = new ArrayList<>();
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		list2.add(df.parse("2019-02-14"));
		list2.add(df.parse("2019-02-13"));
		list2.add(df.parse("2019-02-15"));
		
		List<User> list3 = new ArrayList<>();
		list3.add(new User("user3",30));
		list3.add(new User("user2",30));
		list3.add(new User("user1",10));
		
		//Collections.sort(list3);
		
		System.out.println(list3);
	}

}
