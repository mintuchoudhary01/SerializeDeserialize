package com.serializabledeserializable.SerializeDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Hello world!
 *
 */
public class ObjectSerializationMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileOutputStream fstream = new FileOutputStream("object_datafile.txt");
		ObjectOutputStream ostream = new ObjectOutputStream(fstream);

		ObjectToSerialize dataObj = new ObjectToSerialize(1, "Mintu", 'm');
		ObjectToSerialize dataObj2 = new ObjectToSerialize(2, "Yogesh", 'y');
		ObjectToSerialize dataObj3 = new ObjectToSerialize(3, "akash", 's');

		System.out.println("Start of writing to file : object_datafile.txt ");
		ostream.writeObject(dataObj);
		ostream.writeObject(dataObj2);
		ostream.writeObject(dataObj3);

		System.out.println("Writing Done to file : object_datafile.txt ");

		ostream.close();
		fstream.close();

		/*************************************
		 * Reading file
		 *************************************/

	/*	FileInputStream ifstream = new FileInputStream("object_datafile.txt");
		ObjectInputStream iostream = new ObjectInputStream(ifstream);

		ObjectToSerialize data[] = new ObjectToSerialize[3];

		for (int i = 0; i < 3; i++) {
			data[i] = (ObjectToSerialize) iostream.readObject();
			System.out.println(data[i].getNum() + " " + data[i].getWord() + " " + data[i].getCharacter());
		}*/
	}
}
