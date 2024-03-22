package com.spring.auto;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{

	@Override
	public void area(int x, int y) {
		System.out.println("Area of rectangle is " +x*y);
		
	}

}
