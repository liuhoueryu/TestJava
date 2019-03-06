package com.neuedu.java11;

import java.io.File;
import java.io.FilenameFilter;

public class MyFilenameFilter implements FilenameFilter {

	private String suffix;   //���
	
	public MyFilenameFilter(String suffix) {
		super();
		this.suffix = suffix;    //ע��
	}

	@Override
	public boolean accept(File dir, String name) {
		//System.out.println("accept()�����ڵ��á�����");
		
		//System.out.println(name);
		
		File file = new File(dir, name);
		
		return file.isFile() && name.endsWith(suffix);
	}

}
