package com.neuedu.java09;

//�쳣�Ĵ���ʽ1---try + catch---���񲢴���---����ʱ�쳣
public class Test2 {

	public static void main(String[] args) {
		
		try{
			div(10, 2, new int[10]);
		}catch(IndexOutOfBoundsException e){
			//e.printStackTrace();
			System.out.println("����Խ����");
		}

		System.out.println("�������");
	}

	static void div(int a, int b, int[] arr){
		
		try{
			int result = a / b;
			
			System.out.println("result=" + result);
			
			System.out.println("length=" + arr.length);
			
			System.out.println(arr[10]);
			
			System.out.println("xxxx");
		}catch(ArithmeticException e){
			//e.printStackTrace();
			System.out.println("����Ϊ����");
		}catch(NullPointerException e){
			//e.printStackTrace();
			System.out.println("��ָ����");
		}/*catch(Exception e){
			e.printStackTrace();
			//System.out.println("�쳣��Ϣ=" + e.toString());
			System.out.println("��ҽ���ˣ����ΰٲ�");
		}*/
		
		System.out.println("div��������");
	}
}
