package com.neuedu.java04;

//����Ķ����ʹ��
public class Test01 {

	public static void main(String[] args) {

		//����
		//int[] arr;  
		
		//�����ʽ1---����ѿռ�,û�г�ʼ������
		//int[] arr = new int[10];   //����
		
		//�����ʽ2---����ѿռ�,ͬʱ��ʼ������
		//int[] arr = new int[]{1,2,3};
		int[] arr = {1,2,3};    //����ʽ  ����
		
		//System.out.println(arr);  //  [I@1db9742
		//System.out.println(arr[0]);  //  �±�0��length-1
		//System.out.println(arr[arr.length-1]);
		
		/*//����ı�����ʽ1---��ͳ
		for (int i = 0; i < arr.length; i++) {
			System.out.println("��"+(i+1)+"��Ԫ��=" + arr[i]);
		}
		
		//����ı�����ʽ2---��ǿ��
		int index = 0;
		for(int element : arr){
			System.out.println("��"+(index+1)+"��Ԫ��=" + element);
			index++;
		}*/
		
		//System.out.println(arr[4]);   //����һ�������ڵ�Ԫ�أ��׳�ArrayIndexOutOfBoundsException�쳣
		
		//arr = null;   
		//System.out.println(arr.length);  //��null���󣬵��÷��������׳�NullPointerException�쳣
		
	}

}
