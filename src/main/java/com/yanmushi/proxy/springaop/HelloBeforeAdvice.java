/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.proxy.springaop;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.yanmushi.proxy.CustomAspect;

/**
 * 
 * @author YanMushi
 */
public class HelloBeforeAdvice implements MethodBeforeAdvice {

	private CustomAspect customAspect = new CustomAspect();
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		customAspect.adviceMsg("spring-aop");
	}

}
