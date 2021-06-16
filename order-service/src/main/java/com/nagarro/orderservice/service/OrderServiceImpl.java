package com.nagarro.orderservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

import com.nagarro.orderservice.dao.OrderRepository;
import com.nagarro.orderservice.entity.Order;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
    private MessageChannel output;
	
	
	@Override
	public List<Order> findAll() {
		return null;
	}

	@Override
	public Order findById(String id) {
		return null;
	}

	@Override
	public Order save(Order order) {
		
		order.setId(UUID.randomUUID().toString());
		
		output.send(MessageBuilder.withPayload(order).build());
		
		orderRepository.save(order);
		return order;
	}

	@Override
	public void deleteById(String id) {

	}

}
