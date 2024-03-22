package com.spring.auto;

import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape {

	@Override
	public void area(int x, int y) {
		System.out.println("Area of triangle is " +0.5*x*y);
		
	}

}
