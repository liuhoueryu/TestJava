package com.neuedu.java05;

public final class ImmutablePerson {

	private final String name;
    private final String gender;
    private final int age;
    
	public ImmutablePerson(String name, String gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "ImmutablePerson [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}

	//�޸����ԣ�ֻ��ͨ������һ���µĶ���ʵ��
	public ImmutablePerson addAge(int age){
		//this.age += age;
		
		return new ImmutablePerson(this.name, this.gender, this.age + age);
		
	}
	
    
}
