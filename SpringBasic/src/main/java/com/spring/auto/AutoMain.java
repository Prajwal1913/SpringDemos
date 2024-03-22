package com.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoMain {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.auto");
		ShapeFactory factory = context.getBean(ShapeFactory.class);
		factory.printArea("t",4,5);
	}

}
