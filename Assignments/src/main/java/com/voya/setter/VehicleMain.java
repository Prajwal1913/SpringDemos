package com.voya.setter;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.voya.setter.Vehicle;

public class VehicleMain {
public static void main(String[] args) {
	ApplicationContext context = new AnnotationConfigApplicationContext("com.voya.setter");
	Vehicle vehicle = (Vehicle) context.getBean("vehicle");
	
	Vehicle vehicle2 = context.getBean("vehicle",Vehicle.class);

	vehicle2 = context.getBean(Vehicle.class);
	System.out.println(vehicle2);
	
	String[] beans = context.getBeanDefinitionNames();
	for(String bean:beans) {
		System.out.println(bean);
	}
}
}
