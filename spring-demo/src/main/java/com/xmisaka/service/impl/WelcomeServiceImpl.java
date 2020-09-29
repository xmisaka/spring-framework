package com.xmisaka.service.impl;

import com.xmisaka.service.WelcomeService;

/**
 * @author wangmingx
 * @date 2020-09-29 14:56
 */
public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String sayHello(String name) {
		System.out.println("欢迎你：" + name);
		return "success";
	}
}
