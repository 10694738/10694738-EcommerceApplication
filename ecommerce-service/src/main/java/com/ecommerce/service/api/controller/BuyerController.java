package com.ecommerce.service.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ecommerce.service.api.entity.Product;
import com.ecommerce.service.api.entity.PurchesHistory;
import com.ecommerce.service.api.service.IService;
import com.ecommerce.service.api.service.IServiceImpl;



@RestController
@RequestMapping("/buyer")
public class BuyerController {
	
//
//	@Autowired
//	RestTemplate restTemplate;
//    
	@Autowired
	IService iService;
	
	@Autowired
	IServiceImpl service;

	// PurchaseProduct
	@GetMapping("/purchaseproduct/{id}/quentity/{quentity}")
	public String purchaseProduct(@PathVariable("id") int id, @PathVariable("quentity") int quentity) {
		String string = service.purchaseProduct(id, quentity);
		return string;
	}
//
//	// purches History
	@GetMapping("/gethistory")
	public List<PurchesHistory> getPHistory() {
		List<PurchesHistory> serch = service.history();
		return serch;

	}
	
//	@GetMapping("/getallproducts")
//	public ResponseEntity<Object> getProductList() {
//		System.out.println("Get all products/****");
//	HttpHeaders headers = new HttpHeaders();
//	headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//	HttpEntity <String> entity = new HttpEntity<String>(headers);
//    System.out.println("Get all products/****");
//	return restTemplate.getForObject("http://localhost:8084/product/getproduct", HttpMethod.GET, entity, String.class).getBody();
	
//	Product product= restTemplate.getForObject("http://product-service/product/getproduct", Product.class);
//
//		return new ResponseEntity<Object>(product,HttpStatus.OK);
//	
//	}
//	
//	@GetMapping("/getAllProducts")
//	public List<Product> getAllProducts(){
//
//	return service.getAllProducts();
//	}

	
}
