/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.proxy.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.yanmushi.proxy.CustomAspect;

/**
 * 通过JDK动态代理的方式<br>
 * 此时通过动态代理，支持具有某个类型的消息。对于接口中多个方法，代理起来比静态代码方便了很多。
 * @author YanMushi
 */
public class JDKDynamicHelloServiceProxy implements InvocationHandler {

	private CustomAspect customAspect = new CustomAspect();
	
	private Object targetObject; // 代理的目标对象
	
	public JDKDynamicHelloServiceProxy(Object target) {
		this.targetObject = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		customAspect.adviceMsg("jdk-dynamic");
		
		return method.invoke(targetObject, args);
	}

	// 提供一个获取代理的入口
	public Object getProxy() {
		return Proxy.newProxyInstance(getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
	}
}
