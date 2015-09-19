/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.proxy.cglib;

import java.lang.reflect.Method;

import com.yanmushi.proxy.CustomAspect;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 通过cglib的方式代理<br>
 * 可以代理一个类，不要求实现接口
 * @author YanMushi
 */
public class CglibHelloServiceProxy implements MethodInterceptor {

	private static CglibHelloServiceProxy proxy = new CglibHelloServiceProxy();
	private CustomAspect customAspect = new CustomAspect();
	
	@SuppressWarnings("unchecked")
	public static <T> T create(Class<T> clz) {
		return (T) Enhancer.create(clz, proxy);
	}
	
	public static CglibHelloServiceProxy getProxy() {
		return proxy;
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		customAspect.adviceMsg("cglib");
		return proxy.invokeSuper(obj, args);
	}
	
	private CglibHelloServiceProxy() {}
}
