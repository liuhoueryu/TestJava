package com.neuedu.java08;

//String��
public class Test2 {

	public static void main(String[] args) {

	/*	String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1==s2);    
		System.out.println(s1.equals(s2));  
		
		String s3 = new String("hello");
		String s4 = new String("hello");
		System.out.println(s3==s4);   
		System.out.println(s3.equals(s4));  
		
		String s5 = "hello";
		String s6 = new String("hello");
		System.out.println(s5==s6);   
		System.out.println(s5.equals(s6)); 
		
		String s7 = "hello";
		String s8 = "he" + "llo";
		System.out.println(s7==s8);    

		String s9 = "hello";
		String s10 = "he" + new String("llo");  
		System.out.println(s9==s10);   */

	  /*  String  s1  = "abc";
	    String  s2  = "abc";
	    String  s3  = "abc" + "def";  
	    String  s4  = "abcdef";
	    String  s5  = s1 + "def";

	    System.out.println(s1 == s2);  
	    System.out.println(s3 == s4);  
	    System.out.println(s4 == s5);  
	    System.out.println(s4.equals(s5));  */
		
		//�ַ����Ƚ�����ʱ���ַ����������д��ǰ�棬���Ա������NullPointerException
		String username = "neuedu";
		
		if("neuedu".equals(username)){
			System.out.println("��¼�ɹ�");
		}else{
			System.out.println("��¼ʧ��");
		}
		

	}

}
