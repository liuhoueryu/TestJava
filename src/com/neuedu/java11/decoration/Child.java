package com.neuedu.java11.decoration;

//被装饰者
public class Child implements Drawable {

	@Override
	public void draw() {
		System.out.println("画出轮廓。。。");
	}

}
