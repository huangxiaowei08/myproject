package com.design_pattern.proxy.static_proxy;

public class Client {
	
	public static void main(String[] args) {
		ProxySubject proxySubject = new ProxySubject(new RealSubject());
		proxySubject.visit();
	}

}
