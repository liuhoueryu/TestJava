package com.neuedu.java09;

//√Ê ‘Ã‚
public class Test8 {

	public static String output = "";

	public static void foo(int i){

		try{
			
			if(i==7){
				throw new Exception();
			}

			output += "A";

		}catch(Exception e){

			output += "B";
			return;

		}finally{

			output += "C";
		}

		output += "D";
	}
	
	public static void main(String[] args) {
		
		foo(7);
		System.out.println(output); 
		
		foo(8);  
		System.out.println(output);		

	}	
}
