package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;

//ϰ��1---ɾ���ַ��������е��ظ�Ԫ�أ������¼��ϣ������˲�����װ�ɺ���List<String> clearRepeat(List<String> list)
public class Test02 {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("user1");
		list.add("user2");
		list.add("user3");
		list.add("user1");
		list.add("user1");
		list.add("user2");
		
		List<String> newList = clearRepeat(list);
		
		System.out.println(newList);
	}
	
	static List<String> clearRepeat(List<String> list){
		
		List<String> newList = new ArrayList<>();
		
		/*for (int i = 0; i < list.size(); i++) {
			
			String s = list.get(i);
			
			if(!newList.contains(s)){
				newList.add(s);
			}
		}*/
		
		for(String s : list){
			
			if(!newList.contains(s)){
				newList.add(s);
			}
		}
		
		return newList;
	}

}
