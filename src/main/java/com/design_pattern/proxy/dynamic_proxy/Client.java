package com.design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * https://blog.csdn.net/Rongbo_J/article/details/49203289  JDK和Cglib实现动态代理实例及优缺点分析
 * https://blog.csdn.net/qq_27093465/article/details/53340513 Java动态代理模式jdk和cglib的2种实现以及二者的区别(AOP面向切面的前奏)
 * spring框架用的是cglib实现的动态代理
 */

public class Client {
	
	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		DynamicProxy proxy = new DynamicProxy(realSubject);
		ClassLoader classLoader = realSubject.getClass().getClassLoader();
		Subject dynamicProxy = 
				(Subject) Proxy.newProxyInstance(classLoader, new Class[] {Subject.class}, proxy);
		dynamicProxy.visit();
	}

}
