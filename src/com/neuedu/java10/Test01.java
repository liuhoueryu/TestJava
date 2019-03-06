package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ArrayList类
public class Test01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("user1");
		list.add("user2");
		list.add("user3");
		list.add("user4");
		
/*		//方式1
		System.out.println(list.toString());
		
		//方式2
		Object[] objs = list.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		
		//方式3  get()方法
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//方式4  增强型
		for(String s : list){
			System.out.println(s);
		}
		
		//方式5 迭代器
		
		Iterator<String> it = list.iterator();  //获取迭代器
		
		while(it.hasNext()){
			
			System.out.println(it.next());
			
			//list.remove("user3");  //抛出ConcurrentModificationException
			it.remove();   //通过迭代器删除  最后一个元素
		}
		
		System.out.println(list.size());
		*/
		
		//方式6  列表迭代器
		
		ListIterator<String> it = list.listIterator();

		while(it.hasNext()){
			System.out.println(it.next());
			it.add("user5");    //通过迭代器添加到当前位置上元素
		}
		
		System.out.println("------");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}

}
