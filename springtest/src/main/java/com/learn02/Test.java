package com.learn02;

import com.learn02.service.OrderService;
import com.learn02.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2023/2/17
 */
public class Test {
	public static void main(String[] args) {
		/**
		 * 1：扫描;2：创建非懒加载的bean;
		 */
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThirdConfig.class);
		OrderService orderService = context.getBean(OrderService.class);
		System.out.println(orderService);

	}
}
