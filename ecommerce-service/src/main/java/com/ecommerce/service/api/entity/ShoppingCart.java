package com.ecommerce.service.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity

@Table(name = "Sshopping_cart")
//@NoArgsConstructor
//@AllArgsConstructor
public class ShoppingCart {

	@Id
	@GeneratedValue
	private int id;
	private int productid;
	private int purchasequantity;
	private int buyerid;

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
