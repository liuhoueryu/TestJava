package com.neuedu.java11.decoration;

public class Mother implements Drawable {

	private Drawable drawer;   //���
	
	public Mother(Drawable drawer) {
		super();
		this.drawer = drawer;   //ע��
	}

	@Override
	public void draw() {
		drawer.draw();  //ί��
		System.out.println("Ϳɫ������");  //������ǿ

	}

}
