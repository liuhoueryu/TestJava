package com.neuedu.java05;

public class Student {

	private int id;
	private String name;
	private int chinese, maths, english;
	
	public Student(int id, String name, int chinese, int maths, int english) {
		super();
		this.id = id;
		this.name = name;
		this.chinese = chinese;
		this.maths = maths;
		this.english = english;
	}
	
	//排序时需要
	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", chinese=" + chinese + ", maths=" + maths + ", english=" + english +
				 ", 总分=" + getSum() + ", 平均分="  + getAvg() + (isPass() ? " 及格" : " 不及格") + "]";
		
	}


	public int getSum(){
		return chinese + maths + english;
	}
	
	public int getAvg(){
		return (chinese + maths + english ) / 3;
	}
	
	public boolean isPass(){
		return chinese>=60 && maths >= 60 && english >=60 && getSum() >= 200;
	}
}
