package com.neuedu.java05;

public class EnumPerson {

	private String name;
    private String gender;
    
    //全局常量
    public static final int MALE = 1;
	public static final int FEMALE = 2;
	
    //多例
    private static EnumPerson male = new EnumPerson("亚当","男");
    private static EnumPerson female = new EnumPerson("夏娃","女");
    
    //构造方法私有化
	private EnumPerson(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	//静态的工厂方法
	public static EnumPerson getInstance(int type){  //type=1  male  type==2 female
		
		if(type==MALE){
			return male;
		}else{
			return female;
		}
	}
	
	@Override
	public String toString() {
		return "EnumPerson [name=" + name + ", gender=" + gender + "]";
	}
    
    
}
