package com.neuedu.java08;

import com.neuedu.java07.demo3.MyRuntime;

//String StringBuffer StringBuilder
public class Test4 {

	public static void main(String[] args) throws Exception {

		//测试性能
		new MyRuntime(){
			
			protected void code() {
				
				/*
				String s = "";
				
				for (int i = 0; i < 100000; i++) {  //51402ms
					s += i;
				}
				*/
				
				/*
				StringBuffer sb = new StringBuffer();
				
				for (int i = 0; i < 100000; i++) {  //10ms
					sb.append(i);
				}
				*/
				/*
				StringBuilder sb = new StringBuilder();
				
				for (int i = 0; i < 100000; i++) {  //5ms
					sb.append(i);
				}
*/
			}
		}.execute();
		
		//StringBuffer的添加
		StringBuffer sb = new StringBuffer();
		sb.append("123").append("456");
		String s = sb.toString();
		
		//面试题
         StringBuffer sb1 = new StringBuffer("123");
	     StringBuffer sb2 = new StringBuffer("123");
	     System.out.println(sb1.equals(sb2));  //false
	     
	     StringBuilder sb3 = new StringBuilder("123");
	     StringBuilder sb4 = new StringBuilder("123");
	     System.out.println(sb3.equals(sb4));   //false
	     
	     System.out.println(sb1.equals(sb3));   //false
		
	     String s1 = "123";
	     String s2 = new String("123");
	     System.out.println(s1.equals(s2));   //true  
	     System.out.println(s1.equals(sb1)); //false
	     System.out.println(s2.equals(sb1));  //false

	     
	}

}
