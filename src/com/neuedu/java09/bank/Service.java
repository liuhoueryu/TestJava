package com.neuedu.java09.bank;

//业务类
public class Service {

	//账户数组
	private static Account[] accounts = new Account[Constant.ACCOUNT_CAPACITY];
		
	//账户数组的可用大小
	private static int accountSize = 0;
		
	static{
		accounts[0] = new Account("111", "1", 100);
		accounts[1] = new Account("222", "2", 20);
		accountSize = 2;
	}
	
	//单例
	private Service(){
	}
	private static Service instance = new Service();
	
	public static Service getInstance(){
		return instance;
	}
	
	
	//当前账户
	private Account currentAccount = null;
	
	public boolean register(String id, String password) throws AccountException{
		
		//检查新账户的卡号是否存在
		for (int i = 0; i < accounts.length; i++) {
			
			if(accounts[i]!=null){
				
				if(accounts[i].getId().equals(id)){  //卡号已存在
					throw new AccountException("卡号已存在");
				}
			}
		}
		
		//判断容量是否够用
		if(accountSize >= Constant.ACCOUNT_CAPACITY){
			throw new AccountException("账户容量已满，无法注册");
		}
		
		//创建新的账户对象
		Account account = new Account(id, password);
		
		//添加到账户数组中
		accounts[accountSize++] = account;
		
		return true;
		
	}
	
	public boolean login(String id, String password) throws AccountException{
		
		//检查新账户的卡号是否存在
		boolean existFlag = false;
	
		for (int i = 0; i < accounts.length; i++) {
			
			if(accounts[i]!=null){
				
				if(accounts[i].getId().equals(id)){  //卡号已存在
					existFlag = true;
					currentAccount = accounts[i];
					break;
				}
			}
		}
		
		if(existFlag){
			
			if(password.equals(currentAccount.getPassword())){
				
				//登录成功
				return true;
				
			}else{
				throw new AccountException("密码不正确");
			}
		}else{
			throw new AccountException("卡号不存在");
		}
		
	}
	
	public void query() {
		System.out.println("当前余额=" + currentAccount.getAmount() + "元");
	}
		
	public void save(int amount) {
		System.out.println("存款之前的余额=" + currentAccount.getAmount() + "元");
		currentAccount.setAmount(currentAccount.getAmount() + amount);
		System.out.println("存款之后的余额=" + currentAccount.getAmount() + "元");
	}
	
	public void withdraw(int amount) throws AccountException {
		
		//判断余额是否够用
		if(amount > currentAccount.getAmount()){
			throw new AccountException("余额不足，无法取款");
		}
		
		System.out.println("取款之前的余额=" + currentAccount.getAmount() + "元");
		currentAccount.setAmount(currentAccount.getAmount() - amount);
		System.out.println("取款之后的余额=" + currentAccount.getAmount() + "元");
	}
	
	public void transfer(String destId, int amount) throws AccountException {
		
		//判断目的账户是否存在
		boolean existFlag = false;
		
		Account destAccount = null;
		for (int i = 0; i < accounts.length; i++) {
			
			if(accounts[i]!=null){
				
				if(accounts[i].getId().equals(destId)){  //卡号已存在
					existFlag = true;
					destAccount = accounts[i];
					break;
				}
			}
		}
	
		if(!existFlag){
			throw new AccountException("目的账户不存在，无法转账");
		}
		
		//判断余额是否够用
		if(amount > currentAccount.getAmount()){
			throw new AccountException("余额不足，无法转账");
		}
		
		System.out.println("转账之前的余额=" + currentAccount.getAmount() + "元");
		currentAccount.setAmount(currentAccount.getAmount() - amount);
		destAccount.setAmount(destAccount.getAmount() + amount);
		System.out.println("转账之后的余额=" + currentAccount.getAmount() + "元");
	}
	
}
