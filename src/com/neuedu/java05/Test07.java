package com.neuedu.java05;

//��ҵ4
public class Test07 {

	public static void main(String[] args) {
		
		Student s1 = new Student(5,"s1", 65, 60, 60);
		Student s2 = new Student(2,"s2", 80, 60, 60);
		Student s3 = new Student(1,"s3", 65, 70, 60);
		Student s4 = new Student(4,"s4", 85, 60, 75);
		Student s5 = new Student(3,"s5", 55, 60, 95);
		//System.out.println(s1);
		
		Student[] students = {s1, s2, s3, s4, s5};
		
		//Arrays.sort(students);
		
		selectSort2(students);
		
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i]);
		}
	}
	
	//ѡ������
	static void selectSort1(Student[] arr){
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			//ѡ����СԪ�ص��±�
			int minIndex = i;
			
			for (int j = i + 1; j < arr.length ; j++) {
				
				if(arr[j].getId() < arr[minIndex].getId()){
					minIndex = j;
				}
				
			}
			
			//����minIndex��iλ�õ�Ԫ��
			Student temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
		
	}
	
	//ѡ������
	static void selectSort2(Student[] arr){
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			//ѡ����СԪ�ص��±�
			int minIndex = i;
			
			for (int j = i + 1; j < arr.length ; j++) {
				
				if(arr[j].getSum() > arr[minIndex].getSum()){
					minIndex = j;
				}
				
			}
			
			//����minIndex��iλ�õ�Ԫ��
			Student temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
		
	}

}
