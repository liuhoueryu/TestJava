package com.neuedu.java06;

//�������Ĵ�������
public class Test2 {

	public static void main(String[] args) throws Exception {

		//������޲ι���
		//Parent p = new Parent();
		//p.method();
		
		//������вι���
		//Parent p = new Parent(10);
		//p.method();
		
		//������޲ι���
		//Child c = new Child();
		//c.method();
		
		/*
		 * ���ྲ̬��
		���ྲ̬��
		���๹���
		�����޲ι��췽��
		���๹���
		�����޲ι��췽��
		������ͨ����
		*/
		
		//������޲ι���
		Child c = new Child(10);
		c.method();
				
		/*
		 * ���ྲ̬��
		���ྲ̬��
		���๹���
		�����޲ι��췽��
		���๹���
		�����вι��췽�� i=10
		������ͨ����
		
				 */
	}

}
