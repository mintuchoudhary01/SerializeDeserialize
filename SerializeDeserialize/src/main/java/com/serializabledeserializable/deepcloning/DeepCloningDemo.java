package com.serializabledeserializable.deepcloning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Parent {
	int i;
}

class Child extends Parent implements Serializable {
	  int j;

	public Child(int i, int j) {
		this.i = i;
		this.j = j;
	}
}

public class DeepCloningDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fstream = new FileOutputStream("test.txt");
		ObjectOutputStream ostream = new ObjectOutputStream(fstream);
		Child child = new Child(20, 50);

		System.out.println("before: " + child.i + " " + child.j);
		ostream.writeObject(child);

		// De
		FileInputStream ifstream = new FileInputStream("test.txt");
		ObjectInputStream iostream = new ObjectInputStream(ifstream);
		Child clone = (Child) iostream.readObject();

		System.out.println("after: " + clone.i + " " + clone.j);

	}
}
