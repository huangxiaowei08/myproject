package com.design_pattern.observer.java_observer;

/**
 * java自带的观察者模式
 */
public class Client {
	public static void main(String[] args) {
		TeacherSubject teacherSubject = new TeacherSubject();
		new StudentSubject("aa", teacherSubject);
		new StudentSubject("bb", teacherSubject);
		new StudentSubject("cc", teacherSubject);
		
		teacherSubject.setHomework("lesson 1");
		teacherSubject.setHomework("lesson 2");
	}
}
