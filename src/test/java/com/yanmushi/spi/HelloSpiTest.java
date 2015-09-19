/*
 * Copyright (c) 2014 中国国际图书贸易集团公司 
 * All rights reserved.
 *  
 */
package com.yanmushi.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

import org.junit.Test;

/**
 * <p>标题： HelloSpiTest</p>
 * <p>
 *    功能描述：
 *    
 * </p>
 * <p>创建日期：2015年9月14日 下午3:53:01 </p>
 * <p>作者：YinLei</p>
 * <p>版本：1.0</p>
 */
public class HelloSpiTest {

	@Test
	public void test() {
		ServiceLoader<HelloSpi> loader = ServiceLoader.load(HelloSpi.class);
		Iterator<HelloSpi> it = loader.iterator();
		
		while (it.hasNext()) {
			it.next().say();
		}
	}

}
