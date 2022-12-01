package spring.source;

/**
 * @author: wangyuancun
 * @description: java类作用描述
 * @date: 2022/12/1
 */
public class ContextTagTest {
	public static void main(String[] args) {
		MyClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("spring.xml");
		MySimpleDriverDataSource dataSource =(MySimpleDriverDataSource) applicationContext.getBean("dataSource");
		System.out.println("Url: "+ dataSource.getUrl());
		System.out.println("User "+ dataSource.getUsername());
		System.out.println("Password: "+ dataSource.getPassword());

	}
}
