package com.circular.dependency;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2023/9/1
 */
@ComponentScan("com.circular.dependency")
@EnableAsync
public class BeanConfig {
}
