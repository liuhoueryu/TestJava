package com.neuedu.java09;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//finally�ؼ���---�����Ƿ��׳��쳣�����ն���Ҫִ�еĴ����
public class Test7 {

	public static void main(String[] args) {

		//div(10, 0);
		
		readFile("e:/2.txt");
		
	}

	static void div(int a, int b){
		
		try{
			
			/*if(b==0){
				//return;   //returnǰҲ��ִ��finally������
				System.out.println("����Ϊ����----");  
				System.exit(0);  //�����˳�ʱ������ִ��finally������   Ψһ������
			}*/
			
			int result = a / b;
			
			System.out.println("result=" + result);
			
		}catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println("����Ϊ����");
		}finally{
			System.out.println("div��������");
		}
	}
	
	static void readFile(String filename) {
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(filename);
			
			int data = fr.read();
			
			System.out.println("data=" + data);
			
			fr.close();
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			System.out.println("�ļ�������");
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
