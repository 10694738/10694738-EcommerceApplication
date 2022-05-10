package com.ecommerce.service.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.service.api.entity.Buyer;
import com.ecommerce.service.api.entity.Product;



@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

	//List<Product> findBypName(String product1);
	
	//public Product findBypSellerId(int id);

	//Buyer findByUserId(Integer userId);
	
	//public List<Product> findByCategoryid(int id);

}
