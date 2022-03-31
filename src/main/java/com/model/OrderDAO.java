package com.model;
import java.util.*;

import org.springframework.stereotype.Component;
@Component
public interface OrderDAO {
	
	public void addOrder(Order order);
	public Order findOrder(int id);
	public List<Order> getAllOrder();
	public boolean updateOrder(Order product);
	public boolean deleteOrder(int id);
	
}
