package com.neuedu.java11.decoration;

public class Father implements Drawable {

	private Drawable drawer;  //���
	
	public Father(Drawable drawer) {
		super();
		this.drawer = drawer;   //ע��
	}

	@Override
	public void draw() {
		drawer.draw();   //ί��
		System.out.println("�ӻ��򡣡���");  //������ǿ

	}

}
