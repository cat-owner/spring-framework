package com.circular.dependency;

import com.circular.dependency.service.OrderService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2023/9/1
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		OrderService orderService =(OrderService) context.getBean("orderService");
		//orderService.test();
	}
}
