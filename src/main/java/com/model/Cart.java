package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {
		@Id
		@GeneratedValue
		private int cartId;
		@OneToOne
		private User customer;
		@OneToMany(cascade=CascadeType.ALL)
		private List<Product> productlist;
		private float totalAmount;
		private boolean status;
		public Cart() {}
		
		public int getCartId() {
			return cartId;
		}
		public void setCartId(int cartId) {
			this.cartId = cartId;
		}
		public User getCustomer() {
			return customer;
		}
		public void setCustomer(User customer) {
			this.customer = customer;
		}
		public List<Product> getProductlist() {
			return productlist;
		}
		public void setProductlist(List<Product> productlist) {
			this.productlist = productlist;
		}
		public float getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(float totalAmount) {
			this.totalAmount = totalAmount;
		}
		public boolean isStatus() {
			return status;
		}
		public void setStatus(boolean status) {
			this.status = status;
		}
		
}
