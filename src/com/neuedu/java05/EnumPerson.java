package com.neuedu.java05;

public class EnumPerson {

	private String name;
    private String gender;
    
    //ȫ�ֳ���
    public static final int MALE = 1;
	public static final int FEMALE = 2;
	
    //����
    private static EnumPerson male = new EnumPerson("�ǵ�","��");
    private static EnumPerson female = new EnumPerson("����","Ů");
    
    //���췽��˽�л�
	private EnumPerson(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}

	//��̬�Ĺ�������
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
