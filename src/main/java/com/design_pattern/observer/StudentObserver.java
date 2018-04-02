package com.design_pattern.observer;

public class StudentObserver implements Observer{
	
	// 保存一个subject的引用，以后要是想取消订阅的话，有了这个引用比较方便
	private Subject teacherSubject;
	
	// 学生的姓名，用来标识不同的学生对象
	private String name;
	
	// 构造器用来注册观察者
	public StudentObserver(String name, Subject teacherSubject) {
		this.name = name;
		this.teacherSubject = teacherSubject;
		// 每新建一个学生对象，默认添加到观察者队列
		teacherSubject.addObserver(this);
	}

	@Override
	public void update(String info) {
		System.out.println(name + " get homework: "+info);
	}

}
