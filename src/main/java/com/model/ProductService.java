package com.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ProductService {
	
	@Autowired 
	ProductDAO productDAOImpl;
	public void addProduct(Product product)
	{
		productDAOImpl.addProduct(product);
	}

	public boolean updateProduct(Product product)
	{
		return productDAOImpl.updateProduct(product);
	}
	public boolean deleteProduct(int id)
	{
		return productDAOImpl.deleteProduct(id);
	}
	public Product findProduct(int id)
	{
		return productDAOImpl.findProduct(id);
		
	}
	public List<Product> findAllProduct()
	{
		return productDAOImpl. findAllProduct();
	}

}
