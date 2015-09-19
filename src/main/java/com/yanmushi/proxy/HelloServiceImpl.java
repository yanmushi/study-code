/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.proxy;

/**
 * 接口的目标实现
 * @author YanMushi
 */
public class HelloServiceImpl implements HelloService {

	@Override
	public void say() {
		System.out.println("hello wolrd!");
	}

}
