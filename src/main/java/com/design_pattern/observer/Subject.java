package com.design_pattern.observer;

/**
 * 观察者模式中有主题(Subject)和观察者(Observer),分别对应报社和订阅用户(你).
 * 观察者模式定义了对象之间的一对多的依赖关系,这样,当"一"的一方状态发生变化时,
 * 它所依赖的"多"的一方都会收到通知并且自动更新
 * 主题接口和实现类中,一般需要有addObserver(),deleteObserver(),notifyObserver();
 * 用来注册删除观察者以及在主题状态发生变化时通知所有的观察者对象.
 */
// 主题
public interface Subject {
	
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyAllObserver();

}
