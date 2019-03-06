package com.neuedu.java01;

import java.util.Scanner;

//作业
public class Test5 {

	public static void main(String[] args) {

		//习题1---交换两个整数a，b的值，不允许使用临时变量
		
		/*
		int a=3, b=5; 
		System.out.println("a=" + a + " b=" + b);	
		
		// 方式1---使用临时变量
		int temp=a;
		a=b;
		b=temp;
		
		/* 方式2---加减操作
		a = a + b;   //a=8
		b = a - b;   //b=3
		a = a - b;   //a=5
		*/
		
		/* 方式3---异或操作
		a = a^b;  //a=3^5
		b = a^b;   //b =3^5^5=3
		a = a^b;   //b =3^5^3=5
		System.out.println("a=" + a + " b=" + b);
		*/	
		
		/*习题2
		int a=-67, b=116, c=78;

		int d = ~a | b & c;

		System.out.println("d=" + d);		  //70

		*/	
		
		/*
		//习题3---将一个二进制数整体取反 int a = 0b00101101;  和1做异或操作
		int a = 0b00101101;
		int b = 0b11111111;
		System.out.println(Integer.toBinaryString(a^b));	
		*/
		
		/*	
	    //习题4---截取一个二进制数中间的3-6位 int a = 0b11101101; 
		int a = 0b11101101; 
		int b = 0b00111100; 
		int c = a&b;
		c = c>>2;
		System.out.println(Integer.toBinaryString(c));  */ 
		
	    /*	
	    //习题6---键盘输入年份year，判断该年是否是闰年  年份能被400整除，或能被4整除且不能被100整除
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入年份=");
		int year = sc.nextInt();
		
		if(year%400==0  || year%4==0 && year%100!=0){
			System.out.println(year + "是闰年");
		}else{
			System.out.println(year + "不是闰年");
		}
		
		sc.close();
		*/
		
	    /*	
	    //习题7---键盘输入成绩score，根据分数输出对应的等级   90-100  A等级    80-89  B等级    70-79  C等级   60-69  D等级    <60 E等级
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入成绩=");
		int score = sc.nextInt();
		
		//System.out.println(score>=90 ? "A" : score>=80 ? "B" : score>=70 ? "C" : score>=60 ? "D" : "E");
		
		char result = ' ';
		if(score>90){
			result = 'A';
		}else if(score>80){
			result = 'B';
		}else if(score>70){
			result = 'C';
		}else if(score>60){
			result = 'D';
		}else{
			result = 'E';
		}
		
		System.out.println(result);
		
		sc.close();
		*/
		
		/*
		//习题8---投递简历后，工作年限超过3年(含)，则电话通知来公司面试，并做一份笔试题，如果90分以上直接给offer，60-90分的进入实习期，不及格者不录取，不满三年的电话通知不录取
		//工作年限变量名为workAge   笔试成绩变量名为score

		Scanner sc = new Scanner(System.in);
		System.out.println("投递简历");
		
		System.out.print("输入工作年限=");
		int workAge = sc.nextInt();
		if(workAge>=3){
			System.out.println("电话通知来公司面试");
			
			System.out.print("输入笔试成绩=");
			int score = sc.nextInt();
			if(score>90){
				System.out.print("直接给offer");
			}else if(score>=60){
				System.out.print("进入实习期");
			}else{
				System.out.print("不录取");
			}
		}else{
			System.out.println("电话通知不录取");
		}
		
		sc.close();
		*/
		
		/*
		//习题9---键盘输入两个整数和一个操作符，根据操作符做相应的四则运算
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("操作数a=");
		int a = sc.nextInt();
		
		System.out.print("操作数b=");
		int b = sc.nextInt();
		
		System.out.print("操作符op=");
		String op = sc.next();

		switch(op){
		
			case "+":
				System.out.print(a + op + b + "=" + (a + b));
				break;
			case "-":
				System.out.print(a + op + b + "=" + (a - b));
				break;
			case "*":
				System.out.print(a + op + b + "=" + (a * b));
				break;
			case "/":
				if(b!=0){
					System.out.print(a + op + b + "=" + (a / b));
				}else{
					System.out.print("除数b不能为零");
				}
				break;
			default:
				System.out.print("非法的操作符");
		}
		
		sc.close();
		*/
		
		//习题10---键盘输入月份month，根据月份输出所属季节   345 春天   678 夏天    9 10 11 秋天    12 1 2 冬天
		Scanner sc = new Scanner(System.in);
		
		System.out.print("月份=");
		int month = sc.nextInt();

		switch(month){
		
			case 3:
			case 4:
			case 5:
				System.out.print("春天");
				break;
			
			case 6:
			case 7:
			case 8:
				System.out.print("夏天");
				break;
				
			case 9:
			case 10:
			case 11:
				System.out.print("秋天");
				break;
				
			case 12:
			case 1:
			case 2:
				System.out.print("冬天");
				break;
			default:
				System.out.print("非法月份");
		}
		
		sc.close();
	}
}
