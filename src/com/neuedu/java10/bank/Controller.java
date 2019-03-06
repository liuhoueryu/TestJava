package com.neuedu.java10.bank;

//控制器类---派发请求
public class Controller {

	private Controller(){
	}
	
	//组合业务层对象
	private static Service service = Service.getInstance();
	
	//派发请求
	public static void dispatch(){
		
		boolean exitFlag = false;
		
		while(!exitFlag){
			
			//显示主菜单
			int option = View.mainMenu();
			
			String id = null;
			String password = null;
			
			switch(option){
			
				case Constant.LOGIN:
					
					id = View.input("输入卡号");
					password = View.input("输入密码");
					
					//调登录业务方法
					try {
						service.login(id, password);
						
						System.out.println("恭喜，登录成功");
						
						boolean returnFlag = false;
						
						while(!returnFlag){
							
							//显示操作菜单
							int choice = View.operationMenu();
							
							int amount = 0;
							
							switch(choice){
							
								case 1:
									
									service.query();
									
									break;
									
								case 2:
									
									//输入存款金额
									amount = Integer.parseInt(View.input("输入存款金额"));
									
									service.save(amount);
									
									break;
									
								case 3:
									
									//输入取款金额
									amount = Integer.parseInt(View.input("输入取款金额"));
									
									try{
										service.withdraw(amount);
									}catch (AccountException e) {
										System.out.println(e.getMessage());
									}
									
									break;
									
								case 4:
									
									//输入对方账号
									String destId = View.input("输入对方账号");
									
									//输入转账金额
									amount = Integer.parseInt(View.input("输入转账金额"));
									
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
					
					id = View.input("输入卡号");
					password = View.input("输入密码");
					
					try {
						
						//调用注册业务方法
						service.register(id, password);
						
						System.out.println("恭喜，注册成功");
						
					} catch (AccountException e) {
						System.out.println(e.getMessage());
					}
					
					break;
					
				case Constant.EXIT:
					
					System.out.println("886,欢迎再次光临");
					
					exitFlag = true;
					
					break;
			}
			
		}
	}
}
