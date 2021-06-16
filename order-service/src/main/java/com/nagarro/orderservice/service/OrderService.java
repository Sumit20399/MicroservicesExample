package com.nagarro.orderservice.service;

import java.util.List;

import com.nagarro.orderservice.entity.Order;

public interface OrderService {
	
	public List<Order> findAll();
	
	public Order findById(String id);
	
	public Order save(Order order);
	
	public void deleteById(String id);

}
