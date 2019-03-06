package com.neuedu.java07.demo5;

//通过实现接口的方式给类增强功能
public class AdvancePencil extends Pencil implements Erasable{

	public AdvancePencil(String name) {
		super(name);
	}

	@Override
	public void remove() {
		System.out.println(this.name + "沙沙地擦。。。");
	}

	
}
