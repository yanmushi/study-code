/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.proxy.jdkstatic;

import com.yanmushi.proxy.CustomAspect;
import com.yanmushi.proxy.HelloService;

/**
 * 
 * @author YanMushi
 */
public class JDKStaticHelloServiceProxy implements HelloService {

	private HelloService helloService;
	private CustomAspect customAspect = new CustomAspect();
	
	public JDKStaticHelloServiceProxy(HelloService helloService) {
		this.helloService = helloService;
	}
	
	@Override
	public void say() {
		customAspect.adviceMsg("jdk-static");
		helloService.say();
	}

	
}
