package com.neuedu.java10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//习题4---给定字符串的内容，统计出现次数最多的字母及其出现次数 
public class Test12 {

	public static void main(String[] args) {
		
		String s = "abcaebdbeddb";
		
		Map<Character, Integer> map = new HashMap<>();
		
		int maxCount = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			int count = 0;
			
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else{
				count = map.get(c) + 1;
				map.put(c, count);
			}
			
			if(count > maxCount){
				maxCount = count;
			}
			
		}
		
		Set<Character> set = map.keySet();
		for(char c : set){
			if(map.get(c)==maxCount){
				System.out.println("字母" + c + "出现了" + maxCount + "次");
			}
		}
	}

}
