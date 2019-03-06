package com.neuedu.java10.bank;

//��������---�ɷ�����
public class Controller {

	private Controller(){
	}
	
	//���ҵ������
	private static Service service = Service.getInstance();
	
	//�ɷ�����
	public static void dispatch(){
		
		boolean exitFlag = false;
		
		while(!exitFlag){
			
			//��ʾ���˵�
			int option = View.mainMenu();
			
			String id = null;
			String password = null;
			
			switch(option){
			
				case Constant.LOGIN:
					
					id = View.input("���뿨��");
					password = View.input("��������");
					
					//����¼ҵ�񷽷�
					try {
						service.login(id, password);
						
						System.out.println("��ϲ����¼�ɹ�");
						
						boolean returnFlag = false;
						
						while(!returnFlag){
							
							//��ʾ�����˵�
							int choice = View.operationMenu();
							
							int amount = 0;
							
							switch(choice){
							
								case 1:
									
									service.query();
									
									break;
									
								case 2:
									
									//��������
									amount = Integer.parseInt(View.input("��������"));
									
									service.save(amount);
									
									break;
									
								case 3:
									
									//����ȡ����
									amount = Integer.parseInt(View.input("����ȡ����"));
									
									try{
										service.withdraw(amount);
									}catch (AccountException e) {
										System.out.println(e.getMessage());
									}
									
									break;
									
								case 4:
									
									//����Է��˺�
									String destId = View.input("����Է��˺�");
									
									//����ת�˽��
									amount = Integer.parseInt(View.input("����ת�˽��"));
									
									try{
										service.transfer(destId, amount);
									}catch (AccountException e) {
										System.out.println(e.getMessage());
									}
									
									break;
									
								case 5:
									returnFlag = true;
									break;
							}
							
						}
						
						
					} catch (AccountException e) {
						System.out.println(e.getMessage());
					}
					
					break;
					
				case Constant.REGISTER:
					
					id = View.input("���뿨��");
					password = View.input("��������");
					
					try {
						
						//����ע��ҵ�񷽷�
						service.register(id, password);
						
						System.out.println("��ϲ��ע��ɹ�");
						
					} catch (AccountException e) {
						System.out.println(e.getMessage());
					}
					
					break;
					
				case Constant.EXIT:
					
					System.out.println("886,��ӭ�ٴι���");
					
					exitFlag = true;
					
					break;
			}
			
		}
	}
}
