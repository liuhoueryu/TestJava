package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

//ArrayList��
public class Test01 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("user1");
		list.add("user2");
		list.add("user3");
		list.add("user4");
		
/*		//��ʽ1
		System.out.println(list.toString());
		
		//��ʽ2
		Object[] objs = list.toArray();
		for (int i = 0; i < objs.length; i++) {
			System.out.println(objs[i]);
		}
		
		//��ʽ3  get()����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//��ʽ4  ��ǿ��
		for(String s : list){
			System.out.println(s);
		}
		
		//��ʽ5 ������
		
		Iterator<String> it = list.iterator();  //��ȡ������
		
		while(it.hasNext()){
			
			System.out.println(it.next());
			
			//list.remove("user3");  //�׳�ConcurrentModificationException
			it.remove();   //ͨ��������ɾ��  ���һ��Ԫ��
		}
		
		System.out.println(list.size());
		*/
		
		//��ʽ6  �б������
		
		ListIterator<String> it = list.listIterator();

		while(it.hasNext()){
			System.out.println(it.next());
			it.add("user5");    //ͨ����������ӵ���ǰλ����Ԫ��
		}
		
		System.out.println("------");
		while(it.hasPrevious()){
			System.out.println(it.previous());
		}
	}

}
