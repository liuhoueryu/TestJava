package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;

//ϰ��1---ɾ��User�����е��ظ�Ԫ�أ������¼��ϣ������˲�����װ�ɺ���
public class Test03 {

	public static void main(String[] args) {

		List<User> list = new ArrayList<>();
		list.add(new User("user1", 10));
		list.add(new User("user2", 20));
		list.add(new User("user3", 30));
		list.add(new User("user1", 10));
		list.add(new User("user1", 10));
		list.add(new User("user2", 20));
		
		List<User> newList = clearRepeat(list);
		
		System.out.println(newList);
	}
	
	static List<User> clearRepeat(List<User> list){
		
		List<User> newList = new ArrayList<>();
		
		for(User user : list){
			
			if(!newList.contains(user)){
				newList.add(user);
			}
		}
		
		return newList;
	}

}
