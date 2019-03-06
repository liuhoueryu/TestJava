package com.neuedu.java08;

public class User implements Cloneable {

	private String name;
	private int age;
	
	private Address address;    //关联或组合
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		System.out.println("有参的构造器");
	}

	public User(){
		System.out.println("无参的构造器");
	}
		
	public User(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/*@Override
	public boolean equals(Object obj) {
		
		//转型
		User user = (User) obj;
	
		return this.age==user.age && this.name.equals(user.name);
	}
	
	@Override
	public int hashCode() {
		return this.age + this.name.hashCode();
	}*/
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.name + "要回收了。。。");
		this.name = null;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
}
