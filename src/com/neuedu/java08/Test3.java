package com.neuedu.java08;

//字符编码和解码
public class Test3 {

	public static void main(String[] args) throws Exception {

		//System.out.println(System.getProperty("file.encoding"));  //默认的字符集GBK
		
		String s = "东软";
		/* 编码 String-->byte[]   解码  byte[] -->String
		byte[] b1 = s.getBytes();
		System.out.println(Arrays.toString(b1));
		byte[] b2 = s.getBytes("gbk");
		System.out.println(Arrays.toString(b2));
		byte[] b3 = s.getBytes("utf-8");
		System.out.println(Arrays.toString(b3));
		byte[] b4 = s.getBytes("iso8859-1");
		System.out.println(Arrays.toString(b4));
		byte[] b5 = s.getBytes("unicode");
		System.out.println(Arrays.toString(b5)); 
		byte[] b6 = s.getBytes("utf-16");
		System.out.println(Arrays.toString(b6));*/

		byte[] b = s.getBytes("utf-8");   //提交时编码
		
		s = new String(b, "iso8859-1");  //接收时解码
		
		System.out.println(s);
		
		//解决中文问题
		s = new String(s.getBytes("iso8859-1"), "utf-8");
		
		System.out.println(s);
		
	}

}
