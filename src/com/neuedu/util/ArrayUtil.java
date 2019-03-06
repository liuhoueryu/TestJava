package com.neuedu.util;

public class ArrayUtil {
	
	//返回数组中的最大元素
	public static int getMax(int[] arr){
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		return max;
	}
		
	//返回数组的字符串表示形式
	/*
	public static String toString(int[] arr){
		
		if(arr==null){
			return null;
		}
		
		String s = "[";
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i<arr.length - 1){
				s += arr[i] + ",";
			}else{
				s += arr[i];
			}
			
		}
		
		s += "]";
		
		return s;
		
	}
	*/
	
	public static String toString(int[] arr){
		
		if(arr==null){
			return null;
		}
		
		StringBuilder sb = new StringBuilder("[");
		
		for (int i = 0; i < arr.length; i++) {
			
			if(i<arr.length - 1){
				sb.append(arr[i] + ",");
			}else{
				sb.append(arr[i]);
			}
			
		}
		
		sb.append("]");
		
		return sb.toString();
		
	}
	
	//数组元素反转
	public static void reverse(int[] arr){
		
		/*for (int i = 0; i < arr.length / 2; i++) {
			
			int temp = arr[i];
			
			arr[i] = arr[arr.length-i-1];
			
			arr[arr.length-i-1] = temp;
		}*/
		
		for (int begin = 0, end = arr.length - 1; begin < end; begin++, end--) {
			
			int temp = arr[begin];
			
			arr[begin] = arr[end];
			
			arr[end] = temp;
		}
	}
	

}
