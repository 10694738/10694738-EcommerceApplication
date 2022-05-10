package com.product.service.api.service;

import java.util.List;

import com.product.service.api.entity.Product;
import com.product.service.api.entity.PurchesHistory;



public interface IService {
	
	public List<Product> findAll();
	
	public Product find(int id);
	
	//public List<Product> serch(String product1) ;
	
	public String addShoppinrgCart(int id,int id1);
	
	public List<Product> shoppinrgCart();
	
	public String removeShoppinrgCart(int id);
	
	public Product postProduc(Product product);
	
	//public Product FindProduct(int id);
	
	public String deleteById(int id);
	
	public List<PurchesHistory> history();
	
	//public List<Product> serchProductByCatagory(int id);

	String purchaseProduct(int id,int que);
	

}
