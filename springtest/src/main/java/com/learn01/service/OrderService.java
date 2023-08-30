package com.learn01.service;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/12/8
 */
@Component
public class OrderService implements SmartInitializingSingleton {

	@Override
	public void afterSingletonsInstantiated() {
		System.out.println("orderService初始化之前执行");
	}
}
