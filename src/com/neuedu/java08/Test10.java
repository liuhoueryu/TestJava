package com.neuedu.java08;

import java.util.Arrays;

//System��
public class Test10 {

	public static void main(String[] args) {

		//���鿽��
		int[] source = {1,2,3,4,5,6,7,8,9};
		
		int[] dest = new int[5];
		
		System.arraycopy(source, 3, dest, 1, 3);
		
		System.out.println(Arrays.toString(dest)); 
		
		//System.exit(0);
		
		//��ȡ��������
		System.out.println("JAVA_HOME=" + System.getenv("JAVA_HOME"));
		System.out.println("path=" + System.getenv("path"));
		
		//��ȡȫ��ϵͳ���� 
		System.getProperties().list(System.out);
	}

}
