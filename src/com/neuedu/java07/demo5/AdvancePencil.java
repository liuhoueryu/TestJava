package com.neuedu.java07.demo5;

//ͨ��ʵ�ֽӿڵķ�ʽ������ǿ����
public class AdvancePencil extends Pencil implements Erasable{

	public AdvancePencil(String name) {
		super(name);
	}

	@Override
	public void remove() {
		System.out.println(this.name + "ɳɳ�ز�������");
	}

	
}
