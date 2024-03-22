package com.productapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.productapp.model.Product;
import com.productapp.service.IProductService;

@SpringBootApplication
public class SpringProductappMybatisApplication implements CommandLineRunner{

	@Autowired
	IProductService productService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringProductappMybatisApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//inserting into database
		Product product = new Product(105,"Mobile","Samsung",165000,"Electronics");
		productService.addProduct(product);
		
		//updateing the values of price by id 
//		productService.updateProduct(102, 5000);
		
		//deleting the  values by id
//		productService.deleteProduct(102);
		
		//getting all the values from database
//		List<Product> products = productService.getAll();
//		for(Product allproducts:products)
//			System.out.println(allproducts);
		
		//getting all values by brand
//		List<Product> products = productService.getByBrand("Sony");
//		for(Product allproducts:products)
//			System.out.println(allproducts);

		//getting all values by price less than
//		List<Product> products = productService.getByLessPrice(80000);
//		for(Product allproducts:products)
//			System.out.println(allproducts);
		
		//getting all values by category and price  grater than
//		List<Product> products = productService.getByCategoryandPrice("Electronics",45000);
//		for(Product allproducts:products)
//			System.out.println(allproducts);
		
	}

}
