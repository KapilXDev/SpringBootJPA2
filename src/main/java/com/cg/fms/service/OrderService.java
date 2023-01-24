package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Orders;


public interface OrderService {

	public Orders getOrder(int orderNumber) throws Exception;

	public String addOrder(Orders order);

	public String updateOrder(Orders order) throws Exception;

	public String deleteOrder(int orderNumber) throws Exception;
	
	public List<Orders> getAllOrders();
}
