package com.neuedu.java10;

public class WordItem {

	private String content;
	private Integer count;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "WordItem [content=" + content + ", count=" + count + "]";
	}
	public WordItem(String content, Integer count) {
		super();
		this.content = content;
		this.count = count;
	}
	
	
}
