package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//ϰ��2---��һ���˿��Ƶ���Ϣ���浽�����У�ѡ�ú��ʵ����ݽṹʵ���˿��ƵĴ�����ϴ�ƺ���ʾ����
public class Test05 {

	public static void main(String[] args) {

		List<Poker> pokers = generate();
		
		System.out.println(pokers.size());
		show(pokers);
		
	}
	
	//����һ����
	static List<Poker> generate(){
		
		final String[] colors = {"����","����","÷��","��Ƭ"};
		final String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		Random random = new Random();
		
		List<Poker> pokers = new ArrayList<>();
		
		for (int i = 0; i < colors.length * numbers.length; i++) {
			
			while(true){
				
				//�������з�һ����
				Poker poker = new Poker(colors[random.nextInt(colors.length)], numbers[random.nextInt(numbers.length)]);
				
				if(!pokers.contains(poker)){
					pokers.add(poker);
					break;
				}
			}
			
		}
		
		
		return pokers;
	}

	//��ʾ
	static void show(List<Poker> pokers){

		for (int i = 0; i < pokers.size(); i++) {
			
			System.out.print(pokers.get(i));
			
			if((i+1)%13==0){
				System.out.println();
			}
			
		}
		
	}
	
}
