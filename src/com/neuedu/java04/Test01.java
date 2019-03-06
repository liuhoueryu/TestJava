package com.neuedu.java04;

//数组的定义和使用
public class Test01 {

	public static void main(String[] args) {

		//声明
		//int[] arr;  
		
		//定义格式1---分配堆空间,没有初始化数据
		//int[] arr = new int[10];   //常用
		
		//定义格式2---分配堆空间,同时初始化数据
		//int[] arr = new int[]{1,2,3};
		int[] arr = {1,2,3};    //简化形式  常用
		
		//System.out.println(arr);  //  [I@1db9742
		//System.out.println(arr[0]);  //  下标0到length-1
		//System.out.println(arr[arr.length-1]);
		
		/*//数组的遍历格式1---传统
		for (int i = 0; i < arr.length; i++) {
			System.out.println("第"+(i+1)+"个元素=" + arr[i]);
		}
		
		//数组的遍历格式2---增强型
		int index = 0;
		for(int element : arr){
			System.out.println("第"+(index+1)+"个元素=" + element);
			index++;
		}*/
		
		//System.out.println(arr[4]);   //引用一个不存在的元素，抛出ArrayIndexOutOfBoundsException异常
		
		//arr = null;   
		//System.out.println(arr.length);  //对null对象，调用方法，会抛出NullPointerException异常
		
	}

}
