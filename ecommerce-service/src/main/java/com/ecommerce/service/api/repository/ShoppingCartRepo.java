package com.ecommerce.service.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ecommerce.service.api.entity.ShoppingCart;


@Repository
public interface ShoppingCartRepo extends JpaRepository<ShoppingCart, Integer>{
	@Query("SELECT u FROM ShoppingCart u where u.productid=:c")
	public ShoppingCart findByProductId(@Param("c")int productid);
    
	//ShoppingCart findByProductId1(int productid);

}
