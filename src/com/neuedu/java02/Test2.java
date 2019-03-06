package com.neuedu.java02;

import java.util.Random;
import java.util.Scanner;

//猜数字 
public class Test2 {

	public static void main(String[] args) {
		
		/* 使用Rando类产生随机数
		Random random = new Random();
		
		//1-10
		System.out.println(random.nextInt(10) + 1);
		
		//29-67
		System.out.println(random.nextInt(67 - 29 + 1) + 29);

		int m = 29;
		int n = 67;
		
		System.out.println(random.nextInt(n - m + 1) + m);
		*/
		
		//是否退出的标志变量
		boolean exitFlag = false;
		while(!exitFlag){   //没退出游戏
			
			//产生答案
			Random random = new Random();
			int answer = random.nextInt(10) + 1;
			
			//是否猜中的标志变量
			boolean guessFlag = false;
			
			Scanner sc = new Scanner(System.in);
			
			//剩余次数
			int restCount = 3;
			
			while(!guessFlag && restCount>0){   //没猜中而且还有剩余的机会
				
				System.out.print("您还有" + restCount + "次机会，输入要猜的数字=");
				int guess = sc.nextInt();
				
				if(guess> answer){
					System.out.println("猜大了");
					restCount--;
				}else if(guess < answer){
					System.out.println("猜小了");
					restCount--;
				}else{
					guessFlag = true;
				}
			}
			
			if(!guessFlag){
				System.out.println("很遗憾，三次都没猜中，本次的答案是" + answer);
			}else{
				System.out.println("恭喜，猜中了");
			}
			
			//询问用户是否继续下一轮
			System.out.print("是否继续下一轮(1:继续  0:退出)");
			int response = sc.nextInt();
			if(response==0){
				System.out.print("886");
				exitFlag = true;
				//break;
			}
			
		}
		
	}

}
