package com.neuedu.java08;

//�ַ�����ͽ���
public class Test3 {

	public static void main(String[] args) throws Exception {

		//System.out.println(System.getProperty("file.encoding"));  //Ĭ�ϵ��ַ���GBK
		
		String s = "����";
		/* ���� String-->byte[]   ����  byte[] -->String
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

		byte[] b = s.getBytes("utf-8");   //�ύʱ����
		
		s = new String(b, "iso8859-1");  //����ʱ����
		
		System.out.println(s);
		
		//�����������
		s = new String(s.getBytes("iso8859-1"), "utf-8");
		
		System.out.println(s);
		
	}

}
