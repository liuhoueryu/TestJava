package com.neuedu.java03;

//函数的重载和嵌套调用
public class Test2 {

	public static void main(String[] args) {

		//System.out.println("max=" + max(3,5));
		int number = max(3,5,2);
		System.out.println("max=" + number);
		
	}

	static int max(int a, int b, int c){
		
		int temp = max(a, b);
		
		return max(temp, c);
		
	}
	
	static int max(int a, int b){
		
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	
	/*static int max(int a, int b, int c){
		
		int temp = 0;
		if(a>b){
			temp = a;
		}else{
			temp =  b;
		}
		
		if(temp>c){
			return temp;
		}else{
			return c;
		}
		
	}*/
	

	 
}
