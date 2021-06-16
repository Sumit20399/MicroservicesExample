package com.nagarro.orderservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.orderservice.entity.Order;


public interface OrderRepository extends JpaRepository<Order, String> {

}
