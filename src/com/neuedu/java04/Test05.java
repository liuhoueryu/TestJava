package com.neuedu.java04;

//区分改变数组的指向和改变数据的内容
public class Test05 {

	public static void main(String[] args) {
		
		int[] arr = {1,2};
		
		change(arr);
		
		System.out.println(arr[0]);
	}
	
	static void change(int[] arr){
		
		//arr[0] = 10;      //改变数组的内容
		
		arr = new int[10];  //改变数组的指向
	}

}
