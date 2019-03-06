package com.neuedu.java05;

public class CarFactory {

	private String name;
	private String address;
	private String tel;
	
	public CarFactory(String name, String address, String tel) {
		super();
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "CarFactory [name=" + name + ", address=" + address + ", tel=" + tel + "]";
	}
	
	//��A��һ�������Ĳ����򷵻�����Ϊ��B  ��A��������B
	public void repair(Car car){
		System.out.println(this.name + "����ά��" + car.getBrand() + "��");
		car.setSpeed(100);
		car.run();
	}
	
}
