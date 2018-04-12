package com.design_pattern.adapter;

public class Client4ClassAdapter {
	
	public static void main(String[] args) {
		Person person = new Person();
		person.speakChinese();
		person.speakEnglish();
		
		PersonAdapter personAdapter = new PersonAdapter();
		personAdapter.speakChinese();
		personAdapter.speakEnglish();
		personAdapter.speakFrench();
	}

}
