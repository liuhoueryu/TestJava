package com.neuedu.java04;

import java.util.Arrays;

//数组工具类
public class Test07 {

	public static void main(String[] args) {
		
		int[] arr = {3,6,2,8,5};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("position=" + Arrays.binarySearch(arr, 6));
	}

}
