package com.neuedu.java10;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//有序对象的排序---Collections工具类---单独定义比较器类实现Comparator接口
public class Test09 {

	public static void main(String[] args) throws ParseException {

		List<User> list = new ArrayList<>();
		list.add(new User("user3",10));
		list.add(new User("user2",20));
		list.add(new User("user1",30));
		
		Collections.sort(list, new UserComparator());
		
		System.out.println(list);
	}

}
