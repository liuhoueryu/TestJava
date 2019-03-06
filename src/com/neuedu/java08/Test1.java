package com.neuedu.java08;

//Object类
public class Test1 {

	public static void main(String[] args) {

		/*
		User user1 = new User("user1", 10);
		User user2 = new User("user1", 10);
		//System.out.println(user1==user2);  //false
		System.out.println(user1.equals(user2));   //true
		System.out.println(user1.hashCode());
		System.out.println(user2.hashCode());
		*/
		
		/*String s1 = new String("abc");
		String s2 = new String("abcde");
		System.out.println(s1==s2);  //false
		System.out.println(s1.equals(s2));  //false
		 */
		
	    /*
	    Object obj = new Object();
		System.out.println(obj);
		System.out.println(Integer.toHexString(obj.hashCode()));
		*/
		
		/*	
	    //获取类或对的Class实例的三种方式
		//方式1---类名.class
		Class clazz = User.class;
		//方式2---对象名.getClass()
		clazz = user1.getClass();
		//方式3---Class.forName("完整类名")
		clazz = Class.forName("com.neuedu.java08.User");*/
		
		
		/*for (int i = 0; i < 1000; i++) {
			User user = new User("user"+i, i);
			user = null;
		}
		
		//建议GC工作
		System.gc();*/
		
		/*User user1 = new User("user1", 10);
		try {
			User user2 = (User) user1.clone();
			System.out.println(user2);
		} catch (CloneNotSupportedException e) {   //未实现Cloneable接口，抛出CloneNotSupportedException
			e.printStackTrace();
		}*/
		
		Address address = new Address("天津市", "和平区");
		
		User user1 = new User("user1", 10, address);
		
		System.out.println(user1);
		
		try {
			User user2 = (User) user1.clone();
			System.out.println(user2);
		} catch (CloneNotSupportedException e) {   //未实现Cloneable接口，抛出CloneNotSupportedException
			e.printStackTrace();
		}
		
	}

}
