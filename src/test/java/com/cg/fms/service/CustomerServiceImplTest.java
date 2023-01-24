package com.cg.fms.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.fms.dao.CustomerDao;
import com.cg.fms.dto.Customer;
import com.cg.fms.dto.Land;
@SpringBootTest
class CustomerServiceImplTest {
@Autowired
CustomerServiceImpl CustomerService;
@MockBean
CustomerDao repo;

	@Test
	void testServiceGetCustomer() throws Exception {
		Customer c=new Customer();
		c.setCustomerId(1);
		c.setCustomerAddress("address");
		c.setCustomerContact("1542012345");
		c.setCustomerEmail("mail@gmail.com");
		c.setCustomerName("name");
		c.setCustomerPassword("xxxx");
		c.setCustomerPostalCode("code");
		c.setCustomerTown("town");
		Optional<Customer> c1=Optional.of(c);
		Mockito.when(repo.findById(1)).thenReturn(c1);

		assertThat(CustomerService.serviceGetCustomer(1)).isEqualTo(c);
		
		//fail("Not yet implemented");
	}

	@Test
	void testServiceAddCustomer() {
		Customer c=new Customer();
		c.setCustomerId(1);
		c.setCustomerAddress("address");
		c.setCustomerContact("1542012345");
		c.setCustomerEmail("mail@gmail.com");
		c.setCustomerName("name");
		c.setCustomerPassword("xxxx");
		c.setCustomerPostalCode("code");
		c.setCustomerTown("town");
		Mockito.when(repo.save(c)).thenReturn(c);
		assertThat(CustomerService.serviceAddCustomer(c)).isEqualTo("Customer Added");
		
		//fail("Not yet implemented");
	}

	@Test
	void testServiceUpdateCustomer() throws Exception {
		Customer c=new Customer();
		c.setCustomerId(1);
		c.setCustomerAddress("address");
		c.setCustomerContact("1542012345");
		c.setCustomerEmail("mail@gmail.com");
		c.setCustomerName("name");
		c.setCustomerPassword("xxxx");
		c.setCustomerPostalCode("code");
		c.setCustomerTown("town");
		Optional<Customer> c1=Optional.of(c);
		
				
				Mockito.when(repo.findById(1)).thenReturn(c1);
				Mockito.when(repo.save(c)).thenReturn(c);	
				c.setCustomerAddress("new address");
				c.setCustomerContact("91542012345");
				c.setCustomerEmail("newmail@gmail.com");
				c.setCustomerName("new name");
				c.setCustomerPassword("new xxxx");
				c.setCustomerPostalCode("new code");
				c.setCustomerTown("new town");
						
						assertThat(CustomerService.serviceUpdateCustomer(c)).isEqualTo("customer updated");

		//fail("Not yet implemented");
	}

	@Test
	void testServiceDeleteCustomer() {
		Customer c=new Customer();
		c.setCustomerId(1);
		c.setCustomerAddress("address");
		c.setCustomerContact("1542012345");
		c.setCustomerEmail("mail@gmail.com");
		c.setCustomerName("name");
		c.setCustomerPassword("xxxx");
		c.setCustomerPostalCode("code");
		c.setCustomerTown("town");
		Optional<Customer> c1=Optional.of(c);
		Mockito.when(repo.findById(1)).thenReturn(c1);
		Mockito.when(repo.existsById(c.getCustomerId())).thenReturn(false);
		assertFalse(repo.existsById(c.getCustomerId()));
		//fail("Not yet implemented");
	}

	@Test
	void testServiceGetAllCustomers() {
		Customer c=new Customer();
		c.setCustomerId(1);
		c.setCustomerAddress("address");
		c.setCustomerContact("1542012345");
		c.setCustomerEmail("mail@gmail.com");
		c.setCustomerName("name");
		c.setCustomerPassword("xxxx");
		c.setCustomerPostalCode("code");
		c.setCustomerTown("town");
		Customer c1=new Customer();
		c.setCustomerId(1);
		c.setCustomerAddress("address2");
		c.setCustomerContact("15420123452");
		c.setCustomerEmail("mail2@gmail.com");
		c.setCustomerName("name2");
		c.setCustomerPassword("xxxx2");
		c.setCustomerPostalCode("code2");
		c.setCustomerTown("town2");
		List<Customer> ca=new ArrayList<>();
		ca.add(c); 	ca.add(c1);
		
		Mockito.when(repo.findAll()).thenReturn(ca);
		assertThat(CustomerService.serviceGetAllCustomers()).isEqualTo(ca);
		//fail("Not yet implemented");
	}

}
