package com.neuedu.java11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//ϰ��5---����һ���ǿ��ļ���  �ȸ�����ɾ��
public class Test09 {

	public static void main(String[] args) throws IOException {
		
		File source = new File("d:/1");
		File dest = new File("e:/1");
		
		if(!dest.exists()){
			dest.mkdir();
		}
		
		copy(source, dest);
		
		delete(source);
	}

	static void copy(File source, File dest) throws IOException{
		
		File[] files = source.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			if(files[i].isDirectory()){   //��Ŀ¼�������ݹ����
				
				//��dest�´�����Ŀ¼
				File dir = new File(dest, files[i].getName());
				dir.mkdir();
				
				copy(files[i], dir);
			}else{
				 
				//�����ļ�������
				
				FileInputStream fis = new FileInputStream(files[i]);
				FileOutputStream fos = new FileOutputStream(new File(dest, files[i].getName()));
			
				byte[] buf = new byte[1024];
				
				int len = 0;
				
				while((len=fis.read(buf))!=-1){
					fos.write(buf, 0, len);
				}
				
				fis.close();
				fos.close();
			}
		}
		
	}
	
	static void delete(File dir){
		
		File[] files = dir.listFiles();
		
		for (int i = 0; i < files.length; i++) {
			
			if(files[i].isDirectory()){   //��Ŀ¼�������ݹ����
				delete(files[i]);
			}else{
				files[i].delete();  //ɾ���ļ�
			}
		}
		
		dir.delete();   //ɾ����ǰ�Ŀ�Ŀ¼
		
	}
}
