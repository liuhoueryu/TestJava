package com.neuedu.java11.decoration;

public class Father implements Drawable {

	private Drawable drawer;  //组合
	
	public Father(Drawable drawer) {
		super();
		this.drawer = drawer;   //注入
	}

	@Override
	public void draw() {
		drawer.draw();   //委托
		System.out.println("加画框。。。");  //功能增强

	}

}
