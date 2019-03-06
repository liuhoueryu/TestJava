package com.neuedu.java08;

import java.util.Arrays;

//模拟实现String类的常用方法
public class MyString {

	//判断是否为空字符串
	static boolean isEmpty(String s) {
		return s.length()==0;
	}
	
	//判断s中是否包含子串sub
	static boolean contains(String s, String sub){
		return s.indexOf(sub)!=-1;
	}
	
	//将s转换为打印的字符数组
	static char[] toCharArray(String s){
		
		char[] chars = new char[s.length()];
		
		for (int i = 0; i < chars.length; i++) {
			chars[i] = s.charAt(i);
		}
		
		return chars;
		
	}
	
	//判断s是否以prefix开头
	static boolean startsWith(String s, String prefix){
		return s.substring(0, prefix.length()).equals(prefix);
	}
	
	//判断s是否以suffix开头
	static boolean endsWith(String s, String suffix){
		return s.substring(s.length() - suffix.length()).equals(suffix);
	}
	
	//去掉s两边的空格
	static String trim(String s){
		
		int begin = 0;  //记录从左边开始第一个非空格的字符的位置
		int end = s.length() - 1;  //记录从右边开始第一个非空格的字符的位置
		
		while(begin<end && s.charAt(begin)==' '){
			begin++;
		}
		
		while(begin<end && s.charAt(end)==' '){
			end--;
		}
		
		return s.substring(begin, end + 1);
		
	}
	
	//返回子串sub在s中第一次出现的位置，如果没找到返回-1
	static int indexOf(String s, String sub){
		
		int subLen = sub.length();
		
		int index = 0;
		
		while(index <= s.length() - subLen){
			
			//截取从index开始的subLen个字符
			String substr = s.substring(index, index + subLen);
			
			if(substr.equals(sub)){
				return index;
			}
			
			index++;
		}
		
		return -1;
		
	}
	
	//返回子串sub在s中最后一次出现的位置，如果没找到返回-1
	static int lastIndexOf(String s, String sub){
		
		int subLen = sub.length();
		
		int index = s.length() - subLen;
		
		while(index >= 0){
			
			//截取从index开始的subLen个字符
			String substr = s.substring(index, index + subLen);
			
			if(substr.equals(sub)){
				return index;
			}
			
			index--;
		}
		
		return -1;
		
	}
	
	//截取s中从beginIndex开始到endIndex结束的子串
	static String substring(String s, int beginIndex, int endIndex){
		
		char[] chars = s.toCharArray();
	
		return new String(chars, beginIndex, endIndex - beginIndex);
	}
	
	static String substring2(String s, int beginIndex, int endIndex){
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = beginIndex; i < endIndex; i++) {
			sb.append(s.charAt(i));
		}
	
		return sb.toString();
	}

	//替换s中所有出现source子串的替换成dest子串
	static String replace(String s, String source, String dest){
		
		int index = 0;
		
		while((index=s.indexOf(source))!=-1){
			
			//取出source左边的内容 + dest + 取出source右边的内容
			s = s.substring(0, index) + dest + s.substring(index + source.length());
			
		}
		
		return s;
	}
	
	//将s切分成字符串数组，分隔符是regex  123:456:78:9
	static String[] split(String s, String regex){
		
		//统计regex子串的出现次数
		int index = 0;
		int count = 0;
		while((index=s.indexOf(regex, index))!=-1){
			count++;
			index = index+regex.length();
		}
		
		//创建数组，长度为分隔符的个数+1
		String[] result = new String[count+1];
		
		//填充数组
		index = 0; //查找到的regex子串的位置
		int i= 0;  //数组的下标
		while((index=s.indexOf(regex))!=-1){

			//截取出regex前面的子串
			String sub = s.substring(0, index);
			
			//将子串填入数组
			result[i++] = sub;
			
			//缩短主串
			s = s.substring(index+regex.length());
			
		}
		
		//System.out.println(s);
		
		result[i] = s;   //将最后剩余的部分填入数组的最后一个元素
		
		return result;
	}
	
	public static void main(String[] args) {
		
		/*
		String s = "";
		s =new String();
		s=null;
		System.out.println(s);
		
		int[] arr = new int[0];
		int[] arr2 = {};
		arr=null;
		System.out.println(arr.length);
		*/
		
		//System.out.println(isEmpty(""));
		
		//System.out.println(contains("abcd","123"));
		
		//System.out.println(Arrays.toString(toCharArray("abcd")));
		
		//System.out.println(startsWith("abcd","ab"));
		//System.out.println(endsWith("abcd","bcd"));
		
		//System.out.println(trim("    ab  cd  "));
		
		//System.out.println(indexOf("abcde", "ed"));
		//System.out.println(lastIndexOf("abcde", "abc"));
		
		//System.out.println(substring2("abcde", 2, 4));
		
		//System.out.println(replace("123ab123cd123123efg123", "123", "456"));
		
		System.out.println(Arrays.toString(split("123ab456ab78ab90", "ab")));
	}

}
