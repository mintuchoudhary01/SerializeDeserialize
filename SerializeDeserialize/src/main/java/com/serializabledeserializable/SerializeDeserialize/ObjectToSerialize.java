package com.serializabledeserializable.SerializeDeserialize;

import java.io.Serializable;

class A implements Serializable
{
	int i=77;
	}

public class ObjectToSerialize extends A implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 716325945335333326L;
	
	private int num=10000;
	private String word;
 	private char character;
/*	private int sal;

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}*/

	public ObjectToSerialize(int num, String word, char character) {

		this.num = num;
		this.word = word;
	 	this.character = character;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	 public char getCharacter() {
		return character;
	}

	public void setCharacter(char character) {
		this.character = character;
	}
 
}
