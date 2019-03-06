package com.neuedu.java09.bank;

//ҵ����
public class Service {

	//�˻�����
	private static Account[] accounts = new Account[Constant.ACCOUNT_CAPACITY];
		
	//�˻�����Ŀ��ô�С
	private static int accountSize = 0;
		
	static{
		accounts[0] = new Account("111", "1", 100);
		accounts[1] = new Account("222", "2", 20);
		accountSize = 2;
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
		
		//������˻��Ŀ����Ƿ����
		for (int i = 0; i < accounts.length; i++) {
			
			if(accounts[i]!=null){
				
				if(accounts[i].getId().equals(id)){  //�����Ѵ���
					throw new AccountException("�����Ѵ���");
				}
			}
		}
		
		//�ж������Ƿ���
		if(accountSize >= Constant.ACCOUNT_CAPACITY){
			throw new AccountException("�˻������������޷�ע��");
		}
		
		//�����µ��˻�����
		Account account = new Account(id, password);
		
		//��ӵ��˻�������
		accounts[accountSize++] = account;
		
		return true;
		
	}
	
	public boolean login(String id, String password) throws AccountException{
		
		//������˻��Ŀ����Ƿ����
		boolean existFlag = false;
	
		for (int i = 0; i < accounts.length; i++) {
			
			if(accounts[i]!=null){
				
				if(accounts[i].getId().equals(id)){  //�����Ѵ���
					existFlag = true;
					currentAccount = accounts[i];
					break;
				}
			}
		}
		
		if(existFlag){
			
			if(password.equals(currentAccount.getPassword())){
				
				//��¼�ɹ�
				return true;
				
			}else{
				throw new AccountException("���벻��ȷ");
			}
		}else{
			throw new AccountException("���Ų�����");
		}
		
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
		
		//�ж�Ŀ���˻��Ƿ����
		boolean existFlag = false;
		
		Account destAccount = null;
		for (int i = 0; i < accounts.length; i++) {
			
			if(accounts[i]!=null){
				
				if(accounts[i].getId().equals(destId)){  //�����Ѵ���
					existFlag = true;
					destAccount = accounts[i];
					break;
				}
			}
		}
	
		if(!existFlag){
			throw new AccountException("Ŀ���˻������ڣ��޷�ת��");
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
