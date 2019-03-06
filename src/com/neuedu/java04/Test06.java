package com.neuedu.java04;

import java.util.Random;

//����Ͳ���
public class Test06 {

	public static void main(String[] args) {
		
		int[] arr = {6,4,3,1,8,7,2,9,5};
		
		//����
		
		//int[] arr = new int[10000];
		
		//init(arr);
		
		//print(arr);
		
		//long begin = System.currentTimeMillis();
		
		//selectSort(arr);
		
		//long end = System.currentTimeMillis();
		
		//System.out.println("time=" + (end - begin) + "ms");
		
		//print(arr);
		
		//���ֲ���
		
		selectSort(arr);
		
		System.out.println("position=" + binarySearch(arr, 14));
		
	}
	
	static int binarySearch(int[] arr, int key) {
		
		//low�洢�Ĳ��ҷ�Χ����С���±�
		int low = 0;
		
		//high�洢�Ĳ��ҷ�Χ�������±�
		int high = arr.length - 1;
		
		while(low<=high){
			
			int mid = (low + high) / 2;
			
			if(arr[mid]==key){
				return mid;
			}else if(key > arr[mid]){
				low = mid + 1;
			}else{
				high = mid - 1;
			}
			
		}
			
		return -1;
		
	}

	//��ӡ���������
	static void print(int[] arr){
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	
	//��ʼ�����������
	static void init(int[] arr){
		
		Random random = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10000) + 1;
		}
		
	}
	
	//ð������
	static void bubbleSort(int[] arr){
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			for (int j = 0; j < arr.length - 1 - i; j++) {
				
				if(arr[j] > arr[j+1]){   //����ֻ���<
					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			
			//print(arr);
			
		}
		
	}
	
	//ѡ������
	static void selectSort(int[] arr){
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			//ѡ����СԪ�ص��±�
			int minIndex = i;
			
			for (int j = i + 1; j < arr.length ; j++) {
				
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
				
			}
			
			//����minIndex��iλ�õ�Ԫ��
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
			//print(arr);
			
		}
		
	}
}
