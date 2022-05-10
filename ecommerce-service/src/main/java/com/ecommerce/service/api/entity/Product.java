package com.ecommerce.service.api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @NotNull(message = "Id may not be null")
	private int pId;

	// @NotNull(message = "Name may not be null")
	private String pName;

	// @NotNull(message = "Model may not be null")
	private String pModel;

	// @NotNull(message = "Make may not be null" )
	private String pMake;

	// @NotNull(message = "Category may not be null")
	private String pCategory;

	// @NotNull(message = "SubCategory may not be null")
	private String pSubCategory;

	// @NotNull(message = "price may not be null")
	private int pPrice;

	// @NotNull(message = "Quantity may not be null")
	private int pQuantity;

	// @NotNull(message = "Image may not be null")
	private String pImage;

	// @NotNull(message = "Specification may not be null")
	private String pSpecifications;

	// @NotNull

	private int pSellerId;

	// @NotNull(message = "Status may not be null")
	private String pStatus;

	public Product() {
	}

	public Product(int pId, String pName, String pModel, String pMake, String pCategory, String pSubCategory,
			int pPrice, int pQuantity, String pImage, String pSpecifications, int pSellerId, String pStatus) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pModel = pModel;
		this.pMake = pMake;
		this.pCategory = pCategory;
		this.pSubCategory = pSubCategory;
		this.pPrice = pPrice;
		this.pQuantity = pQuantity;
		this.pImage = pImage;
		this.pSpecifications = pSpecifications;
		this.pSellerId = pSellerId;
		this.pStatus = pStatus;
	}

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getpModel() {
		return pModel;
	}

	public void setpModel(String pModel) {
		this.pModel = pModel;
	}

	public String getpMake() {
		return pMake;
	}

	public void setpMake(String pMake) {
		this.pMake = pMake;
	}

	public String getpCategory() {
		return pCategory;
	}

	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}

	public String getpSubCategory() {
		return pSubCategory;
	}

	public void setpSubCategory(String pSubCategory) {
		this.pSubCategory = pSubCategory;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(int pQuantity) {
		this.pQuantity = pQuantity;
	}

	public String getpImage() {
		return pImage;
	}

	public void setpImage(String pImage) {
		this.pImage = pImage;
	}

	public String getpSpecifications() {
		return pSpecifications;
	}

	public void setpSpecifications(String pSpecifications) {
		this.pSpecifications = pSpecifications;
	}

	public int getpSellerId() {
		return pSellerId;
	}

	public void setpSellerId(int pSellerId) {
		this.pSellerId = pSellerId;
	}

	public String getpStatus() {
		return pStatus;
	}

	public void setpStatus(String pStatus) {
		this.pStatus = pStatus;
	}

	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pModel=" + pModel + ", pMake=" + pMake + ", pCategory="
				+ pCategory + ", pSubCategory=" + pSubCategory + ", pPrice=" + pPrice + ", pQuantity=" + pQuantity
				+ ", pImage=" + pImage + ", pSpecifications=" + pSpecifications + ", pSellerId=" + pSellerId
				+ ", pStatus=" + pStatus + "]";
	}

}