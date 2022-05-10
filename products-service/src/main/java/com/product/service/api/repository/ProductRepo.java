package com.product.service.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.service.api.entity.Product;



@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {


}
