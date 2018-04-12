package com.design_pattern.adapter;
/**
 * 对象的适配器模式，把“源”作为一个对象聚合到适配器类中
 * 类的适配模式，用于单一源的适配，由于源单一，代码实现不用写选择逻辑，很清晰
 * 对象的适配模式，可用于多源的适配，弥补了类适配模式的不足，是的原本用类适配模式
 * 需要写很多适配器的情况不复存在，缺点是：由于源的数目较多，所以具体的实现条件选择分支
 * 比较多，相对复杂
 */
public class PersonAdapter4Object implements Job{

	private Person person;
	
	public PersonAdapter4Object(Person person) {
		this.person = person;
	}
	
	@Override
	public void speakChinese() {
		person.speakChinese();
	}

	@Override
	public void speakEnglish() {
		person.speakEnglish();
	}

	@Override
	public void speakFrench() {
		System.out.println("I am adapter, I can speak French!");
	}

}
