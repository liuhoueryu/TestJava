package com.neuedu.java08;

import java.io.IOException;
import java.util.Arrays;

//String���ϰ��
public class Test7 {

	//ϰ��1---���ݸ����������������ɶ�Ӧ��setter������  name-->setName
	static String getSetterName(String propertyName){
		return "set" + propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
	}
	
	//ϰ��2---�����ļ�·���������ļ���׺�б�(���ŷָ�����չ��)���жϸ��ļ������Ƿ�������ļ���׺�б���
    static boolean contains(String filename, String allowedExtensionList){
    	
    	//��ȡ��չ��
    	String extension = filename.substring(filename.lastIndexOf(".") + 1);
    	
    	return allowedExtensionList.contains(extension);
    }

    //ϰ��3---��ʮ������ת��Ϊ������ƣ��������ַ�����ʽ  //��ʮ������i��ת��Ϊx����
    static String change(int i, int x) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while(i/x!=0){
    		sb.append(i%x);   //��������
    		i/=x;  //���±�����
    	}
    	
    	return sb.append(i).reverse().toString();
    }
    
    static String change2(int i, int x) {
    	
    	StringBuilder sb = new StringBuilder();
    	
    	while(i/x!=0){
    		sb.insert(0, i%x);   //��������
    		i/=x;  //���±�����
    	}
    	
    	return sb.insert(0, i).toString();
    }
 
    //ϰ��4---ͳ��ָ���Ӵ����ַ����г��ֵĴ���
    static int getCount(String s, String sub){
    	
    	int subLen = sub.length();
    	
    	int count = 0;  //���ֵĴ���
    	for(int i=0; i<=s.length() - subLen; i++){
    		
    		String substr = s.substring(i, i + subLen);
    		
    		if(substr.equals(sub)){
    			count++;
    		}
    		
    	}
    	
    	return count;
    }
    
    static int getCount2(String s, String sub){
    	
    	int count = 0;  //���ֵĴ���
    	int index = 0;  //�Ӵ����ֵ�λ��
    	
    	while((index = s.indexOf(sub))!=-1){
    		
    		count++;
    		
    		//��С���ҵķ�Χ
    		s = s.substring(index + sub.length());
    		System.out.println(s);
    		
    	}
    	
    	return count;
    }
    
     static int getCount3(String s, String sub){
    	
    	int count = 0;  //���ֵĴ���
    	int index = 0;  //�Ӵ����ֵ�λ��
    	
    	while((index = s.indexOf(sub, index))!=-1){
    		
    		count++;
    		
    		//��С���ҵķ�Χ
    		index = index + sub.length();
    		
    		System.out.println(index);
    		
    	}
    	
    	return count;
    }
 
    //ϰ��5---�ж�һ���ַ����Ƿ��ǻ����ַ����� �� "abccba"��"abcdcba"���ǻ����ַ���  "adccba"���ǻ����ַ���
     
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
     
    //ϰ��6---���ַ����д洢���ַ���ת
    static String reverse(String s){
    	
    	StringBuilder sb = new StringBuilder(s);
    	
    	return sb.reverse().toString();
    }
    
    static String reverse2(String s){
    	
    	//ת���ַ�����
    	char[] chars = s.toCharArray();
    	
    	for (int begin = 0, end = chars.length - 1; begin < end; begin++, end--) {
			
			char temp = chars[begin];
			
			chars[begin] = chars[end];
			
			chars[end] = temp;
		}
    	
    	return new String(chars);
    	
    }
    
    //ϰ��7---���ַ���"3 7 4 5 8 2 6 1 9"�е���ֵ������������������µ��ַ���,ÿ������֮��ʹ�ÿո�ֿ�
    static String sort(String s){
    	
    	//��ֳ����� 
    	String[] strs = s.split(" ");
    	
    	//����
    	Arrays.sort(strs);
    	
    	//System.out.println(Arrays.toString(strs));
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = 0; i < strs.length; i++) {
			sb.append(strs[i] + " ");
		}
    	
    	return sb.toString().trim();
    }
    
    //ϰ��8---���дʻ��滻
    static String replace(String s, String wordList){
    	//String content = "���ǻ������Ұ����ֹ�";
		//String wordList = "����:�õ�,���ֹ�:�����";
    	
    	//��ֳ�ÿһ������
    	String[] wordItems = wordList.split(",");
    	
    	for (int i = 0; i < wordItems.length; i++) {
    		
    		String[] words = wordItems[i].split(":");
    		
    		String badWord = words[0];
    		String goodWord = words[1];
    		
    		s = s.replace(badWord, goodWord);
    		
		}
    	
    	return s;
		
    }
    
    //ϰ��9---��ȡ�����ַ����������ͬ�Ӵ�
    static String getMaxSub(String s1, String s2){
    	 
		//�ж�˭�Ǵ󴮣�˭��С��
		String max = (s1.length() > s2.length()) ? s1 : s2;
		String min = (s1.length() < s2.length()) ? s1 : s2;
 
		for (int i = 0; i < min.length(); i++) {  //С������ÿ�μ�1

			for (int start = 0, end = min.length() - i; end <= min.length(); start++, end++) {

				//��ȡ��Ӵ�
				String temp = min.substring(start, end);
				
				//������а�������Ӵ�����ֱ�ӷ���
				if(max.contains(temp)){
					return temp;
				}
			}
		}
 
		return null;
	}
    
    //ϰ��10---��д��ȡ�ַ����ķ���������Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ���
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

		//String content = "���ǻ������Ұ����ֹ�";
		//String wordList = "����:�õ�,���ֹ�:�����";
		//System.out.println(replace(content, wordList));
		
		//System.out.println(getMaxSub("abcde345", "acdf123456"));
	
		System.out.println(substringByte("��ABC", 4));
		System.out.println(substringByte("��ABC��DEF", 6));
		
		
	}

}
