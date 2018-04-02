package com.design_pattern.observer.java_observer;

import java.util.Observable;

// 被观察者
public class TeacherSubject extends Observable{
	
	private String info;
	
	public void setHomework(String info) {
		this.info = info;
		System.out.println("homework is -->"+info);
		setChanged();
		notifyObservers();
	}

	public String getInfo() {
		return info;
	}

}
