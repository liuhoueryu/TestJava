package com.neuedu.java08;

import java.util.Arrays;

//System类
public class Test10 {

	public static void main(String[] args) {

		//数组拷贝
		int[] source = {1,2,3,4,5,6,7,8,9};
		
		int[] dest = new int[5];
		
		System.arraycopy(source, 3, dest, 1, 3);
		
		System.out.println(Arrays.toString(dest)); 
		
		//System.exit(0);
		
		//获取环境变量
		System.out.println("JAVA_HOME=" + System.getenv("JAVA_HOME"));
		System.out.println("path=" + System.getenv("path"));
		
		//获取全部系统属性 
		System.getProperties().list(System.out);
	}

}
