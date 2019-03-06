package com.neuedu.java11.decoration;

public class Test {

	public static void main(String[] args) {
		
		//Child child = new Child();
		//child.draw();

		//Mother mother = new Mother(new Child());
		//mother.draw();
		
		//Father father = new Father(new Child());
		//father.draw();
		
		// father = new Father(new Mother(new Child()));
		//father.draw();
		
		Mother mother = new Mother(new Father(new Child()));
		mother.draw();
	}

}
