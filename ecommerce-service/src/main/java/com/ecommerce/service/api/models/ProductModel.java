package com.ecommerce.service.api.models;


import java.util.ArrayList;
import java.util.List;

import com.ecommerce.service.api.entity.Product;




public class ProductModel {

	private List<Product> products;

	public List<Product> findAll() {
		return this.products;
	}

	public Product find(String id) {
		
	
		return null;
	}
public List<Product> serch(String product1) {
	
		ArrayList <Product> al=new ArrayList<>();
		
		
		if(al.isEmpty()) return null; 
		else return al;
	}

}
