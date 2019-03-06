package com.neuedu.java11;

import java.io.File;
import java.io.FileFilter;

public class MyFileFilter implements FileFilter {

	private long length;
	
	public MyFileFilter(long length) {
		super();
		this.length = length;
	}

	@Override
	public boolean accept(File pathname) {
		return pathname.isFile() && pathname.length()>length;
	}

}
