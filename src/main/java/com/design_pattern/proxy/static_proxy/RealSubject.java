package com.design_pattern.proxy.static_proxy;

public class RealSubject implements Subject{
	
	private String name = "tom";

	@Override
	public void visit() {
		System.out.println("this is " + name);
	}

}
