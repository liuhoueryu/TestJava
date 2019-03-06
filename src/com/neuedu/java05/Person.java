package com.neuedu.java05;

public class Person {
	
	//成员变量有默认值   int是0  引用变量为null
	
	//属性私有化   实例变量   instance
	private String name = "人";
    private String gender = "男";
    private int age = 10;
	
    //静态属性
    public static int count;
    
    //构造块
    {
    	System.out.println("构造块。。。。");
    }
    
    //静态块
    static{
    	System.out.println("静态块。。。。");
    }
 
    //提供公有的getter/setter...
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
		
		//数据检查
		//if(gender.equals("男") || gender.equals("女")){
		if("男".equals(gender)|| "女".equals(gender)){  //字符串常量调用equals方法不会抛出空指针异常
			this.gender = gender;
		}else{
			this.gender = "保密";
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		//数据检查
		if(age>=20 &  age<=60){
			this.age = age;
		}else{
			this.age = 20;   //默认处理
		}
		
	}

	//输出对象的内容
	public void show(){
		System.out.println("name=" + this.name + " gender=" + this.gender + " age=" + this.age);
	}


	//重写toString()
	//@Override
	//public String toString() {
	//	return "name=" + this.name + " gender=" + this.gender + " age=" + this.age;
	//}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
	//无参的构造方法
	public Person(){
		//System.out.println("无参的构造方法。。。。");
		//this.name = "王五";
		//this.gender="女";
		//this.age=30;		
	}
	
	//三个参的构造方法
	public Person(String name, String gender, int age){
		this(name, gender);
		System.out.println("三个参的构造方法。。。。");
		//this.name = name;
		//this.gender = gender;
		this.age = age;
		count++;
	
	}
	
	//一个参的构造方法
	public Person(String name){
		System.out.println("一个参的构造方法。。。。");
		this.name = name;
	}
	
	//两个参的构造方法
	public Person(String name, String gender){
		this(name);
		System.out.println("两个参的构造方法。。。。");
		//this.name = name;
		this.gender = gender;
		
	}
	
	public static int getCount(){
		return count;
	}
	
}
