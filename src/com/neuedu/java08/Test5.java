package com.neuedu.java08;

import java.util.Random;
import java.util.Scanner;

//Random类---生成4位随机验证码
public class Test5 {

	//验证码范围
	public static final String VALCODE_SCOPE = "23456789abcdef验证码范围";
	//验证码长度
	public static final int VALCODE_LENGTH = 4;
	
	public static void main(String[] args) {
		
		String input = null;
		String valCode = null;
		
		do{
			//产生验证码的答案
			valCode = generateValCode();
			
			System.out.println("生成的验证码="+ valCode);
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("输入验证码，h表示换一张");
			
			input = scanner.next();
		}while("h".equals(input));
		
		if(input.equalsIgnoreCase(valCode)){
			System.out.println("输入正确");
		}else{
			System.out.println("输入错误");
		}

	}

	//产生验证码
	static String generateValCode(){
		
		//生成验证码的答案
		StringBuilder sb = new StringBuilder();
		
		Random random = new Random();
		
		for(int i=0; i<VALCODE_LENGTH ;i++){
			
			//随机的位置序号
			int position = random.nextInt(VALCODE_SCOPE.length());
			
			sb.append(VALCODE_SCOPE.charAt(position));
			
		}
				
		return sb.toString();
	}

}
