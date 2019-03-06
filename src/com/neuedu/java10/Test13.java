package com.neuedu.java10;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//ϰ��5---�����ַ��������ݣ�ͳ�Ʋ�ͬ���ʵĳ��ִ����������ճ��ִ�����������

public class Test13 {

	public static void main(String[] args) {
		
		String s = "I love Beijing I love China Beijing is the capital of China";
		
		Map<String, Integer> map = new TreeMap<>();
		
		String[] words = s.split(" ");
		
		for (int i = 0; i < words.length; i++) {
			
			String word = words[i];
			
			if(!map.containsKey(word)){
				map.put(word, 1);
			}else{
				map.put(word,  map.get(word) + 1);
			}
			
		}
		
		System.out.println(map);
	
		Set<WordItem> set = new TreeSet<>(new WordItemComparator());
		
		Set<String> keySet = map.keySet();
		for (String key : keySet) {
			
			WordItem wordItem = new WordItem(key, map.get(key));
			
			set.add(wordItem);
			
		}
		
		System.out.println(set);
	}

}
