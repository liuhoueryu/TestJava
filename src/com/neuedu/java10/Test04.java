package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//习题2---将一副扑克牌的信息保存到集合中，选用合适的数据结构实现扑克牌的创建，洗牌和显示功能
public class Test04 {

	public static void main(String[] args) {

		List<Poker> pokers = init();
		shuffle(pokers);
		show(pokers);
		
	}
	
	//初始化一副牌
	static List<Poker> init(){
		
		final String[] colors = {"黑桃","红桃","梅花","方片"};
		
		final String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		List<Poker> pokers = new ArrayList<>();
		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				pokers.add(new Poker(colors[i], numbers[j]));
			}
		}
		return pokers;
	}

	//洗牌
	static void shuffle(List<Poker> pokers){
		
		Random random = new Random();
		
		//随机交换100次
		for (int i = 1; i <= 100; i++) {
			
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());
			
			Poker poker1 = pokers.get(index1);
			Poker poker2 = pokers.get(index2);
			
			pokers.set(index1, poker2);
			pokers.set(index2, poker1);
			
			
		}
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
