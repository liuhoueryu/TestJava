package com.neuedu.java08;

import com.neuedu.util.StringUtil;

//Runtime��
public class Test11 {

	public static void main(String[] args) {

		//��ȡRuntime���ʵ��
		Runtime rt = Runtime.getRuntime();
		
	/*	try {
			
			//��������
			Process p = rt.exec("c:/windows/notepad.exe");
			
			//�ӳ�������
			Thread.sleep(3000);
			
			//ֹͣ����
			p.destroy();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		//JVM���ڴ�
		System.out.println("����ڴ�=" + StringUtil.convertFilesize(rt.maxMemory()));
	    System.out.println("���ڴ�=" + StringUtil.convertFilesize(rt.totalMemory()));
		System.out.println("�����ڴ�=" + StringUtil.convertFilesize(rt.freeMemory()));
		
		
	}

}
