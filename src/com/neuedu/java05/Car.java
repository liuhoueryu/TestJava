package com.neuedu.java05;

public class Car {

	private String brand;
	private String color;
	private int price;
	private int speed;
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getBrand() {
		return brand;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", price=" + price + ", speed=" + speed + "]";
	}

	public void run(){
		if(speed<10){
			//组合  类A的成员变量是类B   类A组合/关联了类B
			CarFactory factory = new CarFactory("6s修车厂","空港汽车工业园","11111");
			factory.repair(this);
		}else{
			System.out.println(color + "色的" + brand + "车以" + speed +"迈的速度在飞奔。。。");
		}
	}
	
	
}
