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
public class DeserializeMain {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	 

		/*************************************
		 * Reading file
		 *************************************/

		FileInputStream ifstream = new FileInputStream("object_datafile.txt");
		ObjectInputStream iostream = new ObjectInputStream(ifstream);

		ObjectToSerialize data[] = new ObjectToSerialize[3];

		for (int i = 0; i < 3; i++) {
			data[i] = (ObjectToSerialize) iostream.readObject();
			System.out.println(data[i].getNum() + " " + data[i].getWord() + " " + data[i].getCharacter()+" "+ data[i].i);
		}
	}
}
