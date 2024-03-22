package com.insuranceapp.service;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insuranceapp.model.Insurance;

@Service
public class InsuranceServiceImpl implements IInsuranceService{

	
	@Override
	public List<Insurance> getAll() {
		return getAllInsurance();
	}

	@Override
	public Insurance getById(int insuranceId) {
		List<Insurance> insurance = getAllInsurance();
		for(Insurance insurances : insurance ) {
			return insurances;
		}
		return null;
		
	}

	private List<Insurance> getAllInsurance(){
		return Arrays.asList(
				new Insurance(101,"VO-H001","voya","health",10,100000),
				new Insurance(102,"BJ-H1N1","Bajaj","personal",8,150000),
				new Insurance(103,"FI-ABR4","Fidelitv","wealth",9,200000),
				new Insurance(104,"MU-K900","Mutooth","gold",10,150000),
				new Insurance(105,"KF-M118","KotakFin","life",7,500000)
				);
	}
}
