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
	
	//类A的一个方法的参数或返回类型为类B  类A依赖于类B
	public void repair(Car car){
		System.out.println(this.name + "正在维修" + car.getBrand() + "车");
		car.setSpeed(100);
		car.run();
	}
	
}
