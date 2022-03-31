package com.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	SessionFactory sessionFactory;
	

	

	@Override
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(product);
		session.flush();
		session.getTransaction().commit();
		
	}

	@Override
	public Product findProduct(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		return session.get(Product.class, id);
	}

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		Query query =session.createQuery("Select p from Product p");
		
		return query.list();
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(product);
		session.flush();
		session.getTransaction().commit();
		
		return true;
	}

	@Override
	public boolean deleteProduct(int id) {
		// TODO Auto-generated method stub
		Session session =sessionFactory.openSession();
		session.getTransaction().begin();
		Product product=session.get(Product.class,id);
		session.delete(product);
		session.flush();
		session.getTransaction().commit();
		
		return true;
	}
	
	

}
