/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.proxy;

/**
 * @author YanMushi
 */
public class CustomAspect {

	public void adviceMsg(String type) {
		System.out.println("using proxy in [" + type + "]");
	}
}
