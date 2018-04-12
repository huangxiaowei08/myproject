package com.design_pattern.adapter;
/**
 * 继承了一个类，由于java的单继承，这种模式成为类适配模式
 * 
 */
public class PersonAdapter extends Person implements Job{

	@Override
	public void speakFrench() {
		System.out.println("I am adapter, I can speak French!");
	}

}
