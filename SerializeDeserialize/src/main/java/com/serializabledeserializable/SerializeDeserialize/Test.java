/*package com.serializabledeserializable.SerializeDeserialize;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Employee {

	int id;
	String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		System.out.println("in hascode");
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public void setName(String name) {
		this.name = name;
	}

}
public class Test implements Serializable{

	public static void main(String args[]) {
		Employee e1 = new Employee();

		e1.setId(1);
		e1.setName("Ashish");

		HashMap hm = new HashMap();
		hm.put(e1, "Ashish");
		System.out.println(e1.hashCode());
	//	e1.setName("Ashish");

		System.out.println(e1.hashCode());
		System.out.println(hm.get(e1));
		
		
		ObjectMapper mapper = new ObjectMapper();

		//Object to JSON in file
	//	mapper.writeValue(new File("c:\\file.json"), e1);

		//Object to JSON in String
		
		try {
			
			Test t1 = new Test();
			FileOutputStream fs = new FileOutputStream("Forest.txt");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(t1);
			
		//	Error er = new Error();
		

			//String jsonInString = mapper.writeValueAsString(e1);
			//System.out.println(jsonInString);
		//	throw new RuntimeException();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("in catch..");
			
			
		}
	}
}
*/