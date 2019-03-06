package com.neuedu.java02;

//多重循环的嵌套使用
public class Test5 {

	public static void main(String[] args) {

		/* row行col列的矩形
		Scanner sc = new Scanner(System.in);
		
		System.out.print("输入行数row=");
		int row = sc.nextInt();
		
		System.out.print("输入列数col=");
		int col = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=col;j++){
				System.out.print("*");
			}
			
			//换行
			System.out.println();
		}
		*/
		
	    /*	正立的直角三角形
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("输入行数row=");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			//换行
			System.out.println();
		}
		*/
		
	    /* 倒立的直角三角形---改变外循环的写法
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("输入行数row=");
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--){
			
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			
			//换行
			System.out.println();
		}
		*/
		
		/*  倒立的直角三角形---改变内循环的写法
	    Scanner sc = new Scanner(System.in);
		
		System.out.print("输入行数row=");
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++){
			
			for(int j=1;j<=row + 1 - i;j++){
				System.out.print("*");
			}
			
			//换行
			System.out.println();
		}
		*/
	
		//1，2，3，4四个数字不同形式的排列组合
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
