package com.neuedu.java03;

//作业
public class Test6 {

	public static void main(String[] args) {
		
		//int row = 6;
		//printTable(row);
		//printTriangle(row);
		
		int n = 100;
		
		for(int i=2; i<=n; i++){
			
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}

	//将判断一个数是否是素数的代码封转成函数，并调用此函数实现找出1-n之间的所有素数
	static boolean isPrime(int n){
		
		for(int i=2;i<=n/2;i++){
			
			if(n%i==0){
				return false;  //不是素数
			}
		}
		
		return true;  //是素数
	}
	
	//定义函数printTriangle，打印指定行数的等腰三角形
    static void printTriangle(int row) {
    	
		for(int i=1; i<=row; i++){   //正立
						
			//打印空格
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}
			
			//打印*
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	//定义函数printTable，打印指定行数的乘法表
	static void printTable(int row){
		
		for(int i=1; i<=row; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			
			System.out.println();
		}
	}
	
}
