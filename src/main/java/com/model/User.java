package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="UserTable")
public class User {
	@Column(name="user_name")
	private String username;
	@Id
	private String email;
	private String password;
	private String shipping_Address;
	private String billing_Address;
	public User() {}
	public String getUsername()
	{
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getShipping_Address() {
		return shipping_Address;
	}
	public void setShipping_Address(String shipping_Address) {
		this.shipping_Address = shipping_Address;
	}
	public String getBilling_Address() {
		return billing_Address;
	}
	public void setBilling_Address(String billing_Address) {
		this.billing_Address = billing_Address;
	}
	
	

	

}
