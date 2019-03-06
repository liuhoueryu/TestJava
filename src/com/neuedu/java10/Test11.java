package com.neuedu.java10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap类
public class Test11 {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("user1", 10);
		map.put("user2", 20);
		map.put("user3", 30);
		
		System.out.println(map);
		
		/*//方式1---keySet 增强型
		Set<String> set = map.keySet();
		for(String key : set){
			System.out.println("key=" + key + " value=" + map.get(key));
		}
		
		//方式2---keySet  迭代器
		Set<String> set = map.keySet();
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			String key = it.next();
			Integer value = map.get(key);
			System.out.println("key=" + key + " value=" + value);
		}
		
		
		//方式3---entrySet 增强型
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet){
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key=" + key + " value=" + value);
		}
		
		*/
		
		//方式4---entrySet  迭代器
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
