package com.neuedu.java06;

//������ʱ����ʾ���಻���ٱ�����̳�---������
public class CircleFinal {
	
	private final int r; //�������ʵ������ʱ�������ڶ���ñ���ʱ��ֵ��Ҳ�����ڹ��췽���и�ֵ
	
	private final static int d = 10; //������ľ�̬����ʱ��ֻ���ڶ���ñ���ʱ��ֵ
	
	public CircleFinal(int r) {
		super();
		this.r = r;
	}
	
	public final void show(final int a){  //������ķ���ʱ����ʾ�÷��������ٱ�������д
		//a=1;   //���η����β�ʱ����ʾ���β��ڴ˷����в��ܱ��޸�
		System.out.println("cirle");
	}

/*	public void setR(int r) {
		this.r = r;
	}
*/
	public static void main(String[] args) {
		
		final int r = 10;   
		//r=20;   //���λ������ͱ���ʱ�������޸�
		
		final CircleFinal c = new CircleFinal(1);
		
		//c.setR(2);
		
		//c = new Circle(2);  //�����������ͱ���ʱ����ʾ�ñ���������ָ���µĶ��󣬵��Ƕ���������ݿ��Ըı�
		
	}

}
