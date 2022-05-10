package com.product.service.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.service.api.entity.ShoppingCart;


@Repository
public interface ShoppingCartRepo extends JpaRepository<ShoppingCart, Integer>{

	
}
