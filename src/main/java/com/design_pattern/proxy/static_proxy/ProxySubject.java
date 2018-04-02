package com.design_pattern.proxy.static_proxy;

/**
 * 静态代理
 * 最简单的实现：有一个接口，同时有两个类实现了该接口，其中A类是具体的功能代码
 * 		B类是静态代理类（私有接口类型的变量，
 * 		通过构造方法，接收接口类型的参数，
 * 		在实现接口的方法中调用接口参数的接口中定义的方法）
 * 
 * 调用方式：new出实际功能类的对象，在new代理类对象的时候将实际功能类的对象传入
 * 		代理类对象调用接口中的方法，这样就实现了静态代理
 * 
 * 静态代理的优点：代理类接收一个接口的对象，任何实现了该接口的对象，
 * 			都可以通过代理类进行代理，增加了通用性
 * 
 * 静态代理的缺点：每一个代理类都必须实现一遍功能类所实现的接口，如果接口增加方法，
 * 			代理类也必须跟着修改代码，
 * 			代理类每一个接口对象对应一个功能类对象，如果功能类对象非常多，则静态代理类就
 * 			会非常臃肿，难以胜任
 */
public class ProxySubject implements Subject{

	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void visit() {
		subject.visit();
	}
	

}
