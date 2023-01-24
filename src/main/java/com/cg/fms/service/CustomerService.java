package com.cg.fms.service;

import java.util.List;

import com.cg.fms.dto.Customer;

public interface CustomerService {
	
	public Customer serviceGetCustomer(int customerId) throws Exception;

	public String serviceAddCustomer(Customer customer);

	public String serviceUpdateCustomer(Customer customer) throws Exception;

	public String serviceDeleteCustomer(int customerId) throws Exception;

	public List<Customer> serviceGetAllCustomers();
}
