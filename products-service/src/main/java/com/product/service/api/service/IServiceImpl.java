package com.product.service.api.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.product.service.api.entity.Buyer;
import com.product.service.api.entity.Product;
import com.product.service.api.entity.PurchesHistory;
import com.product.service.api.entity.ShoppingCart;
import com.product.service.api.exception.RecordNotFoundException;
import com.product.service.api.repository.ProductRepo;
import com.product.service.api.repository.PurchaseHistoryRepo;
import com.product.service.api.repository.ShoppingCartRepo;





@Service
public class IServiceImpl implements IService {
	
	@Autowired(required=false)
	ProductRepo repo;
	
//	@Autowired
//	RestTemplate restTemplate;
	
	@Autowired(required=false)
	ShoppingCartRepo crepo;
	
	@Autowired(required=false)
	PurchaseHistoryRepo prepo;
	
	@Autowired(required=false)
	Buyer buyer;
	
	Date date;
	
	//save the recort
	@Override
	public Product postProduc(Product product) {
		Product save = repo.save(product);
		return save;
	}

	//find All the Record
	@Override
	public List<Product> findAll() {
		
		List<Product> findAll = repo.findAll();
		System.out.println("find all"+findAll);
		return findAll;
	}
	
	// Find By Product Id
	@Override
	public Product find(int id) {
		
		Optional<Product> byId = repo.findById(id);
			
				if(byId.isPresent()) {
					Product product = byId.get();
					return product;
				}
	
				else throw  new RecordNotFoundException("Product id '" + id + "' does no exist");
	}

	@Override
	public String addShoppinrgCart(int id ,int quntity) {
	
		Optional<Product> product1 = repo.findById(id);	
		if(product1.isPresent()) {
			Product product = product1.get();
			if(quntity>product.getpQuantity())
				throw  new RecordNotFoundException("that much quantity of Product is not available");
			ShoppingCart cart=new ShoppingCart();
			//cart.setBuyerid(0);
			cart.setProductid(product.getpId());
			cart.setPurchasequantity(quntity);
			crepo.save(cart);		
		}
		else throw  new RecordNotFoundException("Product id '" + id + "' does no exist");
		 
		return "product Added to cart";	
	}


	@Override
	public List<Product> shoppinrgCart() {
		System.out.println("IServiceImpl.shoppinrgCart()");
		
		List<ShoppingCart> all = crepo.findAll();
		
		ArrayList<Product> al=new ArrayList<>();
		
		for(ShoppingCart cart :all) {
			Optional<Product> findById = repo.findById(cart.getProductid());
			Product product=findById.get();
			al.add(product);
		}
		
		return al;
	}


	@Override
	public String removeShoppinrgCart(int id) {
		// TODO Auto-generated method stu
		System.out.println("IServiceImpl.removeShoppinrgCart()");
		
			crepo.deleteById(id);
			
		return "Item Remove Sucessfully";
	}
	
	// Delete Product By Id
	@Override
	public String deleteById(int id) {
		
		Optional<Product> byId = repo.findById(id);
		
		if(byId.isPresent()) {
			repo.deleteById(id);
			return "Product has been deleted!";
		}
		else throw new RuntimeException("No record found for given id: "+id);
		
	}
	
	// Product Histpry
	@Override
	public List<PurchesHistory> history() {
		 List<PurchesHistory> history = prepo.findAll();
		return history;
	}
	
	@Override
	public String purchaseProduct(int id, int quntity) {

		Optional<Product> product1 = repo.findById(id);
		if(product1.isPresent()) {
		
			Product product = product1.get();	
			if(quntity>product.getpQuantity())
				throw  new RecordNotFoundException("that much product not avalable");	
			
			product.setpQuantity(product.getpQuantity()-quntity);
			repo.save(product);
			PurchesHistory cart=new PurchesHistory();			
			cart.setProductId(product.getpId());
			cart.setPrchasequantity(quntity);
			//cart.setBuyerid(buyer.getId());
			cart.setPurchasedate(date=java.util.Calendar.getInstance().getTime());
			prepo.save(cart);
			
		}
		 else throw  new RecordNotFoundException("Product id '" + id + "' does no exist");
		 
		return " Product Purchase Successfully";	
	}


	
//	public ResponseTemplateVO getUserWithDepartment(Integer userId) {
//	ResponseTemplateVO vo = new ResponseTemplateVO();
//	Buyer user = repo.findByUserId(userId);
//	Product product =
//			restTemplate.getForObject("http://localhost:8083/product/getproduct" + buyer.getId(), Product.class);
//	vo.setBuyer(buyer);
//	vo.setProduct(product);
//	return vo;
//	}

	


	
}
