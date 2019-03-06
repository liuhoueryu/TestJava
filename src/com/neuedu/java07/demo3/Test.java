package com.neuedu.java07.demo3;

public class Test {

	public static void main(String[] args) {
		
	/*	MyCode myCode = new MyCode();
		myCode.execute();
		
		new MyCode().execute();*/
		

		new MyRuntime(){
			@Override
			protected void code() {
				long s = 1;
				for (int i = 1; i <= 20; i++) {
					s*=i;
				}
				System.out.println("10£¡=" + s);
				
			}
		}.execute();
	}

}
