package com.cg.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.fms.dto.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer>{
	/*
	public boolean loginCustomer(String customerName, String customerPassword);

	public Customer findCustomer(int customerId);

	public boolean addCustomer(Customer customer);

	public boolean updateCustomer(Customer customer);

	@Query("Delete from Customer a where a.customerId=customerId")
	public boolean deleteCustomer(int customerId);
	
	public List<Customer> findAllCustomers();*/
}
