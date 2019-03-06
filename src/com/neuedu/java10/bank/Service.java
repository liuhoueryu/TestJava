package com.neuedu.java10.bank;

import java.util.ArrayList;
import java.util.List;

//业务类
public class Service {

	//账户集合
	private static List<Account> accounts = new ArrayList<>();
		
	static{
		accounts.add(new Account("111", "1", 100));
		accounts.add(new Account("222", "2", 20));
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
		
		//创建新的账户对象
		Account account = new Account(id, password);
		
		if(accounts.contains(account)){
			throw new AccountException("卡号已存在");
		}
		
		//添加到账户集合中
		accounts.add(account);
		
		return true;
		
	}
	
	public boolean login(String id, String password) throws AccountException{
		
		//创建新的账户对象
		Account account = new Account(id, password);
		
		if(!accounts.contains(account)){
			throw new AccountException("卡号不存在");
		}
		
		for (int i = 0; i < accounts.size(); i++) {
			
			currentAccount = accounts.get(i);
			
			if (currentAccount.equals(account)){   //id相同
				
				if(currentAccount.getPassword().equals(account.getPassword())){  //密码一致
					return true;
				}else{
					throw new AccountException("密码不正确");
				}
			}
		}
		
		return false;
		
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
		
		//创建新的账户对象
		Account destAccount = new Account(destId, null);
		
		//判断目的账户是否存在
		if(!accounts.contains(destAccount)){
			throw new AccountException("目的账户不存在，无法转账");
		}
		
		//填充目的账户的余额
		for (int i = 0; i < accounts.size(); i++) {
			
			Account account = accounts.get(i);
			
			if (account.equals(destAccount)){   //id相同
				
				destAccount = account;
			}
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
