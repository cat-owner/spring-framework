package spring.source;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wangyuancun
 * @description: 测试类
 * @date: 2022/11/4
 */
public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {
	public MyClassPathXmlApplicationContext(String ... configLocations){
		super(configLocations);
	}

	@Override
	protected void initPropertySources() {
		System.out.println("初始化initPropertySources");
		getEnvironment().setRequiredProperties("USER");
	}

	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		super.setAllowBeanDefinitionOverriding(false);
		super.setAllowCircularReferences(false);
		super.customizeBeanFactory(beanFactory);
	}
}
