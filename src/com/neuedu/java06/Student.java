package com.neuedu.java06;

public class Student extends Person {

	/*private int score;
	
	public Student(String name, String gender, int age) {
		super(name, gender, age);
	}

	public Student(String name, String gender, int age, int score) {
		super(name, gender, age);
		this.score = score;
	}

	public void show2() {
		super.show();
		this.show();
	}
	
	//@Override
	//public void show() {
	//	System.out.println("����ѧ��");
	//}
	*/
	
	private int score;
	
	private String name;
	
	public Student(String name) {
		super(name);
	}

	public Student(String name, int score) {
		super(name);
		this.score = score;
	}

	//����
	public void show2() {
		show(); 
		//û����дshow����ʱ      show()  super.show()  this.show()   ָ���Ǹ����show����
		//��дshow����ʱ(����)      show()   this.show()    ָ���������show����          super.show()    ָ���Ǹ����show����
		
		
		//û���������ж�����͸���ͬ�������ԣ�name this.name  super.name   ָ���Ǹ����name����
		//�������ж�����͸���ͬ��������(���Ե����� ������)��   name this.name   ָ���������name����        super.name   ָ���Ǹ����name����
		
	}

	//��д
	@Override
	public void show(){
		System.out.println("����ѧ�� name=" + this.name);
	}
	
	
}
