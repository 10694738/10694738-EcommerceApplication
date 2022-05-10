package com.ecommerce.service.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.client.RestTemplate;

import com.ecommerce.service.api.entity.Product;
import com.ecommerce.service.api.repository.ProductRepo;
//import com.ecommerce.service.api.entity.ShoppingCart;
import com.ecommerce.service.api.service.IService;
import com.ecommerce.service.api.service.IServiceImpl;
import com.ecommerce.service.api.service.ResponseTemplateVO;


@RestController
@RequestMapping("/cart")
public class CartController {
	

	@Autowired
	IServiceImpl service;
	
	@Autowired
	IService iservice;
	
	// 3. Can add Products to Shopping Cart by produc id and quantity
	// http://localhost:9596/addshoppingcart/101/quntity/5
	@GetMapping("/addshoppingcart/{add}/quntity/{quntity}")
	public String addShoppinrgCart(@PathVariable("add") int id, @PathVariable("quntity") int quntity) {

		// service

		System.out.println("CartController.addShoppinrgCart()");

		String find = service.addShoppinrgCart(id, quntity);
		return find;
	}

	// 4. Can check out Shopping Cart
	// http://localhost:9596/shoppingcart
	@GetMapping("/shoppingcart")
	public List<Product> shoppinrgCart() {
		List<Product> find = service.shoppinrgCart();
		return find;
	}

	// http://localhost:9596/removeItem/1
	@DeleteMapping("/removeItem/{item}")
	public String removeShoppinrgCart(@PathVariable("item") int id) {
		String find = service.removeShoppinrgCart(id);
		return find;
	}
	

	
	


	
	@GetMapping("/{id}")
	public ResponseTemplateVO getcartwithProduct(@PathVariable ("id") int productid) {
		System.out.println(productid);
		return iservice.getcartwithProduct(productid);
		
	
	}

}
