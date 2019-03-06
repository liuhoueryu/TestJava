package com.neuedu.java03;

//函数的递归
public class Test5 {

	/*public static void main(String[] args) {
		f();
	}

	static void f(){
		System.out.println("f()...");
		f();   //抛出StackOverFlowError
	}*/
	
	public static void main(String[] args) {
		
		int n = 5;
		
		int result = jiecheng(n);
		
		System.out.println(result);
		
	}
	
	//5!=5*4!  4!=4*3!   3!=3*2!   2!=2*1!  1!=1
	static int jiecheng(int n){
		
		if(n==1){       //递归的终止条件
			return 1;   //递归的出口  
		}else{
			int temp =  n * jiecheng(n-1);
			return temp;
		}
		
	}
}
