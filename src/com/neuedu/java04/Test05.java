package com.neuedu.java04;

//���ָı������ָ��͸ı����ݵ�����
public class Test05 {

	public static void main(String[] args) {
		
		int[] arr = {1,2};
		
		change(arr);
		
		System.out.println(arr[0]);
	}
	
	static void change(int[] arr){
		
		//arr[0] = 10;      //�ı����������
		
		arr = new int[10];  //�ı������ָ��
	}

}
