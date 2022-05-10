package com.ecommerce.service.api.service;


import com.ecommerce.service.api.entity.Product;
import com.ecommerce.service.api.entity.ShoppingCart;

public class ResponseTemplateVO {

	
	private Product product;
	private ShoppingCart shoppingCart;
	
	
	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}
	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	


}
