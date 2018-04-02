package com.design_pattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * 利用jdk的反射实现动态代理：
 *  编写一个委托类的接口，即静态代理的（Subject接口）
            实现一个真正的委托类，即静态代理的（RealSubject类）
	创建一个动态代理类，实现InvocationHandler接口，并重写该invoke方法
	在测试类中，生成动态代理的对象。
		创建动态代理的对象，需要借助Proxy.newProxyInstance。该方法的三个参数分别是：
		ClassLoader loader表示当前使用到的appClassloader。
		Class<?>[] interfaces表示目标对象实现的一组接口。
		InvocationHandler h表示当前的InvocationHandler实现实例对象。
 */
public class DynamicProxy implements InvocationHandler {
	
	private Object object;
	
	public DynamicProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(object, args);
		return result;
	}

}
