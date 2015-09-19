/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.proxy;

/**
 * 切面类，提供adviceMsg方法
 * @author YanMushi
 */
public class CustomAspect {

	public void adviceMsg(String type) {
		System.out.println("using proxy in [" + type + "]");
	}
}
