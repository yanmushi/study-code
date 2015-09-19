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
 * 
 * @author YanMushi
 */
public class JDKDynamicHelloServiceProxy implements InvocationHandler {

	private CustomAspect customAspect = new CustomAspect();
	
	private Object targetObject;
	
	public JDKDynamicHelloServiceProxy(Object target) {
		this.targetObject = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		customAspect.adviceMsg("jdk-dynamic");
		
		return method.invoke(targetObject, args);
	}

	public Object getProxy() {
		return Proxy.newProxyInstance(getClass().getClassLoader(), targetObject.getClass().getInterfaces(), this);
	}
}
