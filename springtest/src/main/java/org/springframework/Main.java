package org.springframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.service.Aservice;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext("org.springframework.service");
		Aservice bean = context.getBean(Aservice.class);
		bean.printA();
	}
}