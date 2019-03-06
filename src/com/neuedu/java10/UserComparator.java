package com.neuedu.java10;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		//return user1.getAge() - user2.getAge();
		return user1.getName().compareTo(user2.getName());
	}

}
