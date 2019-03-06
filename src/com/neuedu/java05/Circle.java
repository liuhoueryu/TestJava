package com.neuedu.java05;

public class Circle {

	private Point center;
	private int r;
	
	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + ", r=" + r + "]";
	}
	
	public double getLength(){
		return 2 * Math.PI * r;
	}
	
	public double getArea(){
		return  Math.PI * r * r;
	}
	
	public boolean contains(Point point){
		
		/*if(this.center.distance(point) < r){
			return true;
		}else{
			return false;
		}*/
		
		return this.center.distance(point) < r;
	}
}
