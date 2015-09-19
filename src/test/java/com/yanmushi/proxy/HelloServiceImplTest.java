/*
 * Copyright (c) 2014 中国国际图书贸易集团公司 
 * All rights reserved.
 *  
 */
package com.yanmushi.proxy;

import org.junit.Test;

import com.yanmushi.proxy.cglib.CglibHelloServiceProxy;
import com.yanmushi.proxy.jdkdynamic.JDKDynamicHelloServiceProxy;
import com.yanmushi.proxy.jdkstatic.JDKStaticHelloServiceProxy;
import com.yanmushi.proxy.springaop.SpringAopHelloServiceProxy;

/**
 * <p>标题： HelloServiceImplTest</p>
 * <p>
 *    功能描述：
 *    
 * </p>
 * <p>创建日期：2015年9月15日 上午9:58:40 </p>
 * <p>作者：YinLei</p>
 * <p>版本：1.0</p>
 */
public class HelloServiceImplTest {

	@Test
	public void test() {
		HelloService hs = new HelloServiceImpl();
		
		JDKStaticHelloServiceProxy jsp = new JDKStaticHelloServiceProxy(hs);
		jsp.say();
		
		JDKDynamicHelloServiceProxy jdp = new JDKDynamicHelloServiceProxy(hs);
		((HelloService)jdp.getProxy()).say();
		
		HelloService hs2 = CglibHelloServiceProxy.create(HelloServiceImpl.class);
		hs2.say();

		HelloService hs3 = SpringAopHelloServiceProxy.getProxy(HelloService.class, hs);
		hs3.say();
		 hs3 = SpringAopHelloServiceProxy.getProxyByFactory(HelloService.class, hs);
		hs3.say();
	}

}
