package com.neuedu.java03;

//��ҵ
public class Test6 {

	public static void main(String[] args) {
		
		//int row = 6;
		//printTable(row);
		//printTriangle(row);
		
		int n = 100;
		
		for(int i=2; i<=n; i++){
			
			if(isPrime(i)){
				System.out.println(i);
			}
		}
	}

	//���ж�һ�����Ƿ��������Ĵ����ת�ɺ����������ô˺���ʵ���ҳ�1-n֮�����������
	static boolean isPrime(int n){
		
		for(int i=2;i<=n/2;i++){
			
			if(n%i==0){
				return false;  //��������
			}
		}
		
		return true;  //������
	}
	
	//���庯��printTriangle����ӡָ�������ĵ���������
    static void printTriangle(int row) {
    	
		for(int i=1; i<=row; i++){   //����
						
			//��ӡ�ո�
			for(int j=1; j<=row-i; j++){
				System.out.print(" ");
			}
			
			//��ӡ*
			for(int j=1; j<=2*i-1; j++){
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

	//���庯��printTable����ӡָ�������ĳ˷���
	static void printTable(int row){
		
		for(int i=1; i<=row; i++){
			
			for(int j=1; j<=i; j++){
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			
			System.out.println();
		}
	}
	
}
