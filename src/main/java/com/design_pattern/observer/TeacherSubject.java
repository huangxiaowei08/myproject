package com.design_pattern.observer;

import java.util.ArrayList;
import java.util.List;


public class TeacherSubject implements Subject{
	
	// 用来存放和记录观察者
	private List<Observer> observerList = new ArrayList<>();
	
	// 记录状态的字符串
	private String info;

	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	/**
	 * 删除功能考虑要全面，不是删除就是直接删除，判断呢
	 */
	@Override
	public void removeObserver(Observer observer) {
		int position = observerList.indexOf(observer);
		if(position > 0) {
			observerList.remove(observer);
		}
		
	}

	@Override
	public void notifyAllObserver() {
		for(Observer observer : observerList) {
			observer.update(info);
		}
	}
	
	public void setHomework(String info) {
		this.info = info;
		System.out.println("homework is-->"+info);
		this.notifyAllObserver();
	}

}
