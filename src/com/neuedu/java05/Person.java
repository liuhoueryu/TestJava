package com.neuedu.java05;

public class Person {
	
	//��Ա������Ĭ��ֵ   int��0  ���ñ���Ϊnull
	
	//����˽�л�   ʵ������   instance
	private String name = "��";
    private String gender = "��";
    private int age = 10;
	
    //��̬����
    public static int count;
    
    //�����
    {
    	System.out.println("����顣������");
    }
    
    //��̬��
    static{
    	System.out.println("��̬�顣������");
    }
 
    //�ṩ���е�getter/setter...
    public String getName(){ 
    
    	return name;
    }
    
    public void setName(String name){
    	this.name = name;
    }
    
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		
		//���ݼ��
		//if(gender.equals("��") || gender.equals("Ů")){
		if("��".equals(gender)|| "Ů".equals(gender)){  //�ַ�����������equals���������׳���ָ���쳣
			this.gender = gender;
		}else{
			this.gender = "����";
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		//���ݼ��
		if(age>=20 &  age<=60){
			this.age = age;
		}else{
			this.age = 20;   //Ĭ�ϴ���
		}
		
	}

	//������������
	public void show(){
		System.out.println("name=" + this.name + " gender=" + this.gender + " age=" + this.age);
	}


	//��дtoString()
	//@Override
	//public String toString() {
	//	return "name=" + this.name + " gender=" + this.gender + " age=" + this.age;
	//}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	//�޲εĹ��췽��
	public Person(){
		//System.out.println("�޲εĹ��췽����������");
		//this.name = "����";
		//this.gender="Ů";
		//this.age=30;		
	}
	
	//�����εĹ��췽��
	public Person(String name, String gender, int age){
		this(name, gender);
		System.out.println("�����εĹ��췽����������");
		//this.name = name;
		//this.gender = gender;
		this.age = age;
		count++;
	
	}
	
	//һ���εĹ��췽��
	public Person(String name){
		System.out.println("һ���εĹ��췽����������");
		this.name = name;
	}
	
	//�����εĹ��췽��
	public Person(String name, String gender){
		this(name);
		System.out.println("�����εĹ��췽����������");
		//this.name = name;
		this.gender = gender;
		
	}
	
	public static int getCount(){
		return count;
	}
	
}
