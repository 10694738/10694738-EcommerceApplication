package com.product.service.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.api.entity.Product;
import com.product.service.api.service.IServiceImpl;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	IServiceImpl service;

	// list Of Product
	// http://localhost:9596/product/getproduct
	@GetMapping("/getproduct")
	public List<Product> index() {

		ArrayList<Product> al = new ArrayList();
		System.out.println("Get All Products");
		List<Product> findAll = service.findAll();

		return findAll;
	}

	// http:localhost:9596/product/create
	// save Product
	@PostMapping("/create")
	public Product postProduc(@RequestBody Product product) {

		Product product1 = service.postProduc(product);
		
		return product1;
	}


	// delete product by product id
	// http://localhost:9596/product/delete/101
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") int id) {
		System.out.println("Delete Product with ID = " + id + "...");

		String s = service.deleteById(id);

		return new ResponseEntity<>(s, HttpStatus.OK);
	}

	// http://localhost:9596/product/update
	@PutMapping("/update/{id}")
	public ResponseEntity<Product> update(@PathVariable("id") int id, @RequestBody Product product) {
		System.out.println("Update Product with ID = " + id + "...");

		Product resp = service.find(id);

		if (resp != null) {

			BeanUtils.copyProperties(product, resp);
			return new ResponseEntity<>(service.postProduc(resp), HttpStatus.OK);
		}

		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}
	
	
	
	@PutMapping("/{id}")
	public ResponseEntity<Product> getvalue(@PathVariable("id") int id) {
		System.out.println("Update Product with ID = " + id + "...");

		Product resp = service.find(id);
System.out.println(resp.getpId());
		if (resp != null) {

//			BeanUtils.copyProperties(product, resp);
			return new ResponseEntity<>(service.postProduc(resp), HttpStatus.OK);
		}

		else
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}
	
	

	

}