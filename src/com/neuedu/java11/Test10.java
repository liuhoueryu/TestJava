package com.neuedu.java11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//IO�������쳣����
public class Test10 {
	
	public static void main(String[] args) {
		test();
	}

	//��ȡȫ���ֽ�---�������ֽ�����
	static void test() {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("d:/test/1.jpg");
			fos = new FileOutputStream("d:/test/2.jpg");

			byte[] buf = new byte[1024];
			
			int len = 0;
			
			while((len=fis.read(buf))!=-1){
				fos.write(buf, 0, len);
			}
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("�ļ�δ�ҵ�");
			
			//����1---���浽��־�ļ�
			MyLog.log(e);
			
			//����2---�쳣����ת����ٴ��׳�
			throw new RuntimeException("�ļ�δ�ҵ�", e);
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("IO��������");
			
			//����1---���浽��־�ļ�
			MyLog.log(e);
			
			//����2---�쳣����ת����ٴ��׳�
			throw new RuntimeException("IO��������", e);
			
		} finally{
			
			try {
				if(fis!=null){
					fis.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			try {
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
