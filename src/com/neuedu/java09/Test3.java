package com.neuedu.java09;

//�쳣�Ĵ���ʽ2---ʹ��throws�����׳�---����ʱ�쳣
public class Test3 {

	public static void main(String[] args) {

		div(10, 0, new int[10]);
		
		System.out.println("�������");
	}

	static void div(int a, int b, int[] arr) throws ArithmeticException, NullPointerException{
		
		if(b!=0){
			int result = a / b;
		
			System.out.println("result=" + result);
		}else{
			
			//�׳�һ��ArithmeticException�쳣
			
			throw new ArithmeticException();
			
		}
		
		if(arr!=null){
			System.out.println("length=" + arr.length);
		}else{
			throw new NullPointerException();
		}
		
		System.out.println(arr[10]);
		
		System.out.println("div��������");
	}
}
