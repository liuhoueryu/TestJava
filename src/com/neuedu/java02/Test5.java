package com.neuedu.java02;

//����ѭ����Ƕ��ʹ��
public class Test5 {

	public static void main(String[] args) {

		/* row��col�еľ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��������row=");
		int row = sc.nextInt();
		
		System.out.print("��������col=");
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=col;j++){
				System.out.print("*");
			}
			
			//����
			System.out.println();
		}
		*/
		
	    /*	������ֱ��������
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("��������row=");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			//����
			System.out.println();
		}
		*/
		
	    /* ������ֱ��������---�ı���ѭ����д��
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("��������row=");
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--){
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			//����
			System.out.println();
		}
		*/
		
		/*  ������ֱ��������---�ı���ѭ����д��
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("��������row=");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=row + 1 - i;j++){
				System.out.print("*");
			}
			
			//����
			System.out.println();
		}
		*/
	
		//1��2��3��4�ĸ����ֲ�ͬ��ʽ���������
		int count = 0;
		
		for(int i=1; i<=4; i++){
			for(int j=1; j<=4; j++){
				for(int k=1; k<=4; k++){
					for(int n=1; n<=4; n++){
						if(i!=j && i!=k && i!=n  && j!=k && j!=n  && k!=n){
							count++;
							System.out.println(i+" " + j + " " + k + " " + n);
						}
					}
				}
			}
		}
		
		System.out.println("count=" + count);
	}
	
}
