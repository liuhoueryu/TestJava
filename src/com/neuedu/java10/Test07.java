package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;

//有序对象的排序---手写
public class Test07 {

	public static void main(String[] args) {
		
		List<User> list = new ArrayList<>();
		list.add(new User("user2", 40));
		list.add(new User("user211", 20));
		list.add(new User("user2", 30));

		sort(list);
		
		System.out.println(list);
	}
	
	static void sort(List<User> list){
	
		for (int i = 0; i < list.size() - 1; i++) {
			
			for (int j = 0; j < list.size()  - 1 - i; j++) {
				
				User user1 = list.get(j);
				User user2 = list.get(j+1);
				
				if(user1.compareTo(user2)==1){   
					
					list.set(j, user2);
					list.set(j+1, user1);
				}
			}
			
			
		}
	}

}
