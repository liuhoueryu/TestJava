package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//习题2---将一副扑克牌的信息保存到集合中，选用合适的数据结构实现扑克牌的创建，洗牌和显示功能
public class Test05 {

	public static void main(String[] args) {

		List<Poker> pokers = generate();
		
		System.out.println(pokers.size());
		show(pokers);
		
	}
	
	//产生一副牌
	static List<Poker> generate(){
		
		final String[] colors = {"黑桃","红桃","梅花","方片"};
		final String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		Random random = new Random();
		
		List<Poker> pokers = new ArrayList<>();
		
		for (int i = 0; i < colors.length * numbers.length; i++) {
			
			while(true){
				
				//往集合中放一张牌
				Poker poker = new Poker(colors[random.nextInt(colors.length)], numbers[random.nextInt(numbers.length)]);
				
				if(!pokers.contains(poker)){
					pokers.add(poker);
					break;
				}
			}
			
		}
		
		
		return pokers;
	}

	//显示
	static void show(List<Poker> pokers){

		for (int i = 0; i < pokers.size(); i++) {
			
			System.out.print(pokers.get(i));
			
			if((i+1)%13==0){
				System.out.println();
			}
			
		}
		
	}
	
}
