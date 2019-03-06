package com.neuedu.java09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//�Զ����쳣
public class Test9 {

	public static void main(String[] args) {
		
		try {
			readFile("e:/1.txt");
			
		} catch (MyFileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("��װ���쳣��Ϣ=" + e.getMessage());
			System.out.println("ԭʼ���쳣��Ϣ=" + e.getCause().getMessage());
					
		}

	}
	
	static void readFile(String filename) throws MyFileNotFoundException {
		
		/*File file = new File(filename);
		
		if(!file.exists()){
			throw new MyFileNotFoundException("�ļ�������");
		}*/
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(filename);
			
			int data = fr.read();
			
			System.out.println("data=" + data);
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("�ļ�������");
			
			//�쳣ת��
			throw new MyFileNotFoundException("�ļ�������", e);
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println("�ļ�IO����");
			
		} finally{
			
			try {
				if(fr!=null){
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			System.out.println("readFile��������");
		}
	}

}
