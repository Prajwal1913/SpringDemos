package com.productapp.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.productapp.exception.ProductNotFoundException;
import com.productapp.model.Product;

@Mapper
public interface IProductRepository {
	
	@Insert("insert into product(productId,productName,brand,price,category) values(#{productId},#{productName},#{brand},#{price},#{category})")
	void addProduct(Product product);
	
	@Update("update product set price=#{price} where productId=#{productId}")
	void updateProduct(int productId, double price);
	
	@Delete("delete from product where productId=#{productId}")
	void deleteProduct(int productId);
	
	@Select("select * from product where productId=#{productId}")
	Product findById(int productId) throws ProductNotFoundException;
	
	@Select("select * from product")
	List<Product> findAll();
	
	@Select("select * from product where brand=#{brand}")
	List<Product> findByBrand(String brand)  throws ProductNotFoundException;
	
	@Select("select * from product where price<=#{price}")
	List<Product> findByLessPrice(double price)  throws ProductNotFoundException;
	
	@Select("select * from product where category=#{category} And price>=#{price}")
	List<Product> findByCategoryandPrice(String category, double price)  throws ProductNotFoundException;
}
