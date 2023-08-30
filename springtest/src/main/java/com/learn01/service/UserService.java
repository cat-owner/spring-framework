package com.learn01.service;

import com.learn01.model.User;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/12/8
 */
@Component
public class UserService implements SmartInitializingSingleton {
	private final OrderService orderService;

	public UserService(OrderService orderService) {
		this.orderService = orderService;
	}

	public void test(){
		System.out.println(orderService);
	}

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("初始化之前实现UserService");
	}
}
