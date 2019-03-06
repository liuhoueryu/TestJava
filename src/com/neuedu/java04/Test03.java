package com.neuedu.java04;

//����ĳ��ò���
public class Test03 {

	public static void main(String[] args) {
		
		/*
		//ϰ��1---��̬��ʼ��---�������鳤�Ⱥ�ÿһ�����ݣ�������������е�ÿ��Ԫ��

		Scanner sc = new Scanner(System.in);
		System.out.print("��������ĳ���=");
		int len = sc.nextInt();
		
		//��������
		int[] arr = new int[len];
		
		//��������
		for (int i = 0; i < arr.length; i++) {
			System.out.print("�����"+(i+1)+"������Ԫ��=");
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		//�������
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		/*
		//ϰ��2---����һ��int�����飬�ҳ����Ԫ�ز�����������˲�����װ�ɺ���int getMax(int[] arr)
		int[] arr = {3,6,2,8,5};
		
		int max = getMax(arr);
		
		System.out.println(max);
		*/
		
		/*
		//ϰ��3---����һ��int�����飬���������ַ�����ʽ ��ʽΪ[����1, ����2, ����3, ...]�������˲�����װ�ɺ���String toString(int[] arr)
		int[] arr = {3,6,2,8,5};
		//int[] arr = {};
		//arr = null;
		
		System.out.println(toString(arr));
		*/
		
		/*
		//ϰ��4---����һ��int�����飬��ת�����е�Ԫ�أ������˲�����װ�ɺ���void reverse(int[] arr)
		int[] arr = {1,2,3,4,5};
		
		reverse(arr);
		
		System.out.println(toString(arr));
		*/
		
		/*
		//ϰ��5---����һ��int�����飬ɾ������������ֵΪ0��Ԫ�أ����������飬�����˲�����װ�ɺ���int[] clearZero(int[] arr)
		
		int[] arr = {1,2,0,0,3,0,4,5,0};
		
		//int[] newArr = clearZero(arr);
		
		clearZero2(arr);
		
		System.out.println(toString(arr));
		*/
		
		/*
		//ϰ��6---����һ��int�����飬ɾ�������е��ظ�Ԫ�أ����������飬�����˲�����װ�ɺ���int[] clearRepeat(int[] arr)
		int[] arr = {4, 2, 3, 4, 2, 2, 1, 2, 5, 3, 5, 4};

		System.out.println(toString(clearRepeat(arr)));
		 */
		
		//ϰ��7---����һ��int�������һ������len��ѭ���ƶ������е����ݣ�ʹ�����е�ÿ������˳�������len��λ�ã����len��Ԫ�ر��������ǰ���len��Ԫ��
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		int len = 4;

		move(arr, len);
		
		System.out.println(toString(arr));
		
	}
	
	//���������е����Ԫ��
	static int getMax(int[] arr){
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		return max;
	}
	
	//����������ַ�����ʾ��ʽ
	static String toString(int[] arr){
		
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
	
	//����Ԫ�ط�ת
	static void reverse(int[] arr){
		
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
	
	//����Ԫ������---�汾1
	static int[] clearZero(int[] arr){
		
		//ͳ�Ʒ���Ԫ�صĸ���
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				count++;
			}
		}
	
		//System.out.println(count);
		
		
		//����������
		int[] newArr = new int[count];
		
		//���������
		int index = 0;  //�����������
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=0){
				newArr[index++] = arr[i];
			}
		}
		
		return newArr;
	}

	//����Ԫ������---�汾2
	static void clearZero2(int[] arr){
	
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==0){
				//�������Һ���ĵ�һ������Ԫ��
				
				for(int j=i+1; j< arr.length; j++){
					if(arr[j]!=0){
						int temp=arr[i];arr[i]=arr[j];arr[j]=temp;
						break;
					}
				}
			}
		}
	}
	
	//��������е��ظ�Ԫ��
	static int[] clearRepeat(int[] arr){
		
		//int[] arr = {4, 2, 3, 4, 2, 2, 1, 2, 5, 3, 5, 4};

		//��¼�ظ�Ԫ�صĸ���
		int count = 0; 

		for(int i = 0; i < arr.length; i++){

			for(int j = i + 1; j < arr.length; j++){

				if(arr[i]==arr[j]){   
					count++;
					break;   //ֻҪ�������ظ�Ԫ�أ����˳���ѭ���������ͱ������ظ���ͳ��
				}
			}
		}

		System.out.println("�ظ�Ԫ�صĸ���=" + count);

		//�����µ�����
		int[] newArr = new int[arr.length - count]; 

		int index = 0; 
		
		//���������ÿһ��Ԫ�������������Ƿ���ڣ��������������뵽��������
		for(int i = 0; i < arr.length; i++){  

			boolean existFlag = false;  //Ĭ�ϲ�����
			
			for(int j = 0; j < newArr.length; j++){

				if(arr[i]==newArr[j]){
					existFlag = true;
					break;
				}
			}
			
			if(!existFlag){
				newArr[index++] = arr[i];
			}
		}
		
		return newArr;
	}
	
	//����Ԫ�صİ���
	static void move(int[] arr, int len){

		System.out.println(toString(arr));
		
		int[] temp = new int[len];		
		
		//1.��ʱ�����len��Ԫ�ص���ʱ����
		for(int i = 0; i < len; i++){
			temp[i] = arr[i + arr.length - len];  
		}

		System.out.println(toString(temp));

		//2.ǰ���Ԫ����������

		for(int i=arr.length-1; i>=len; i--){   //�����������ɨ��
			arr[i] = arr[i-len];
		}
			
		System.out.println(toString(arr));

		//3.��len��Ԫ�ط�����ǰ��
		for(int i=0; i<len; i++){  
			arr[i] = temp[i];
		}

	}

	
}
