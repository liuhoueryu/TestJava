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
			//���  ��A�ĳ�Ա��������B   ��A���/��������B
			CarFactory factory = new CarFactory("6s�޳���","�ո�������ҵ԰","11111");
			factory.repair(this);
		}else{
			System.out.println(color + "ɫ��" + brand + "����" + speed +"�����ٶ��ڷɱ�������");
		}
	}
	
	
}
