package com.neuedu.java10;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//ϰ��4---�����ַ��������ݣ�ͳ�Ƴ��ִ���������ĸ������ִ��� 
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
				System.out.println("��ĸ" + c + "������" + maxCount + "��");
			}
		}
	}

}
