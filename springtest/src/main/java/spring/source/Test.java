package spring.source;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/11/1
 */
public class Test {
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");

		MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("spring.xml");

	}
}
