package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.auto.ShapeFactory;
import com.example.javabased.Waiter;

@SpringBootApplication
public class SpringBootAutowareApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAutowareApplication.class, args);
	}

//	@Autowired
//	private ShapeFactory shapeFactory;
	
	@Autowired
	Waiter waiter;
	@Override
	public void run(String... args) throws Exception {
	//	shapeFactory.printArea("t",4,5);
		List<String> menus = waiter.viewMenucard("chinese");
		for(String menu:menus) {
			System.out.println(menu);
		}
		
	}

}
