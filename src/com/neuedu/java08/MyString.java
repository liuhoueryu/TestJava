package com.neuedu.java08;

import java.util.Arrays;

//ģ��ʵ��String��ĳ��÷���
public class MyString {

	//�ж��Ƿ�Ϊ���ַ���
	static boolean isEmpty(String s) {
		return s.length()==0;
	}
	
	//�ж�s���Ƿ�����Ӵ�sub
	static boolean contains(String s, String sub){
		return s.indexOf(sub)!=-1;
	}
	
	//��sת��Ϊ��ӡ���ַ�����
	static char[] toCharArray(String s){
		
		char[] chars = new char[s.length()];
		
		for (int i = 0; i < chars.length; i++) {
			chars[i] = s.charAt(i);
		}
		
		return chars;
		
	}
	
	//�ж�s�Ƿ���prefix��ͷ
	static boolean startsWith(String s, String prefix){
		return s.substring(0, prefix.length()).equals(prefix);
	}
	
	//�ж�s�Ƿ���suffix��ͷ
	static boolean endsWith(String s, String suffix){
		return s.substring(s.length() - suffix.length()).equals(suffix);
	}
	
	//ȥ��s���ߵĿո�
	static String trim(String s){
		
		int begin = 0;  //��¼����߿�ʼ��һ���ǿո���ַ���λ��
		int end = s.length() - 1;  //��¼���ұ߿�ʼ��һ���ǿո���ַ���λ��
		
		while(begin<end && s.charAt(begin)==' '){
			begin++;
		}
		
		while(begin<end && s.charAt(end)==' '){
			end--;
		}
		
		return s.substring(begin, end + 1);
		
	}
	
	//�����Ӵ�sub��s�е�һ�γ��ֵ�λ�ã����û�ҵ�����-1
	static int indexOf(String s, String sub){
		
		int subLen = sub.length();
		
		int index = 0;
		
		while(index <= s.length() - subLen){
			
			//��ȡ��index��ʼ��subLen���ַ�
			String substr = s.substring(index, index + subLen);
			
			if(substr.equals(sub)){
				return index;
			}
			
			index++;
		}
		
		return -1;
		
	}
	
	//�����Ӵ�sub��s�����һ�γ��ֵ�λ�ã����û�ҵ�����-1
	static int lastIndexOf(String s, String sub){
		
		int subLen = sub.length();
		
		int index = s.length() - subLen;
		
		while(index >= 0){
			
			//��ȡ��index��ʼ��subLen���ַ�
			String substr = s.substring(index, index + subLen);
			
			if(substr.equals(sub)){
				return index;
			}
			
			index--;
		}
		
		return -1;
		
	}
	
	//��ȡs�д�beginIndex��ʼ��endIndex�������Ӵ�
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

	//�滻s�����г���source�Ӵ����滻��dest�Ӵ�
	static String replace(String s, String source, String dest){
		
		int index = 0;
		
		while((index=s.indexOf(source))!=-1){
			
			//ȡ��source��ߵ����� + dest + ȡ��source�ұߵ�����
			s = s.substring(0, index) + dest + s.substring(index + source.length());
			
		}
		
		return s;
	}
	
	//��s�зֳ��ַ������飬�ָ�����regex  123:456:78:9
	static String[] split(String s, String regex){
		
		//ͳ��regex�Ӵ��ĳ��ִ���
		int index = 0;
		int count = 0;
		while((index=s.indexOf(regex, index))!=-1){
			count++;
			index = index+regex.length();
		}
		
		//�������飬����Ϊ�ָ����ĸ���+1
		String[] result = new String[count+1];
		
		//�������
		index = 0; //���ҵ���regex�Ӵ���λ��
		int i= 0;  //������±�
		while((index=s.indexOf(regex))!=-1){

			//��ȡ��regexǰ����Ӵ�
			String sub = s.substring(0, index);
			
			//���Ӵ���������
			result[i++] = sub;
			
			//��������
			s = s.substring(index+regex.length());
			
		}
		
		//System.out.println(s);
		
		result[i] = s;   //�����ʣ��Ĳ���������������һ��Ԫ��
		
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
