package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

	 @Id
	 @GeneratedValue
	 private int productId;
	 private String productName;
	 private float price;
	 private int quantityinstock;
	 private String imagelocation;
	 public Product()
	 {
		 
	 }
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantityinstock() {
		return quantityinstock;
	}
	public void setQuantityinstock(int quantityinstock) {
		this.quantityinstock = quantityinstock;
	}
	public String getImagelocation() {
		return imagelocation;
	}
	public void setImagelocation(String imageocation) {
		this.imagelocation = imageocation;
	}
	 
}
