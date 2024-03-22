package com.example.auto;

import org.springframework.stereotype.Component;

@Component("shaper")
public class Square implements Shape{

	@Override
	public void area(int x, int y) {
		System.out.println("Area of Square is " +x*x);
		
	}

}
