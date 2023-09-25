package com.circular.dependency.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2023/9/1
 */
@Component
public class OrderService {

	@Autowired
	public OrderService(UserService userService) {
		System.out.println("test1");
	}
	@Autowired(required = false)
	public OrderService(UserService userService, UserService userService1) {
		System.out.println("test2");
	}

	public OrderService() {
		System.out.println("test3");

	}
}
