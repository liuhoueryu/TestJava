package com.neuedu.util;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class StringUtil {

	//���ݿ�������ʱ��ĸ�ʽ
	private static final String DB_PATTERN = "yyyy-MM-dd HH:mm:ss";
	
	//�ļ�����	�������ļ������ļ�����ΪyyyyMMddHHmmssSSSxxx����ʽ������xxx��100��999֮�����������ļ�����չ������
	public static String convertFilename(String filename){ 
		
	    //��ȡ��չ��
		String extension = filename.substring(filename.lastIndexOf("."));
		
		//ʵ����DateFormat����
		DateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS"); 
	
		//��ʽ����ǰʱ��
		String now = df.format(new Date());
		
		//������λ�������
		int number = new Random().nextInt(900) + 100;
		
		return now + number + extension;
		
		//����ʵ��
		//String extension = filename.substring(filename.lastIndexOf("."));
		
		//return System.currentTimeMillis() + extension;
		
	}
	
	//�����ݿ��ʽ(yyyy-MM-dd HH:mm:ss)������ʱ���ַ���(datetime)ת��Ϊָ����ʽ(pattern)���ַ���
	public static String convertDatetime(String datetime, String pattern){
		
		DateFormat source = new SimpleDateFormat(DB_PATTERN);
		DateFormat dest = new SimpleDateFormat(pattern);
		
		try {
			//String --> Date
			Date d = source.parse(datetime);
			
			//Date --> String
			return dest.format(d);
			
		} catch (ParseException e) { 
			e.printStackTrace();
			return null;
		}
		
	}
	
	//�����ļ��Ĵ�С���ֵĸ�ʽ��
	public static String convertFilesize(long size){
		
		NumberFormat nf = NumberFormat.getInstance();
		return nf.format(size / 1024);
		
		//�ַ���
		//����  ��1000
	}
	
	public static void main(String[] args) {
		
		//String filename = "123.jpg";
		//System.out.println(convertFilename(filename));
		
		//System.out.println(convertDatetime("2018-09-12 14:56:20", "yyyy��MM��dd�� HHʱmm��ss��"));
		
		System.out.println(convertFilesize(123456789) + "KB");
	}
	
}
