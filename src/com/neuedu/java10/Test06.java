package com.neuedu.java10;

import java.util.HashSet;
import java.util.Set;

//HashSetÀà
public class Test06 {

	public static void main(String[] args) {
		
	/*	Set<String> set = new HashSet<>();
		
		set.add("user1");
		set.add("user2");
		set.add("user3");
		set.add("user3");
		
		System.out.println(set);
		System.out.println(set.size());
*/

		Set<User> set = new HashSet<>();
		
		set.add(new User("user1", 10));
		set.add(new User("user2", 20));
		set.add(new User("user3", 30));
		//set.add(new User("user3", 30));   //ÖØ¸´ÔªËØ
		
		System.out.println(set);
		System.out.println(set.size());
		
		User user = new User("user3", 30);
		System.out.println(set.contains(user));
	}

}
