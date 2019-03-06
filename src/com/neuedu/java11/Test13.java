package com.neuedu.java11;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//DataInputStreamºÍDataOutputStream
public class Test13 {

	public static void main(String[] args) throws IOException {
		readData();
	}

	static void writeData() throws IOException{
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("d:/test/3.txt"));
		
		dos.writeInt(10);
		dos.writeFloat(3.14f);
		dos.writeChar('a');
		dos.writeUTF("hello");
		
		dos.close();
	}
	
	static void readData() throws IOException{
		
		DataInputStream dis = new DataInputStream(new FileInputStream("d:/test/3.txt"));
		
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		System.out.println(dis.readChar());
		System.out.println(dis.readUTF());
		
		dis.close();
	}

}
