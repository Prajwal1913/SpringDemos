package com.insuranceapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.insuranceapp.exception.InsuranceNotFoundException;
import com.insuranceapp.model.Insurance;

@Mapper
public interface IInsuranceRepository {
	
	@Insert("insert into Insurance(insuranceId,policyName,brand,type,duration,premium) values(#{insuranceId},#{policyName},#{brand},#{type},#{duration},#{premium})")
	void addInsurance(Insurance insurance);
	
	@Update("update insurance set premium=#{premium} where insuranceId=#{insuranceId}")
	void updateInsurance(int insuranceId, double premium);
	
	@Delete("delete from insurance where insuranceId=#{insuranceId}")
	void deleteInsurance(int insuranceId);
	
	@Select("select * from insurance")
	@Results({
			@Result(property = "insuranceId",column ="insuranceId"),
			@Result(property = "policyName",column ="policyName")
	})
	List<Insurance> findAll();
	
	@Select("select * from insurance where brand=#{brand}")
	@Results({
		@Result(property = "brand",column ="brand")
	})
	List<Insurance> findByBrand(String brand) throws InsuranceNotFoundException;
	
	@Select("select * from insurance where brand=#{brand} And type=#{type}")
	List<Insurance> findByBrandAndType(String brand,String type) throws InsuranceNotFoundException;
	
	@Select("select * from insurance where type=#{type} And premium<=#{premium}")
	List<Insurance> findByTypeAndLesserPremium(String brand, double premium) throws InsuranceNotFoundException;
	
	@Select("select * from insurance where insuranceId=#{insuranceId}")
	Insurance findById(int insuranceId)  throws InsuranceNotFoundException;

}
