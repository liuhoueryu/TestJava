package com.neuedu.java08;

import java.util.Random;
import java.util.Scanner;

//Random��---����4λ�����֤��
public class Test5 {

	//��֤�뷶Χ
	public static final String VALCODE_SCOPE = "23456789abcdef��֤�뷶Χ";
	//��֤�볤��
	public static final int VALCODE_LENGTH = 4;
	
	public static void main(String[] args) {
		
		String input = null;
		String valCode = null;
		
		do{
			//������֤��Ĵ�
			valCode = generateValCode();
			
			System.out.println("���ɵ���֤��="+ valCode);
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("������֤�룬h��ʾ��һ��");
			
			input = scanner.next();
		}while("h".equals(input));
		
		if(input.equalsIgnoreCase(valCode)){
			System.out.println("������ȷ");
		}else{
			System.out.println("�������");
		}

	}

	//������֤��
	static String generateValCode(){
		
		//������֤��Ĵ�
		StringBuilder sb = new StringBuilder();
		
		Random random = new Random();
		
		for(int i=0; i<VALCODE_LENGTH ;i++){
			
			//�����λ�����
			int position = random.nextInt(VALCODE_SCOPE.length());
			
			sb.append(VALCODE_SCOPE.charAt(position));
			
		}
				
		return sb.toString();
	}

}
