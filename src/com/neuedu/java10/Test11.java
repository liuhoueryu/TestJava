package com.neuedu.java10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap��
public class Test11 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("user1", 10);
		map.put("user2", 20);
		map.put("user3", 30);
		
		System.out.println(map);
		
		/*//��ʽ1---keySet ��ǿ��
		Set<String> set = map.keySet();
		for(String key : set){
			System.out.println("key=" + key + " value=" + map.get(key));
		}
		
		//��ʽ2---keySet  ������
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = map.get(key);
			System.out.println("key=" + key + " value=" + value);
		}
		
		
		//��ʽ3---entrySet ��ǿ��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key=" + key + " value=" + value);
		}
		
		*/
		
		//��ʽ4---entrySet  ������
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key=" + key + " value=" + value);
		}
				
	}

}
