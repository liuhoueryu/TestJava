package com.neuedu.java08;

import java.util.Arrays;
import java.util.Random;

//Random��---���ɴ���͸������Ʊ
public class Test6 {

	public static void main(String[] args) {
		
		System.out.println("ǰ�� =" + generateLottery(35, 5));
		System.out.println("���� =" + generateLottery(12, 2));
		
	}
	
	static String generateLottery(int max, int count){
		
		Random random = new Random();
		
		int[] result = new int[count];
		
		//ѡ��count��1��max��Ĳ��ظ������
		for (int i = 0; i < count; i++) {
			
			while(true){
				
				int number = random.nextInt(max) + 1;
				
				//�ж��Ƿ���ظ�
				boolean existFlag = false;
				
				for (int j = 0; j < i; j++) {
					if(result[j]==number){  //�ظ�
						existFlag = true;
						break;
					}
				}
				
				if(!existFlag){
					result[i] = number;
					break;
				}
			}
		}
		
		
		//����
		Arrays.sort(result);
		
		//System.out.println(Arrays.toString(result));
		
		//int[]ת��ΪString
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < result.length; i++) {
			
			sb.append(result[i] + " ");
			
		}
		
		return sb.toString().trim();
	}
}
