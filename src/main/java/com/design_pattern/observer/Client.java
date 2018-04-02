package com.design_pattern.observer;

/**
 * 自己实现的观察者模式
 * 学生观察老师
 */
public class Client {
	
	public static void main(String[] args) {
		TeacherSubject teacherSubject = new TeacherSubject();
		new StudentObserver("aa", teacherSubject);
		new StudentObserver("bb", teacherSubject);
		new StudentObserver("cc", teacherSubject);
		
		teacherSubject.setHomework("lesson 1");
		teacherSubject.setHomework("lesson 2");
	}

}
