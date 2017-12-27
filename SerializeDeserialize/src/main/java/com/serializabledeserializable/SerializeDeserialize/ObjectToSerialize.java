package com.serializabledeserializable.SerializeDeserialize;

import java.io.Serializable;

public class ObjectToSerialize implements Serializable {
	private int num;
	private String word;
	private char character;

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
