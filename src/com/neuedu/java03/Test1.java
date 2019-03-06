package com.neuedu.java03;

//函数的基本格式
public class Test1 {

	public static void main(String[] args) {
		//print();
		//print("function");
		//print("function","method");
		
		/*String s = print2();
		System.out.println("hello, " + s);
		*/
		//System.out.println("hello, " + print2());
		System.out.println(print2("function"));
		
	}

	static void print(){
		System.out.println("hello, function");	
		System.out.println("hello, method");
	}
	
	static void print(String s){
		System.out.println("hello, " + s);
	}
	
	static void print(String s1, String s2){
		System.out.println("hello, " + s1);
		System.out.println("hello, " + s2);
	}
	
	static String print2(){
		return "function";
	}
	
	static String print2(String s){
		return "hello, " + s;
	}
}
