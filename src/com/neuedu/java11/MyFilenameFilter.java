package com.neuedu.java11;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {

	private String suffix;   //组合
	
	public MyFilenameFilter(String suffix) {
		super();
		this.suffix = suffix;    //注入
	}

	@Override
	public boolean accept(File dir, String name) {
		//System.out.println("accept()方法内调用。。。");
		
		//System.out.println(name);
		
		File file = new File(dir, name);
		
		return file.isFile() && name.endsWith(suffix);
	}

}
