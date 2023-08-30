package com.learn02;

import com.learn02.service.OrderService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2023/8/25
 */
@Configuration
public class ThirdConfig {
	@Bean
	public OrderService getOrderService(){
		return new OrderService();
	}
}
