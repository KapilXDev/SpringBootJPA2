package com.cg.fms.service;

import java.util.List;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.advices.ResourceNotFoundException;
import com.cg.fms.dao.CustomerDao;
import com.cg.fms.dto.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao repo;
	
	@Override
	public Customer serviceGetCustomer(int customerId) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Customer not present in the database");
		return repo.findById(customerId).orElseThrow(s1);
		
	}

	@Override
	public String serviceAddCustomer(Customer customer) {
		// TODO Auto-generated method stub
			repo.save(customer);
			return "Customer Added";
	}

	@Override
	public String serviceUpdateCustomer(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Customer not present in the database");
		Customer c=repo.findById(customer.getCustomerId()).orElseThrow(s1);
		repo.save(customer);
			return "customer updated";
		
	}

	@Override
	public String serviceDeleteCustomer(int customerId) throws Exception {
		// TODO Auto-generated method stub
		Supplier<Exception> s1 = ()->new ResourceNotFoundException("Customer not present in the database");
		Customer c=repo.findById(customerId).orElseThrow(s1);
		repo.delete(c);
			return "deleted";
	}

	@Override
	public List<Customer> serviceGetAllCustomers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	

}
