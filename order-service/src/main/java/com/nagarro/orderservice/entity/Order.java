package com.nagarro.orderservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ORDER_DB")
public class Order {
	
	 @Id
	 private String id;
	 private String name;
	 private int qty;
	 private double price;
	 
	 
	 
	 
	public Order() {
		
	}
	
	public Order(String id, String name, int qty, double price) {
		
		this.id = id;
		this.name = name;
		this.qty = qty;
		this.price = price;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	 
	 
	
	
}