package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.spring.constr.Student;
import com.spring.setter.Employee;

@SpringBootApplication(scanBasePackages = {"com.spring","com.example"})
//@ComponentScan({"com"})
public class SpringBootBasicApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootBasicApplication.class, args);
	}

//	@Autowired
//	Employee employee;
	
	@Autowired
	Student student;
//	private ApplicationContext context;
	@Override
	public void run(String... args) throws Exception {
//		String [] beans = context.getBeanDefinitionNames();
//		for(String bean:beans) {
//			System.out.println(bean);
//		}
//		System.out.println(employee);
		System.out.println(student);
	}

}
