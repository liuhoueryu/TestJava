package com.neuedu.java07.demo5;

public class Test {

	public static void main(String[] args) {
		
		Pencil p = new Pencil("普通铅笔");
		p.write();

		AdvancePencil ap = new AdvancePencil("2B铅笔");
		ap.write();
		ap.remove();
		
		//接口中的全局常量使用接口名.常量名的形式引用   Erasable.SIZE
	}

}
