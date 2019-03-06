package com.neuedu.java11;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyLog {

	public static void log(Exception e){
		
		try {
			PrintStream ps = new PrintStream(new FileOutputStream("d:/test/log_" + new SimpleDateFormat("yyyy-MM-dd").format(new Date()) + ".txt", true));
			
			//�쳣������ʱ�� + �쳣������
			ps.println("-------------------------");
			String now = new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��").format(new Date());
			ps.println(now + "�׳���" + e.getClass().getSimpleName() + "�쳣");
			ps.println("-------------------------");
			
			//��¼�쳣ջ����Ϣ
			e.printStackTrace(ps);
			
			ps.println();
			
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		try{
			int a = 10/0;
			//String s = null;
			//s.length();
			
		}catch(Exception e){
			MyLog.log(e);
			System.out.println("�쳣�Ѿ���¼�ɹ�");
		}
	}
}
