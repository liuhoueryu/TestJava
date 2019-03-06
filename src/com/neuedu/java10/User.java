package com.neuedu.java10;

public class User implements Comparable<User> {

	private String name;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public User(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	/*
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("hashCode()被调用了。。。");
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("equals()被调用了。。。");
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	*/
	
	@Override
	public int compareTo(User user) {
		
		return this.age>user.age ? 1 : this.age<user.age ? -1 : 0;
		
		//return -1 * this.name.compareTo(user.name);
		
		//return this.age>user.age ? -1 : this.age<user.age ? 1 : -1 * this.name.compareTo(user.name);
		
	}
	
	
	/*
	public int compareTo(User user){  //当前对象的年龄>user的年龄 返回1   当前对象的年龄=user的年龄 返回0   当前对象的年龄<user的年龄 返回-1 
		
		//return this.age>user.age ? 1 : this.age<user.age ? -1 : 0;
		
		int len1 = this.name.length();
		int len2 = user.name.length();
		
		int minLen = Math.min(len1, len2);
		
		char[] chars1 = this.name.toCharArray();
		char[] chars2 = user.name.toCharArray();
		
		for (int i = 0; i < minLen; i++) {
			char char1 = chars1[i];
			char char2 = chars2[i];
			
			if(char1>char2){
				return 1;
			}else if(char1<char2){
				return -1;
			}
		}
		
		return len1>len2 ? 1 : len1<len2 ? -1 : 0;
		
	}
	 */
	
}
