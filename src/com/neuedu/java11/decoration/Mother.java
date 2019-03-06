package com.neuedu.java11.decoration;

public class Mother implements Drawable {

	private Drawable drawer;   //组合
	
	public Mother(Drawable drawer) {
		super();
		this.drawer = drawer;   //注入
	}

	@Override
	public void draw() {
		drawer.draw();  //委托
		System.out.println("涂色。。。");  //功能增强

	}

}
