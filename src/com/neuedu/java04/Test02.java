package com.neuedu.java04;

//�ɱ����
public class Test02 {

	public static void main(String[] args) {

		//f(1,2,3);
		
		//int[] arr = {1,2,3};
		//f(arr);
		
		f(1,2,3,4,5);
	}
	
	//static void f(int a, int b, int c){
	//static void f(int[] arr){
	static void f(int a, int b, int... arr){
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("��"+(i+1)+"��Ԫ��=" + arr[i]);
		}		
	}

}
