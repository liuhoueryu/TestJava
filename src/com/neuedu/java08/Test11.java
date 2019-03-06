package com.neuedu.java08;

import com.neuedu.util.StringUtil;

//Runtime类
public class Test11 {

	public static void main(String[] args) {

		//获取Runtime类的实例
		Runtime rt = Runtime.getRuntime();
		
	/*	try {
			
			//启动程序
			Process p = rt.exec("c:/windows/notepad.exe");
			
			//延迟三秒钟
			Thread.sleep(3000);
			
			//停止程序
			p.destroy();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}*/
		
		//JVM的内存
		System.out.println("最大内存=" + StringUtil.convertFilesize(rt.maxMemory()));
	    System.out.println("总内存=" + StringUtil.convertFilesize(rt.totalMemory()));
		System.out.println("空闲内存=" + StringUtil.convertFilesize(rt.freeMemory()));
		
		
	}

}
