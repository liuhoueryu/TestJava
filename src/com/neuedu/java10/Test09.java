package com.neuedu.java10;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//������������---Collections������---��������Ƚ�����ʵ��Comparator�ӿ�
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
