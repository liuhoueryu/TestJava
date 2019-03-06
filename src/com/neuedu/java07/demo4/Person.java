package com.neuedu.java07.demo4;

public abstract class Person implements Action {

	//ģ�巽��
	@Override
	public void execute() {
		
		greet();
		eat();
		bye();

	}
	
	protected abstract void greet();
	protected abstract void eat();
	protected abstract void bye();
}
