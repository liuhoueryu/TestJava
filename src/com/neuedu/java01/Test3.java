package com.neuedu.java01;

//分支结构
public class Test3 {

	public static void main(String[] args) {

		int a=1, b=2, c=3;
		
		int max = 0;
		
		//写法1
		if(a>b){
		
			if(a>c){
				max = a;
			}else{
				max = c;
			}
			
		}else{
			
			if(b>c){
				max = b;
			}else{
				max = c;
			}
		}
		
		//写法2
		int temp=0;
		
		if(a>b){
			temp = a;
		}else{
			temp = b;
		}
		
		if(temp>c){
			max = temp;
		}else{
			max = c;
		}
				
		
	}

}
