package com.neuedu.java10;

import java.util.Set;
import java.util.TreeSet;

//TreeSetÀà---SetµÄÅÅĞò
public class Test10 {

	public static void main(String[] args) {
		
		Set<String> set = new TreeSet<>();
		
		set.add("user2");
		set.add("user3");
		set.add("user1");
		set.add("user3");
		
		//System.out.println(set);
		//System.out.println(set.size());
		
		Set<User> set2 = new TreeSet<>(new UserComparator());
		
		set2.add(new User("user2",60));
		set2.add(new User("user3",40));
		set2.add(new User("user1",20));
		set2.add(new User("user1",10));
		System.out.println(set2);
		System.out.println(set2.size());
	}

}
