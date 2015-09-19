/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.proxy.springaop;

import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * 
 * @author YanMushi
 */
public class SpringAopHelloServiceProxy {

	@SuppressWarnings("unchecked")
	public static <T> T getProxy(Class<T> clz, Object target) {
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new HelloBeforeAdvice());
		pf.setTarget(target);
		return (T) pf.getProxy();
	}
	
	@SuppressWarnings("unchecked")
	public static <T> T getProxyByFactory(Class<T> clz, Object target) {
		ProxyFactoryBean bean = new ProxyFactoryBean();
		bean.setInterfaces(clz.getInterfaces());
		bean.setTarget(target);
//		bean.setInterceptorNames("");
		return (T) bean.getObject();
	}
}
