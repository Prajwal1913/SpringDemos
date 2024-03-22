package com.insuranceapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.insuranceapp.model.Insurance;
import com.insuranceapp.repository.IInsuranceRepository;

@SpringBootApplication
public class SpringInsuranceappRestmybatiesApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringInsuranceappRestmybatiesApplication.class, args);
	}
	@Autowired
	private IInsuranceRepository insuranceRepository;

	@Override
	public void run(String... args) throws Exception {
//		Insurance insurance = new Insurance(103,"FI-ABR4","Fidelitv","wealth",9,200000);
//		insuranceRepository.addInsurance(insurance);
//		System.out.println(insurance);
		
		//updateing the values of price by id 
		insuranceRepository.updateInsurance(103, 500000);
		
	}

}
