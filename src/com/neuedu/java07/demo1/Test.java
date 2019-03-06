package com.neuedu.java07.demo1;

//多态---针对抽象类编程
public class Test {

	public static void main(String[] args) throws Exception {

		/*
		//针对具体类编程
		Circle c = new Circle("圆形", 2);
		print(c);
		
		Rectangle r = new Rectangle("矩形", 4 , 5);
		print(r);
		*/
		
		//Shape s = new Shape();   //抽象类不能直接实例化
		
		//多态  同一个引用变量由于在运行期指向的不同的具体对象实例，导致对同一个消息，产生了不同的响应结果
		Shape s = new Circle("圆形", 2);
		//System.out.println(s.getArea());
		print(s);
		
		s = new Rectangle("矩形", 4 , 5);
		//System.out.println(s.getArea());
		print(s);
		
		s = new Triangle("三角形", 4 , 5);
		//System.out.println(s.getArea());
		print(s);
		
		
		Shape s1 = getShape(2);
		print(s1);
		
		
	}
	
	/*static void printCircle(Circle c){
		System.out.println(c + " 面积=" + c.getArea());
	}

	static void printRectangle(Rectangle r){
		System.out.println(r + " 面积=" + r.getArea());
	}*/
	
	/*//重载
	static void print(Circle c){
		System.out.println(c + " 面积=" + c.getArea());
	}
	
	static void print(Rectangle r){
		System.out.println(r + " 面积=" + r.getArea());
	}*/
	
	//多态1---入口参数是抽象类型
	static void print(Shape s){
		System.out.println(s + " 面积=" + s.getArea());
	}
	
	//多态2---返回类型是抽象类型   静态工厂方法
	static Shape getShape(int type){   //type 1 circle  2 rect  3 triangle
		
		if(type==1){
			return new Circle("圆形", 2);
		}else if(type==2){
			return new Rectangle("矩形", 4, 5);
		}else{
			return new Triangle("三角形", 4, 5);
		}
	}
	
}
