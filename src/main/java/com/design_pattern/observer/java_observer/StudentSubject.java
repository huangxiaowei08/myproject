package com.design_pattern.observer.java_observer;

import java.util.Observable;
import java.util.Observer;

public class StudentSubject implements Observer{
	
	private Observable obs;
	
	private String name;
	
	public StudentSubject(String name, Observable obs) {
		this.name = name;
		this.obs = obs;
		obs.addObserver(this);
		
	}

	@Override
	public void update(Observable o, Object arg) {
		TeacherSubject teacherSubject = (TeacherSubject) o;
		System.out.println(name + "get homework: " + teacherSubject.getInfo());
	}

}
