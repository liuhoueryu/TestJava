package com.neuedu.java08;

import java.util.Arrays;
import java.util.Random;

//Random类---生成大乐透体育彩票
public class Test6 {

	public static void main(String[] args) {
		
		System.out.println("前区 =" + generateLottery(35, 5));
		System.out.println("后区 =" + generateLottery(12, 2));
		
	}
	
	static String generateLottery(int max, int count){
		
		Random random = new Random();
		
		int[] result = new int[count];
		
		//选出count个1到max间的不重复随机数
		for (int i = 0; i < count; i++) {
			
			while(true){
				
				int number = random.nextInt(max) + 1;
				
				//判断是否出重复
				boolean existFlag = false;
				
				for (int j = 0; j < i; j++) {
					if(result[j]==number){  //重复
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
		
		
		//排序
		Arrays.sort(result);
		
		//System.out.println(Arrays.toString(result));
		
		//int[]转换为String
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < result.length; i++) {
			
			sb.append(result[i] + " ");
			
		}
		
		return sb.toString().trim();
	}
}
