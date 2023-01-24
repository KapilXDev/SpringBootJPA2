package com.cg.fms.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cg.fms.dao.AdminDao;
import com.cg.fms.dto.Admin;

@SpringBootTest
public class IAdminServiceImplTest {
	
	@Autowired
	IAdminServiceImpl adminservice;
	@MockBean
	AdminDao repo;


	@Test
	void testGetAdmin() throws Exception {
		Admin a=new Admin();
		a.setAdminid(1);
		a.setAdminName("name");
		a.setAdminPassword("password");
		Optional<Admin> a1=Optional.of(a);
		Mockito.when(repo.findById(1)).thenReturn(a1);

		assertThat(adminservice.getAdmin(1)).isEqualTo(a);
	}
	
	@Test
	void testGetAllAdmins() {
		Admin a=new Admin();
		a.setAdminid(1);
		a.setAdminName("name");
		a.setAdminPassword("password");
		Admin a1=new Admin();
		a.setAdminid(2);
		a.setAdminName("name1");
		a.setAdminPassword("password1");
		List<Admin> la=new ArrayList<>();
		la.add(a); 	la.add(a1);
		Mockito.when(repo.findAll()).thenReturn(la);
		assertThat(adminservice.getAllAdmins()).isEqualTo(la);
	}
	
	@Test
	void testDeleteAdmin() {
		Admin a=new Admin();
		a.setAdminid(1);
		a.setAdminName("name");
		a.setAdminPassword("password");
		Optional<Admin> a1=Optional.of(a);

		Mockito.when(repo.findById(1)).thenReturn(a1);
		Mockito.when(repo.existsById(a.getAdminid())).thenReturn(false);
		assertFalse(repo.existsById(a.getAdminid()));
	}
	
	@Test
	void testUpdateAdmin() throws Exception {
		Admin a=new Admin();
		a.setAdminid(1);
		a.setAdminName("name");
		a.setAdminPassword("password");
		Optional<Admin> a1=Optional.of(a);
		
		Mockito.when(repo.findById(1)).thenReturn(a1);
		
		Mockito.when(repo.save(a)).thenReturn(a);
		
		a.setAdminName("newname"); 	
		a.setAdminPassword("newpassword");
		
		assertThat(adminservice.updateAdmin(a)).isEqualTo("updated");
	}
	
	@Test
	void testAddAdmin() {
		Admin a=new Admin();
		a.setAdminid(1);
		a.setAdminName("name");
		a.setAdminPassword("password");

		Mockito.when(repo.save(a)).thenReturn(a);
		assertThat(adminservice.addAdmin(a)).isEqualTo("added");
	}

	
}
