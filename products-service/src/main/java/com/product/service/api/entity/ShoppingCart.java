package com.product.service.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



@Entity
public class ShoppingCart {
	
	@Id
	@GeneratedValue
	int id ;
	int productid;
	int purchasequantity ;
	int buyerid ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getPurchasequantity() {
		return purchasequantity;
	}
	public void setPurchasequantity(int purchasequantity) {
		this.purchasequantity = purchasequantity;
	}
	public int getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
	


}
