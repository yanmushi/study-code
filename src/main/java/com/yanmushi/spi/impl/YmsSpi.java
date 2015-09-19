/*
 * Copyright (c) 2014-2015 YanMushi 
 * All rights reserved.
 */
package com.yanmushi.spi.impl;

import com.yanmushi.spi.HelloSpi;

/**
 * 
 * @author YanMushi
 */
public class YmsSpi implements HelloSpi {

	@Override
	public void say() {
		System.out.println("hello yms!");
	}

}
