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

import com.cg.fms.dao.ContractDao;
import com.cg.fms.dto.Contract;
import com.cg.fms.dto.Orders;
@SpringBootTest
class ContractServiceImplTest {
@Autowired
ContractServiceImpl ContractService;
@MockBean
ContractDao repo;

	@Test
	void testGetContract() throws Exception {
		Contract c=new Contract();
		c.setContractNumber(1);
		c.setDeliveryDate("17/08/2021");
		c.setDeliveryPlace("place");
		c.setQuantity("20");
		Optional<Contract> c1=Optional.of(c);
		Mockito.when(repo.findById(1)).thenReturn(c1);

		assertThat(ContractService.getContract(1)).isEqualTo(c);
		
		//fail("Not yet implemented");
	}

	@Test
	void testAddContract() {
		Contract c=new Contract();
		c.setContractNumber(1);
		c.setDeliveryDate("17/08/2021");
		c.setDeliveryPlace("place");
		c.setQuantity("20");
		Mockito.when(repo.save(c)).thenReturn(c);
		assertThat(ContractService.addContract(c)).isEqualTo("added");
		//fail("Not yet implemented");
	}

	@Test
	void testUpdateContract() throws Exception {
		Contract c=new Contract();
		c.setContractNumber(1);
		c.setDeliveryDate("17/08/2021");
		c.setDeliveryPlace("place");
		c.setQuantity("20");
		Optional<Contract> c1=Optional.of(c);
		Mockito.when(repo.findById(1)).thenReturn(c1);
		Mockito.when(repo.save(c)).thenReturn(c);
				
				c.setQuantity("400");	
				c.setDeliveryPlace("new place");
				
				assertThat(ContractService.updateContract(c)).isEqualTo("record updated");
		//fail("Not yet implemented");
	}

	@Test
	void testDeleteContract() {
		Contract c=new Contract();
		c.setContractNumber(1);
		c.setDeliveryDate("17/08/2021");
		c.setDeliveryPlace("place");
		c.setQuantity("20");
		Optional<Contract> c1=Optional.of(c);
		Mockito.when(repo.findById(1)).thenReturn(c1);
		Mockito.when(repo.existsById(c.getContractNumber())).thenReturn(false);
		assertFalse(repo.existsById(c.getContractNumber()));
		//fail("Not yet implemented");
	}

	@Test
	void testGetAllContracts() {
		
				Contract c=new Contract();
				c.setContractNumber(1);
				c.setDeliveryDate("17/08/2021");
				c.setDeliveryPlace("place");
				c.setQuantity("20");
				
				Contract c1=new Contract();
				c.setContractNumber(2);
				c.setDeliveryDate("18/08/2021");
				c.setDeliveryPlace("place2");
				c.setQuantity("200");
				List<Contract> ca=new ArrayList<>();
				ca.add(c); 	ca.add(c1);
				
				Mockito.when(repo.findAll()).thenReturn(ca);
				assertThat(ContractService.getAllContracts()).isEqualTo(ca);
		//fail("Not yet implemented");
	}

}
