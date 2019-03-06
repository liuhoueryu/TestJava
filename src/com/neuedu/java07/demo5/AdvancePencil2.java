package com.neuedu.java07.demo5;

//通过继承的方式给类增强功能
public class AdvancePencil2 extends Pencil {

	public AdvancePencil2(String name) {
		super(name);
	}

	//扩充方法
	public void remove(){
		System.out.println(this.name + "沙沙地擦。。。");
	}
}
