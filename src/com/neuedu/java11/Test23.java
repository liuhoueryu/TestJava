package com.neuedu.java11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//习题8---给定一个文本文件，统计文件中不同单词的出现次数---不规则文本
public class Test23 {

	public static void main(String[] args) throws IOException {

		Map<String, Integer> mapAll = new HashMap<>();
		Map<String, Integer> mapLine = new HashMap<>();
		
		BufferedReader br = new BufferedReader(new FileReader("d:/test/article.txt"));
		
		String line = null;
		
		int lineNumber = 0;
		
		//逐行扫描
		while((line=br.readLine())!=null){
			//System.out.println(line);

			mapLine.clear();
			
			StringBuilder sb = new StringBuilder();
			
			for (int i = 0; i < line.length(); i++) {
				
				char c = line.charAt(i);
				
				if(c>='a' && c<='z' ||c>='A' && c<='Z'){   //合法字符
					sb.append(c);
				}else{
						String word = sb.toString();
						
						if(!"".equals(word)){
							
							if(!mapLine.containsKey(word)){
								mapLine.put(word, 1);
							}else{
								mapLine.put(word, mapLine.get(word) + 1);
							}
							
							if(!mapAll.containsKey(word)){
								mapAll.put(word, 1);
							}else{
								mapAll.put(word, mapAll.get(word) + 1);
							}
							
							sb = new StringBuilder();
						}
					
				}
				
			}
			
			System.out.println("第"+(++lineNumber)+"行有"+mapLine.size()+"个不同的单词");
		}
		
		//遍历mapAll
		Set<String> set = mapAll.keySet();
		for(String word : set){
			System.out.println(word + "出现" + mapAll.get(word) + "次");
		}
		
	}

}
