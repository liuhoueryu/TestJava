package com.neuedu.java10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//ϰ��2---��һ���˿��Ƶ���Ϣ���浽�����У�ѡ�ú��ʵ����ݽṹʵ���˿��ƵĴ�����ϴ�ƺ���ʾ����
public class Test04 {

	public static void main(String[] args) {

		List<Poker> pokers = init();
		shuffle(pokers);
		show(pokers);
		
	}
	
	//��ʼ��һ����
	static List<Poker> init(){
		
		final String[] colors = {"����","����","÷��","��Ƭ"};
		
		final String[] numbers = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		List<Poker> pokers = new ArrayList<>();
		for (int i = 0; i < colors.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				pokers.add(new Poker(colors[i], numbers[j]));
			}
		}
		return pokers;
	}

	//ϴ��
	static void shuffle(List<Poker> pokers){
		
		Random random = new Random();
		
		//�������100��
		for (int i = 1; i <= 100; i++) {
			
			int index1 = random.nextInt(pokers.size());
			int index2 = random.nextInt(pokers.size());
			
			Poker poker1 = pokers.get(index1);
			Poker poker2 = pokers.get(index2);
			
			pokers.set(index1, poker2);
			pokers.set(index2, poker1);
			
			
		}
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
