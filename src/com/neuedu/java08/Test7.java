package com.neuedu.java08;

import java.io.IOException;
import java.util.Arrays;

//String类的习题
public class Test7 {

	//习题1---根据给定的属性名，生成对应的setter方法名  name-->setName
	static String getSetterName(String propertyName){
		return "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
	}
	
	//习题2---输入文件路径和允许文件后缀列表(逗号分隔的扩展名)，判断该文件类型是否存在于文件后缀列表中
    static boolean contains(String filename, String allowedExtensionList){
    	
    	//获取扩展名
    	String extension = filename.substring(filename.lastIndexOf(".") + 1);
    	
    	return allowedExtensionList.contains(extension);
    }

    //习题3---将十进制数转换为任意进制，返回其字符串形式  //将十进制数i，转换为x进制
    static String change(int i, int x) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while(i/x!=0){
    		sb.append(i%x);   //保存余数
    		i/=x;  //更新被除数
    	}
    	
    	return sb.append(i).reverse().toString();
    }
    
    static String change2(int i, int x) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while(i/x!=0){
    		sb.insert(0, i%x);   //保存余数
    		i/=x;  //更新被除数
    	}
    	
    	return sb.insert(0, i).toString();
    }
 
    //习题4---统计指定子串在字符串中出现的次数
    static int getCount(String s, String sub){
    	
    	int subLen = sub.length();
    	
    	int count = 0;  //出现的次数
    	for(int i=0; i<=s.length() - subLen; i++){
    		
    		String substr = s.substring(i, i + subLen);
    		
    		if(substr.equals(sub)){
    			count++;
    		}
    		
    	}
    	
    	return count;
    }
    
    static int getCount2(String s, String sub){
    	
    	int count = 0;  //出现的次数
    	int index = 0;  //子串出现的位置
    	
    	while((index = s.indexOf(sub))!=-1){
    		
    		count++;
    		
    		//缩小查找的范围
    		s = s.substring(index + sub.length());
    		System.out.println(s);
    		
    	}
    	
    	return count;
    }
    
     static int getCount3(String s, String sub){
    	
    	int count = 0;  //出现的次数
    	int index = 0;  //子串出现的位置
    	
    	while((index = s.indexOf(sub, index))!=-1){
    		
    		count++;
    		
    		//缩小查找的范围
    		index = index + sub.length();
    		
    		System.out.println(index);
    		
    	}
    	
    	return count;
    }
 
    //习题5---判断一个字符串是否是回文字符串。 如 "abccba"，"abcdcba"都是回文字符串  "adccba"不是回文字符串
     
    static boolean isHuiwen(String s){
    	
    	/*
    	boolean huiwenFlag = true;
    	
    	for (int i = 0; i < s.length() / 2; i++) {
			
    		if(s.charAt(i)!=s.charAt(s.length()-1-i)){
    			huiwenFlag = false;
    			break;
    		}
    		
		}
    	
    	return huiwenFlag;
    	*/

    	
    	for (int i = 0; i < s.length() / 2; i++) {
			
    		if(s.charAt(i)!=s.charAt(s.length()-1-i)){
	    		return false;
    		}
    		
		}
    	
    	return true;
    	
    }
     
    //习题6---将字符串中存储的字符反转
    static String reverse(String s){
    	
    	StringBuilder sb = new StringBuilder(s);
    	
    	return sb.reverse().toString();
    }
    
    static String reverse2(String s){
    	
    	//转换字符数组
    	char[] chars = s.toCharArray();
    	
    	for (int begin = 0, end = chars.length - 1; begin < end; begin++, end--) {
			
			char temp = chars[begin];
			
			chars[begin] = chars[end];
			
			chars[end] = temp;
		}
    	
    	return new String(chars);
    	
    }
    
    //习题7---将字符串"3 7 4 5 8 2 6 1 9"中的数值进行升序排序后生成新的字符串,每个数据之间使用空格分开
    static String sort(String s){
    	
    	//拆分成数组 
    	String[] strs = s.split(" ");
    	
    	//排序
    	Arrays.sort(strs);
    	
    	//System.out.println(Arrays.toString(strs));
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < strs.length; i++) {
			sb.append(strs[i] + " ");
		}
    	
    	return sb.toString().trim();
    }
    
    //习题8---敏感词汇替换
    static String replace(String s, String wordList){
    	//String content = "我是坏蛋，我爱法轮功";
		//String wordList = "坏蛋:好蛋,法轮功:健身操";
    	
    	//拆分成每一个词条
    	String[] wordItems = wordList.split(",");
    	
    	for (int i = 0; i < wordItems.length; i++) {
    		
    		String[] words = wordItems[i].split(":");
    		
    		String badWord = words[0];
    		String goodWord = words[1];
    		
    		s = s.replace(badWord, goodWord);
    		
		}
    	
    	return s;
		
    }
    
    //习题9---获取两个字符串的最大相同子串
    static String getMaxSub(String s1, String s2){
    	 
		//判断谁是大串，谁是小串
		String max = (s1.length() > s2.length()) ? s1 : s2;
		String min = (s1.length() < s2.length()) ? s1 : s2;
 
		for (int i = 0; i < min.length(); i++) {  //小串长度每次减1

			for (int start = 0, end = min.length() - i; end <= min.length(); start++, end++) {

				//截取最长子串
				String temp = min.substring(start, end);
				
				//如果大串中包含了最长子串，则直接返回
				if(max.contains(temp)){
					return temp;
				}
			}
		}
 
		return null;
	}
    
    //习题10---编写截取字符串的方法，输入为一个字符串和字节数，输出为按字节截取的字符串
	static String substringByte(String s, int bytes) throws IOException {  
		
		int i = 1; 
		
		while(i <= s.length() && s.substring(0, i).getBytes("GBK").length <= bytes){
			i++;  
		}
		
		return s.substring(0, i - 1);
    }  

	public static void main(String[] args) throws Exception {

		//String propertyName = "name";
		//System.out.println(getSetterName(propertyName));
		
		//String filename = "d:/image/ph.oto/1.bmp";
		//String allowedExtensionList = "jpg,gif,png";
		//System.out.println(contains(filename, allowedExtensionList));
		
		//System.out.println(change2(13, 2));
		
		//String s = "123abc45abc67abcabc890abc";
		//String sub = "abc";
		//System.out.println("count=" + getCount3(s, sub));
		
		//String s = "abcfba";
		//System.out.println(isHuiwen(s));
		
		//String s = "1234567";
		//System.out.println(reverse2(s));
		
		//String s = "3 7 4 5 8 2 6 1 9";
		//System.out.println(sort(s));

		//String content = "我是坏蛋，我爱法轮功";
		//String wordList = "坏蛋:好蛋,法轮功:健身操";
		//System.out.println(replace(content, wordList));
		
		//System.out.println(getMaxSub("abcde345", "acdf123456"));
	
		System.out.println(substringByte("我ABC", 4));
		System.out.println(substringByte("我ABC好DEF", 6));
		
		
	}

}
