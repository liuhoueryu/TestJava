package com.neuedu.java04;

//数组的常用操作
public class Test03 {

	public static void main(String[] args) {
		
		/*
		//习题1---动态初始化---输入数组长度和每一个数据，逆序输出数组中的每个元素

		Scanner sc = new Scanner(System.in);
		System.out.print("输入数组的长度=");
		int len = sc.nextInt();
		
		//定义数组
		int[] arr = new int[len];
		
		//输入数据
		for (int i = 0; i < arr.length; i++) {
			System.out.print("输入第"+(i+1)+"个数组元素=");
			arr[i] = sc.nextInt();
		}
		
		System.out.println();
		
		//逆序输出
		for (int i = arr.length-1; i >=0; i--) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		/*
		//习题2---给定一个int型数组，找出最大元素并输出，并将此操作封装成函数int getMax(int[] arr)
		int[] arr = {3,6,2,8,5};
		
		int max = getMax(arr);
		
		System.out.println(max);
		*/
		
		/*
		//习题3---给定一个int型数组，输出数组的字符串形式 格式为[数据1, 数据2, 数据3, ...]，并将此操作封装成函数String toString(int[] arr)
		int[] arr = {3,6,2,8,5};
		//int[] arr = {};
		//arr = null;
		
		System.out.println(toString(arr));
		*/
		
		/*
		//习题4---给定一个int型数组，反转数组中的元素，并将此操作封装成函数void reverse(int[] arr)
		int[] arr = {1,2,3,4,5};
		
		reverse(arr);
		
		System.out.println(toString(arr));
		*/
		
		/*
		//习题5---给定一个int型数组，删除数组中所有值为0的元素，返回新数组，并将此操作封装成函数int[] clearZero(int[] arr)
		
		int[] arr = {1,2,0,0,3,0,4,5,0};
		
		//int[] newArr = clearZero(arr);
		
		clearZero2(arr);
		
		System.out.println(toString(arr));
		*/
		
		/*
		//习题6---给定一个int型数组，删除数组中的重复元素，返回新数组，并将此操作封装成函数int[] clearRepeat(int[] arr)
		int[] arr = {4, 2, 3, 4, 2, 2, 1, 2, 5, 3, 5, 4};

		System.out.println(toString(clearRepeat(arr)));
		 */
		
		//习题7---给定一个int型数组和一个整数len，循环移动数组中的数据，使数组中的每个数据顺序向后移len个位置，最后len个元素变成数组最前面的len个元素
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		int len = 4;

		move(arr, len);
		
		System.out.println(toString(arr));
		
	}
	
	//返回数组中的最大元素
	static int getMax(int[] arr){
		
		int max = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			
			if(arr[i] > max){
				max = arr[i];
			}
		}
		
		return max;
	}
	
	//返回数组的字符串表示形式
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
	
	//数组元素反转
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
	
	//数组元素清零---版本1
	static int[] clearZero(int[] arr){
		
		//统计非零元素的个数
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=0){
				count++;
			}
		}
	
		//System.out.println(count);
		
		
		//创建新数组
		int[] newArr = new int[count];
		
		//填充新数组
		int index = 0;  //新数组的索引
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]!=0){
				newArr[index++] = arr[i];
			}
		}
		
		return newArr;
	}

	//数组元素清零---版本2
	static void clearZero2(int[] arr){
	
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]==0){
				//继续查找后面的第一个非零元素
				
				for(int j=i+1; j< arr.length; j++){
					if(arr[j]!=0){
						int temp=arr[i];arr[i]=arr[j];arr[j]=temp;
						break;
					}
				}
			}
		}
	}
	
	//清除数组中的重复元素
	static int[] clearRepeat(int[] arr){
		
		//int[] arr = {4, 2, 3, 4, 2, 2, 1, 2, 5, 3, 5, 4};

		//记录重复元素的个数
		int count = 0; 

		for(int i = 0; i < arr.length; i++){

			for(int j = i + 1; j < arr.length; j++){

				if(arr[i]==arr[j]){   
					count++;
					break;   //只要发现是重复元素，就退出内循环，这样就避免了重复的统计
				}
			}
		}

		System.out.println("重复元素的个数=" + count);

		//创建新的数组
		int[] newArr = new int[arr.length - count]; 

		int index = 0; 
		
		//检查旧数组的每一个元素在新数组中是否存在，如果不存在则加入到新数组中
		for(int i = 0; i < arr.length; i++){  

			boolean existFlag = false;  //默认不存在
			
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
	
	//数组元素的搬移
	static void move(int[] arr, int len){

		System.out.println(toString(arr));
		
		int[] temp = new int[len];		
		
		//1.临时保存后len个元素到临时数组
		for(int i = 0; i < len; i++){
			temp[i] = arr[i + arr.length - len];  
		}

		System.out.println(toString(temp));

		//2.前面的元素整体右移

		for(int i=arr.length-1; i>=len; i--){   //必须从右向左扫描
			arr[i] = arr[i-len];
		}
			
		System.out.println(toString(arr));

		//3.后len个元素放在最前面
		for(int i=0; i<len; i++){  
			arr[i] = temp[i];
		}

	}

	
}
