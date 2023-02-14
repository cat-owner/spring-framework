package com.learn01;
import com.learn01.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: wangyuancun
 * @description: 测试类
 * @date: 2022/12/8
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		/**
		 * 1：
		 * applicationContext.register(Car.class); 这段代码等同于：
		 * AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(applicationContext);
		 * reader.register(Car.class );
		 *
		 */

		/**
		 * 2：2023.2.8 编程式定义一个bean
		 */
//		AbstractBeanDefinition beanDefinition = BeanDefinitionBuilder.genericBeanDefinition().getBeanDefinition();
//		beanDefinition.setBeanClass(OrderService.class);
//		beanDefinition.setScope("prototype");
//		applicationContext.registerBeanDefinition("orderService",beanDefinition);
//		OrderService orderService = (OrderService)applicationContext.getBean("orderService");
//		System.out.println(orderService);
		/**
		 * 3：2023.2.9 利用 AnnotatedBeanDefinitionReader来定义一个bean;
		 */
//		AnnotatedBeanDefinitionReader reader = new AnnotatedBeanDefinitionReader(applicationContext);
//		reader.register(Car.class );
//		Car car=(Car)applicationContext.getBean("car");
//		System.out.println(car);
		/**
		 * 4：2023.2.9 利用 ClassPathBeanDefinitionScanner来进行扫描
		 */
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		/**
		 * 这个地方需要设置容器的活跃度不然后面getBean()时会检查会报错;
		 */
		//context.refresh();
		/**
		 * ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
		 * scanner.scan("com.learn01");  这两行代码可以用context.scan("com.learn01");这一行代码来代替,
		 * 因为AnnotationConfigApplicationContext已经集成了;
		 */
		//ClassPathBeanDefinitionScanner scanner = new ClassPathBeanDefinitionScanner(context);
		//scanner.scan("com.learn01");
		//Car car = (Car)context.getBean("car");
		//System.out.println(car);
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.test();
	}
}
