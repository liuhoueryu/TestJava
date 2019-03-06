package com.neuedu.java11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//ObjectInputStream和ObjectOutputStream
public class Test15 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObject();
		readObject();
	}
	
	static void writeObject() throws IOException{
		
		User user = new User("user1", 10, new Address("天津市", "和平区"));
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d:/test/object.txt"));
		oos.writeObject(user);
		oos.close();
	}
	
	static void readObject() throws IOException, ClassNotFoundException{
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d:/test/object.txt"));
		User user = (User)ois.readObject();
		System.out.println(user);
		ois.close();
	}

}
