package com.neuedu.java04;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("请输入n=");
		
		int n = scanner.nextInt();
		
		int[] arr = findNumber(n);
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=0){
				System.out.println(arr[i]);
			}
		}
	}

	static int[] findNumber(int n){
		
		int[] arr = new int[10];
		
		int index = 0;
		
		for(int i=1; i<=n; i++){
			
			int sum = 0;
		
			for(int j=1; j<=i/2; j++){

				if(i%j == 0){  //是因数
					
					sum += j; 
				}
			
			}
			
			if(sum==i && index < arr.length){   //是完数
				arr[index++] = i;
			}
			
		}

		return arr;
	}

}
