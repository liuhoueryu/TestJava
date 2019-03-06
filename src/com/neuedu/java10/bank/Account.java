package com.neuedu.java10.bank;

public class Account {

	private String id;
	private String password;
	private Integer amount = 0;

	
	public Account(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	
	
	public Account(String id, String password, Integer amount) {
		super();
		this.id = id;
		this.password = password;
		this.amount = amount;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", password=" + password + ", amount=" + amount + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Account other = (Account) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
}
