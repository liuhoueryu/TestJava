package com.neuedu.java10.bank;

import java.util.ArrayList;
import java.util.List;

//ҵ����
public class Service {

	//�˻�����
	private static List<Account> accounts = new ArrayList<>();
		
	static{
		accounts.add(new Account("111", "1", 100));
		accounts.add(new Account("222", "2", 20));
	}
	
	//����
	private Service(){
	}
	private static Service instance = new Service();
	
	public static Service getInstance(){
		return instance;
	}
	
	//��ǰ�˻�
	private Account currentAccount = null;
	
	public boolean register(String id, String password) throws AccountException{
		
		//�����µ��˻�����
		Account account = new Account(id, password);
		
		if(accounts.contains(account)){
			throw new AccountException("�����Ѵ���");
		}
		
		//��ӵ��˻�������
		accounts.add(account);
		
		return true;
		
	}
	
	public boolean login(String id, String password) throws AccountException{
		
		//�����µ��˻�����
		Account account = new Account(id, password);
		
		if(!accounts.contains(account)){
			throw new AccountException("���Ų�����");
		}
		
		for (int i = 0; i < accounts.size(); i++) {
			
			currentAccount = accounts.get(i);
			
			if (currentAccount.equals(account)){   //id��ͬ
				
				if(currentAccount.getPassword().equals(account.getPassword())){  //����һ��
					return true;
				}else{
					throw new AccountException("���벻��ȷ");
				}
			}
		}
		
		return false;
		
	}
	
	public void query() {
		System.out.println("��ǰ���=" + currentAccount.getAmount() + "Ԫ");
	}
		
	public void save(int amount) {
		System.out.println("���֮ǰ�����=" + currentAccount.getAmount() + "Ԫ");
		currentAccount.setAmount(currentAccount.getAmount() + amount);
		System.out.println("���֮������=" + currentAccount.getAmount() + "Ԫ");
	}
	
	public void withdraw(int amount) throws AccountException {
		
		//�ж�����Ƿ���
		if(amount > currentAccount.getAmount()){
			throw new AccountException("���㣬�޷�ȡ��");
		}
		
		System.out.println("ȡ��֮ǰ�����=" + currentAccount.getAmount() + "Ԫ");
		currentAccount.setAmount(currentAccount.getAmount() - amount);
		System.out.println("ȡ��֮������=" + currentAccount.getAmount() + "Ԫ");
	}
	
	public void transfer(String destId, int amount) throws AccountException {
		
		//�����µ��˻�����
		Account destAccount = new Account(destId, null);
		
		//�ж�Ŀ���˻��Ƿ����
		if(!accounts.contains(destAccount)){
			throw new AccountException("Ŀ���˻������ڣ��޷�ת��");
		}
		
		//���Ŀ���˻������
		for (int i = 0; i < accounts.size(); i++) {
			
			Account account = accounts.get(i);
			
			if (account.equals(destAccount)){   //id��ͬ
				
				destAccount = account;
			}
		}
	
		//�ж�����Ƿ���
		if(amount > currentAccount.getAmount()){
			throw new AccountException("���㣬�޷�ת��");
		}
		
		System.out.println("ת��֮ǰ�����=" + currentAccount.getAmount() + "Ԫ");
		currentAccount.setAmount(currentAccount.getAmount() - amount);
		destAccount.setAmount(destAccount.getAmount() + amount);
		System.out.println("ת��֮������=" + currentAccount.getAmount() + "Ԫ");
		
		
	}
	
}
